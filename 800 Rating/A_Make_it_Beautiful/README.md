# Make it Beautiful

## Problem Statement

You are given an array b of length n.

You can perform the following operation any number of times (including zero):
- Select two different indices i and j (1 ≤ i, j ≤ n) such that b[i] ≠ b[j]
- Set b[i] = b[j]

Determine whether it is possible to make all elements of the array equal using these operations.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case consists of two lines:
- The first line contains an integer n (1 ≤ n ≤ 50) — the length of the array.
- The second line contains n integers b[1], b[2], ..., b[n] (1 ≤ b[i] ≤ 10^9).

## Output Format

For each test case, print "YES" if it is possible to make all elements equal, otherwise print "NO".

You can print the answers in any case (eg., "Yes", "no", "YES" all are acceptable).

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 1 ≤ n ≤ 50
- 1 ≤ b[i] ≤ 10^9

## Sample Test Cases

### Input
```
5
3
1 2 2
4
2 2 2 2
2
10 50
1
1000000000
5
1 2 3 4 5
```

### Output
```
YES
YES
YES
YES
YES
```

## Explanation

In all test cases, it is possible to make all elements equal by repeatedly applying the operation:
- Either elements are already equal or can be made equal by copying values between elements.
