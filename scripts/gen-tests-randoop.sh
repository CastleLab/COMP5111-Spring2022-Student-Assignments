#!/usr/bin/env bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )"
ROOT_DIR=$DIR/..
RANDOOP_JAR="$ROOT_DIR"/lib/randoop-all-4.2.7.jar

# build java class
cd "$ROOT_DIR" || exit
mvn clean compile

ClassUnderTest=comp5111.assignment.cut.Subject
JunitPackage=comp5111.assignment.cut

for (( i = 0; i < 5; i++ )); do
  rm -rf "$ROOT_DIR/src/test/randoop$i"
  java -classpath "$RANDOOP_JAR:$ROOT_DIR/target/classes" randoop.main.Main gentests \
    --randomseed "$i" \
    --testclass="$ClassUnderTest" \
    --output-limit=5000 \
    --junit-output-dir="$ROOT_DIR/src/test/randoop$i" \
    --junit-package-name="$JunitPackage" \
    --error-test-basename="Error_${i}_Test" \
    --regression-test-basename="Regression_${i}_Test" \
    --deterministic \
    --time-limit=0
done

