# Serval and Mocha's Array

## Problem Statement

You are given an array a consisting of n positive integers.

An array is called good if for every prefix of length at least 2, the greatest common divisor (GCD) of all the elements in that prefix is less than or equal to the length of the prefix.

An array is called beautiful if it is good and also for every pair of consecutive elements, the GCD of those two is not greater than 2.

Determine whether the given array is beautiful.

## Input Format

The first line contains an integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case consists of two lines:
- The first line contains an integer n (2 ≤ n ≤ 100) — the length of the array.
- The second line contains n integers a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 10^9) — the elements of the array.

## Output Format

For each test case, print "YES" if the array is beautiful, otherwise print "NO".

You can print the answers in any case (e.g., "Yes", "no", "YES" all are acceptable).

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 2 ≤ n ≤ 100
- 1 ≤ a[i] ≤ 10^9

## Sample Test Cases

### Input
```
3
3
1 2 3
3
3 6 9
4
1 2 4 8
```

### Output
```
YES
NO
NO
```

## Explanation

**Test Case 1:** All prefixes have GCD ≤ length and GCD of consecutive pairs ≤ 2, so the array is beautiful.

**Test Case 2:** Prefixes have GCDs greater than their lengths in some cases, so not beautiful.

**Test Case 3:** Prefixes or consecutive pairs violate the conditions.
