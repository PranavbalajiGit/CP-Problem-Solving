# Extremely Round

## Problem Statement

You are given an integer n.

A positive integer is called extremely round if it has only one non-zero digit.
For example: 5000, 4, 1, 10, 200 are extremely round integers.
But 42, 13, 666, 77, 101 are not.

Your task is to calculate the number of extremely round integers x such that 1 ≤ x ≤ n.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 10⁴) — the number of test cases.

Each test case contains a single integer n (1 ≤ n ≤ 999999).

## Output Format

For each test case, print one integer — the number of extremely round integers x such that 1 ≤ x ≤ n.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10⁴
- 1 ≤ n ≤ 999999

## Sample Test Cases

### Input
```
5
9
42
13
100
111
```

### Output
```
9
13
12
19
20
```

## Explanation

**Test Case 1:** n=9
The extremely round numbers between 1 and 9 are all single digits: 1,2,3,4,5,6,7,8,9. Answer: 9

**Test Case 2:** n=42
All 1-digit numbers (9 of them: 1-9), and numbers like 10, 20, 30, 40 (10, 20, 30, 40) and so on. For each power of ten, numbers like 10, 20, 30, ..., 40. There are 9 (1-digit) + 4 (10,20,30,40) = 13.
