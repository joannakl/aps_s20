---
layout: default
---

## Gradescope Problem Grading (Homework Assignments and Exams)

All problems in this course expect input to be provided to the program as standard input (or `stdin`). All programs should write the output to standard output (or `stdout`).
Each program solution to a given problem will be evaluated on several hidden tests. The test results will be shown (but not the tests themselves).

The solutions to the problems have to be implemented in C, C++ or Java. The program
has to be saved in a file named `main.c`, `main.cpp` or `Main.java` (according to the programming language).
Some of the assignments may have further restrictions on the programming language in which
the solutions should be implemented.

The autograder for this class is designed to assign partial credit (unlike many automated online judge platforms that you might be familiar with). It evaluates each test
individually and assigns scores per test.

There are several different outcomes possible:
- **passed test** - the program produced the expected answer within the allotted time
- **failed test**
    - **wrong answer** - the program produced incorrect answer
    - **runtime error** - the program crashed during the execution
    - **timeout error** - the program took too long and was terminated before it completed
    - **presentation error** - the program produced correct answer, but the way the answer is shown does not follow the specification of the problem

## Homework problems

Every homework program is graded out of 20 points (assuming that the problem set contains five problems). The total homework grade is the sum of all the scores on individual problems. Each problem has the same weight.

The total score for a problem is determined by the maximum between zero and the sum of scores for individual tests based on their results. The maximum score for each test is determined by *max_score = 20/number_of_tests*.

| test outcome | test score |
|:---|---:|
| passed test | *max_score* |
| wrong answer | *- max_score* |
| runtime error | *- max_score* |
| timeout error | *- 0.5 max_score* |
| presentation error | *0.5 max_score* |

(The program needs to pass more than half of the tests to receive a non-zero score.)

## Exam problems

Every exam problem is graded out of 10 points. The total exam grade is the weighted sum computed as follows (assume _scoreN_ is a score for a particular problem with _score1_ >= _score2_ >= _score3_ >= _score4_):

If you are given 5 problems and suppose to solve four of them, then the exam grade is calculated as:
_exam =  4 * score1 + 3 * score2 + 2 * score3 + 1 * score4_

If you are given 4 problem and suppose to solve three of them, then the exam grade is calculated as:
_exam =  5 * score1 + 3 * score2 + 2 * score3_

The total score for a problem is determined by the maximum between zero and the sum of scores for individual tests based on their results. The maximum score for each test is determined by *max_score = 10/number_of_tests*.

| test outcome | test score |
|:---|---:|
| passed test | *max_score* |
| wrong answer | *- max_score* |
| runtime error | *- max_score* |
| timeout error | *- 0.5 max_score* |
| presentation error | *0.5 max_score* |
