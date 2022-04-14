#!/bin/bash

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd)"
cd "$DIR"/.. || exit

for (( i = 0; i < 3; i++ )); do
    arguments="$i "
    arguments=$arguments"comp5111.assignment.cut.Regression_0_Test "
    arguments=$arguments'comp5111.assignment.cut.Subject '
    arguments=$arguments'comp5111.assignment.cut.Subject$BooleanUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$PrimUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$PrimUtils$IntComparator '
    arguments=$arguments'comp5111.assignment.cut.Subject$StrUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$StringUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$HeapSort '
    arguments=$arguments'comp5111.assignment.cut.Subject$UrlUtils '
    arguments=$arguments'comp5111.assignment.cut.Subject$Check'


    mvn clean compile exec:java -Dexec.mainClass="comp5111.assignment.Assignment1" \
    -Dexec.args="$arguments"
done
