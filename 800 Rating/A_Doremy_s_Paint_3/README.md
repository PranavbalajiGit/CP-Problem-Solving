# Doremy's Paint 3

## Problem Statement

You are given an array b of n positive integers.

An array is called "good" if for every i (1 ≤ i ≤ n-1), the sum b[i] + b[i+1] is equal (i.e., all the sums of two adjacent elements are the same).

You are given a permutation of the array. You are allowed to rearrange the elements in any order.

Determine if it is possible to rearrange the given array into a "good" array.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 10^4) — the number of test cases.

For each test case:
- The first line contains one integer n (2 ≤ n ≤ 10^5).
- The second line contains n integers b[1], b[2], ..., b[n] (1 ≤ b[i] ≤ 10^9).

## Output Format

For each test case, print "YES" if it is possible to rearrange the array to become good, or "NO" otherwise.

You can print each letter in any case (YES, yes, Yes, etc.).

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10^4
- 2 ≤ n ≤ 10^5
- 1 ≤ b[i] ≤ 10^9
- The sum of n over all test cases does not exceed 2·10^5

## Sample Test Cases

### Input
```
6
2
1 2
3
1 1 2
3
1 3 1
3
1 2 3
4
2 2 2 2
4
1 2 2 1
```

### Output
```
YES
YES
NO
NO
YES
YES
```

## Explanation

**Test Case 1:** n=2, b=[1,2]
You can rearrange the array as [1,2]. Adjacent sums: 1+2=3. Only one sum, the condition is trivially satisfied. Answer: YES

**Test Case 2:** n=3, b=[1,1,2]
You can arrange as [1,2,1]. The sums will be 1+2=3, 2+1=3. All sums are the same. Answer: YES

**Test Case 3:** n=3, b=[1,3,1]
No arrangement will give all adjacent sums equal. Answer: NO

**Test Case 4:** n=3, b=[1,2,3]
No arrangement will satisfy all adjacent sums equal. Answer: NO

**Test Case 5:** n=4, b=[2,2,2,2]
All sums will always be 4. Answer: YES

**Test Case 6:** n=4, b=[1,2,2,1]
Arrange as [1,2,1,2]. Adjacent sums are 1+2=3, 2+1=3, 1+2=3. All sums same. Answer: YES
