# Jagged Swaps

## Problem Statement

You are given a permutation a of length n.

You are allowed to swap any two adjacent elements with different parity.

Determine whether it is possible to sort the permutation in non-decreasing order by performing some (possibly zero) of the allowed swaps.

## Input Format

The first line contains an integer t (1 ≤ t ≤ 10⁴) — the number of test cases.

Each test case consists of two lines:
- The first line contains an integer n (1 ≤ n ≤ 50) — the length of the permutation.
- The second line contains n integers a_1, a_2, ..., a_n — the permutation elements.

## Output Format

For each test case, print "YES" if it is possible to sort the permutation by allowed swaps, otherwise print "NO".

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10⁴
- 1 ≤ n ≤ 50
- The permutation a contains each integer from 1 to n exactly once.

## Sample Test Cases

### Input
```
4
2
1 2
3
3 2 1
4
1 3 2 4
2
2 1
```

### Output
```
YES
NO
YES
NO
```

## Explanation

**Test Case 1:** Already sorted.

**Test Case 2:** Cannot be sorted with allowed swaps.

**Test Case 3:** Can be sorted by swapping 3 and 2.

**Test Case 4:** Cannot be sorted with allowed swaps.
