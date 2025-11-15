# Two Permutations

## Problem Statement

You are given three integers n, a, and b.

Determine if there exist two permutations p and q of length n such that:
- The number of positions where p[i] = a is exactly one.
- The number of positions where q[i] = b is exactly one.
- For all positions i, p[i] != q[i].

If such permutations exist, print "YES" and the permutations, otherwise print "NO".

## Input Format

The first line contains an integer t (1 ≤ t ≤ 10^4) — the number of test cases.

Each test case contains three integers n, a, and b (1 ≤ a, b ≤ n ≤ 100).

## Output Format

For each test case, print "YES" followed by two lines with permutations p and q if they exist, or "NO" otherwise.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10^4
- 1 ≤ a, b ≤ n ≤ 100

## Sample Test Cases

### Input
```
3
3 1 2
3 2 2
3 1 1
```

### Output
```
YES
1 3 2
2 1 3
NO
NO
```

## Explanation

**Test Case 1:**
Possible permutations p=[1,3,2], q=[2,1,3] satisfy all conditions.

**Test Case 2 and 3:**
No such permutations exist.
