# Twin Permutations

## Problem Statement

Given a permutation a of size n, find a permutation b of the same size such that for all i from 1 to n:

    a[i] + b[i] = n + 1

If there are multiple solutions, print any.

## Input Format

The first line contains an integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case contains two lines:
- The first contains n (1 ≤ n ≤ 50) — the size of the permutation.
- The second contains the permutation a, a sequence of integers from 1 to n.

## Output Format

For each test case, print the permutation b.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 1 ≤ n ≤ 50
- a is a permutation of numbers from 1 to n

## Sample Test Cases

### Input
```
3
3
1 2 3
4
1 2 3 4
5
1 2 3 4 5
```

### Output
```
3 2 1
4 3 2 1
5 4 3 2 1
```

## Explanation

For each i, a[i]+b[i] = n+1 holds. The values printed are valid examples.
