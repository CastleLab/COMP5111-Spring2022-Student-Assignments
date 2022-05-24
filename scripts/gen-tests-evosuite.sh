#!/usr/bin/env bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
ROOT_DIR=$DIR/..
EVOSUITE_JAR="$ROOT_DIR"/lib/evosuite-1.2.0.jar

# build java class
cd "$ROOT_DIR" || exit
mvn clean compile

for (( i = 0; i < 5; i++ )); do
  rm -rf "$ROOT_DIR/src/test/evosuite$i"
  java \
    -jar "$EVOSUITE_JAR" \
    -target "$ROOT_DIR/target/classes" \
    -Dsearch_budget=10 \
    -class comp5111.assignment.cut.Subject \
    -generateSuite \
    -base_dir "$ROOT_DIR"/src/test \
    -Dtest_dir="evosuite$i" \
    -Djunit_suffix="_${i}_ESTest" \
    -Djunit_failed_suffix="_${i}_Failed_ESTest"
done
