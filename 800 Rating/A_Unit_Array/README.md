# Unit Array

## Problem Statement

You are given an array consisting of n integers.

Determine if it's possible to make all elements in the array equal to 1 by repeatedly performing the following operation:

- Select any element greater than 1 and replace it with any positive integer divisor of that element (divisor must be less than the element).

## Input Format

The first line contains an integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case consists of two lines:
- The first line contains an integer n (1 ≤ n ≤ 100) — the length of the array.
- The second line contains n integers a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 100).

## Output Format

For each test case, print "YES" if it's possible to make all elements equal to 1 after some (possibly zero) operations, otherwise print "NO".

You can print the answers in any case.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 1 ≤ n ≤ 100
- 1 ≤ a[i] ≤ 100

## Sample Test Cases

### Input
```
5
3
2 2 1
5
1 2 3 4 5
3
3 5 7
2
1 1
1
100
```

### Output
```
YES
NO
NO
YES
NO
```

## Explanation

- In the first test case, repeatedly replace 2 with 1.
- In the second and third test cases, it's impossible to reduce all elements to 1.
- In the fourth, all elements are already 1.
- In the fifth, 100 cannot be reduced to 1 via divisors less than itself in the given operations.
