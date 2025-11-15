# Walking Master

## Problem Statement

You are playing a game where you start at coordinate 0 on a number line.

Your objective is to reach coordinate x.

The game is played in n steps. At each step i, you can choose to move either left by a[i] units or right by a[i] units.

Determine if it is possible to reach coordinate x after exactly n steps.

## Input Format

The first line contains an integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case consists of two lines:
- The first line contains two integers n and x (1 ≤ n ≤ 100, -10^4 ≤ x ≤ 10^4) — number of steps and target coordinate.
- The second line contains n integers a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 100).

## Output Format

For each test case, print "YES" if it is possible to reach x after n steps, else print "NO".

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 1 ≤ n ≤ 100
- -10^4 ≤ x ≤ 10^4
- 1 ≤ a[i] ≤ 100

## Sample Test Cases

### Input
```
3
2 2
1 1
3 1
1 2 1
4 0
1 2 3 4
```

### Output
```
YES
YES
NO
```

## Explanation

**Test Case 1:** Move right twice.

**Test Case 2:** Move right, left, right.

**Test Case 3:** No sequence of moves leads to 0.
