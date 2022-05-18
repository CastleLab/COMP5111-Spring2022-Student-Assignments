#!/bin/bash

DIR=$( cd "$(dirname "$0")" >/dev/null 2>&1 || exit ; pwd -P )
ROOT_DIR="$DIR"/..
cd "$DIR"/.. || exit

# returns the JDK version.
# 8 for 1.8.0_nn, 9 for 9-ea etc, and "no_java" for undetected
jdk_version() {
  local result
  local java_cmd
  if [[ -n $(type -p java) ]]
  then
    java_cmd=java
  elif [[ (-n "$JAVA_HOME") && (-x "$JAVA_HOME/bin/java") ]]
  then
    java_cmd="$JAVA_HOME/bin/java"
  fi
  local IFS=$'\n'
  # remove \r for Cygwin
  local lines=$("$java_cmd" -Xms32M -Xmx32M -version 2>&1 | tr '\r' '\n')
  if [[ -z $java_cmd ]]
  then
    result=no_java
  else
    for line in $lines; do
      if [[ (-z $result) && ($line = *"version \""*) ]]
      then
        local ver=$(echo $line | sed -e 's/.*version "\(.*\)"\(.*\)/\1/; 1q')
        # on macOS, sed doesn't support '?'
        if [[ $ver = "1."* ]]
        then
          result=$(echo $ver | sed -e 's/1\.\([0-9]*\)\(.*\)/\1/; 1q')
        else
          result=$(echo $ver | sed -e 's/\([0-9]*\)\(.*\)/\1/; 1q')
        fi
      fi
    done
  fi
  echo "$result"
}
if [ "$(jdk_version)" != 11 ]; then
  echo "current jdk version is $(jdk_version), not using java 11"
  exit 1
fi

rm -rf "$ROOT_DIR"/raw-classes

if [ ! -d "$ROOT_DIR"/raw-classes ]; then
    mkdir -p "$ROOT_DIR"/raw-classes
fi
# compile class under test
echo "compiling comp5111.assignment.cut.Subject ..."
javac -g -classpath .:"$ROOT_DIR"/raw-classes -d "$ROOT_DIR"/raw-classes \
"$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

# test generation using evosuite
# We set the output directory to maven test source folder
echo "generating evosuite0 ..."
evosuiteNum=0
echo $ROOT_DIR
java -jar "$ROOT_DIR"/lib/evosuite-1.2.0.jar -class comp5111.assignment.cut.Subject -projectCP .:"$ROOT_DIR"/raw-classes -criterion branch -Dsearch_budget=30
mv evosuite-tests src/test/asg2-grade

# echo "generating evosuite1 ..."
# evosuiteNum=1
# echo $ROOT_DIR
# java -jar "$ROOT_DIR"/lib/evosuite-1.2.0.jar -class comp5111.assignment.cut.Subject -projectCP .:"$ROOT_DIR"/raw-classes -criterion branch -Dsearch_budget=30
# mv evosuite-tests src/test/fault-revealing-evosuite$evosuiteNum

# echo "generating evosuite2 ..."
# evosuiteNum=2
# echo $ROOT_DIR
# java -jar "$ROOT_DIR"/lib/evosuite-1.2.0.jar -class comp5111.assignment.cut.Subject -projectCP .:"$ROOT_DIR"/raw-classes -criterion branch -Dsearch_budget=30
# mv evosuite-tests src/test/fault-revealing-evosuite$evosuiteNum
