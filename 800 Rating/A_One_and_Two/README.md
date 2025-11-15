# One and Two

## Problem Statement

You are given a sequence a of length n where each element is either 1 or 2.

Find an integer k (1 ≤ k ≤ n - 1) such that the product of the first k elements equals the product of the remaining elements.

If multiple such k exist, print the smallest. If none exist, print -1.

## Input Format

The first line contains an integer t (1 ≤ t ≤ 1000) — the number of test cases.

For each test case:
- The first line contains an integer n (2 ≤ n ≤ 100)
- The second line contains n integers a[1], a[2], ..., a[n], each either 1 or 2

## Output Format

Print a single integer: the smallest k satisfying the condition, or -1 if no such k exists.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 2 ≤ n ≤ 100
- a[i] in {1, 2}

## Sample Test Cases

### Input
```
5
5
1 2 2 2 1
6
1 2 1 1 2 2
3
1 1 1
3
2 2 2
4
2 2 1 1
```

### Output
```
4
3
1
2
-1
```

## Explanation

**Test Case 1:** k=4 splits into [1,2,2,2] and [1], product both equal 8.

**Test Case 2:** k=3 splits into [1,2,1] and [1,2,2] both product 2.

**Test Case 3:** k=1 splits into [1] and [1,1], product 1.

**Test Case 4:** k=2 splits into [2,2] and [2], products 4 and 2, so no solution exists until k=2, answer 2.

**Test Case 5:** No k satisfies the condition, answer -1.
