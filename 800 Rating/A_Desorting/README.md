# Problem 1853A - Desorting

## Problem Statement

You are given an array `a` of `n` integers. The array is considered sorted in non-decreasing order if for all `i` from `1` to `n-1`, the condition `a[i] ≤ a[i+1]` holds.

In one operation, you can:
- Choose an index `i` (1 ≤ i < n)
- Add 1 to all elements from `a[1]` to `a[i]`
- Subtract 1 from all elements from `a[i+1]` to `a[n]`

Your task is to find the minimum number of operations required to make the array **not sorted** (i.e., to make it so that there exists at least one index `i` where `a[i] > a[i+1]`).

If the array is already not sorted, the answer is 0.

## Input Format

The first line contains a single integer `t` — the number of test cases.

For each test case:
- The first line contains an integer `n` — the length of the array
- The second line contains `n` integers `a[1], a[2], ..., a[n]` — the elements of the array

## Output Format

For each test case, output a single integer — the minimum number of operations required to make the array not sorted.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10⁴
- 2 ≤ n ≤ 10⁵
- 1 ≤ a[i] ≤ 10⁹
- The sum of n over all test cases does not exceed 10⁵

## Sample Test Cases

### Input
```
4
2
1 2
4
1 8 10 13
3
2 2 2
5
1 2 1 2 3
```

### Output
```
1
2
1
0
```

## Explanation

**Test Case 1:** n=2, a=[1, 2]  
The array is sorted. After 1 operation (choosing i=1), the array becomes [2, 1], which is not sorted. Answer: 1

**Test Case 2:** n=4, a=[1, 8, 10, 13]  
The array is sorted. The minimum difference between consecutive elements is 2 (between 8 and 10). We need ⌊2/2⌋ + 1 = 2 operations to break the sorted order. Answer: 2

**Test Case 3:** n=3, a=[2, 2, 2]  
The array is sorted (all elements are equal). After 1 operation, we can make at least one element greater than its neighbor. Answer: 1

**Test Case 4:** n=5, a=[1, 2, 1, 2, 3]  
The array is already not sorted (a[2] > a[3], since 2 > 1). No operations are needed. Answer: 0
