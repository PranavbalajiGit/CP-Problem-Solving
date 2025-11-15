# Everybody Likes Good Arrays

## Problem Statement

You are given an array a with n integers.

An array is called "good" if for each pair of adjacent elements a[i] and a[i+1], they have different parity, i.e., one is odd and the other is even.

You can choose any two adjacent elements of the same parity and replace both with their product (which counts as one operation and shortens the array by one element).

Find the minimum number of operations needed to make the given array good.

## Input Format

The first line contains one integer t (1 ≤ t ≤ 10^4) — the number of test cases.

Each test case consists of two lines:
- The first line contains a single integer n (2 ≤ n ≤ 2*10^5) — the length of the array.
- The second line contains n integers a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 10^9).

## Output Format

For each test case, print one integer — the minimum number of operations needed to make the array good.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10^4
- 2 ≤ n ≤ 2*10^5
- 1 ≤ a[i] ≤ 10^9
- The sum of n over all test cases does not exceed 2*10^5

## Sample Test Cases

### Input
```
4
5
1 2 3 4 5
3
2 4 6
2
1 1
7
3 2 5 6 9 8 7
```

### Output
```
0
2
1
3
```

## Explanation

**Test Case 1:** n=5, a=[1,2,3,4,5]  
All adjacent elements differ in parity, so it is already good. Answer: 0

**Test Case 2:** n=3, a=[2,4,6]  
All elements are even, so both adjacent pairs share the same parity. It takes 2 operations to make the array good. Answer: 2

**Test Case 3:** n=2, a=[1,1]  
Both elements are odd, so they share the same parity. One operation needed. Answer: 1

**Test Case 4:** n=7, a=[3,2,5,6,9,8,7]  
There are several places where adjacent elements share the same parity; 3 operations are needed. Answer: 3
