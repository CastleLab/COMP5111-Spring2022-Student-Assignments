#!/bin/bash

DIR=$( cd "$(dirname "$0")" >/dev/null 2>&1 || exit ; pwd -P )
ROOT_DIR="$DIR"/..
cd "$ROOT_DIR" || exit
rm -rf "$ROOT_DIR"/logs "$ROOT_DIR"/target
metric="ochiai"  # ochiai tarantula jaccard ample
REPORT_DIR="$ROOT_DIR"/src/test/report
mkdir -p $REPORT_DIR
for metric in ochiai tarantula jaccard ample
do
  echo working on metric: $metric
  for testSuite in Subject_FaultRevealing3_ESTest
#   for testSuite in Subject_FaultRevealing0_ESTest Subject_FaultRevealing1_ESTest Subject_FaultRevealing2_ESTest Regression_0_Test0 Regression_1_Test0 Regression_2_Test0
  # fault-revealing-evosuite0 fault-revealing-evosuite1 fault-revealing-evosuite2 fault-revealing-randoop0 fault-revealing-randoop1 fault-revealing-randoop2
  # to run manually written test suites: assign testSuite to be: refined-[randoop|evosuite][0-2], e.g. testSuite=refined-randoop0
  do
    echo working on testSuite: $testSuite
    # arguments='0 '
    arguments="$metric "  # argument for suspicious score metric
    arguments=$arguments"$REPORT_DIR "  # report dir
    arguments=$arguments"comp5111.assignment.cut.$testSuite "  # argument for testSuite
    arguments=$arguments'comp5111.assignment.cut.Subject '
    arguments=$arguments'comp5111.assignment.cut.Subject$BooleanUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$PrimUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$PrimUtils$IntComparator '
    arguments=$arguments'comp5111.assignment.cut.Subject$StrUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$StringUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$HeapSort '
    arguments=$arguments'comp5111.assignment.cut.Subject$UrlUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$Check'
    # 2. we compile the classes to instrument Subject and count invocations using soot
    if [ ! -d "$ROOT_DIR"/logs ]; then
      mkdir -p "$ROOT_DIR"/logs
    fi
    # 3. we run the main method of comp5111.assignment.Assignment2
    if [ ! -d "$ROOT_DIR"/logs/"$testSuite" ]; then
        mkdir -p "$ROOT_DIR"/logs/"$testSuite"
    fi
    # java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/target/classes comp5111.assignment.Assignment2 $arguments  > "$ROOT_DIR"/logs/$testSuite/stmt_${metric}_coverage.log
    mvn clean compile exec:java -Dexec.mainClass="comp5111.assignment.Assignment2" -Dexec.args="$arguments" > "$ROOT_DIR"/logs/$testSuite/${testSuite}_${metric}_coverage.log
  done
done