# How Much Does Daytona Cost

## Problem Statement

You are given an array a consisting of n integers.
You are also given an integer k.

Define an integer x to be the most common on a subsegment if the number of occurrences of x on that subsegment is larger than the number of occurrences of any other integer on that subsegment.

Determine whether there exists a non-empty subsegment of a such that the most common integer on that subsegment is k.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 1000) — the number of test cases.

Each test case has two lines:
- The first line contains two integers n and k (1 ≤ k ≤ n ≤ 100)
- The second line contains n integers a_1, a_2, ..., a_n (1 ≤ a_i ≤ n)

## Output Format

For each test case, print "YES" if there exists such a subsegment, or "NO" otherwise.

You can print each letter in any case.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 1 ≤ k ≤ n ≤ 100
- 1 ≤ a_i ≤ n

## Sample Test Cases

### Input
```
5
5 4
1 2 4 5 4
6 5
1 2 3 4 5 6
1 1
1
3 3
1 2 3
4 4
1 4 4 1
```

### Output
```
YES
NO
YES
YES
YES
```

## Explanation

**Test Case 1:**
Subsegment [4], 4 is most common and equals k=4.

**Test Case 2:**
No subsegment where 5 is the most frequent number.

**Test Case 3:**
One element subsegment [1] is equal to k=1.

**Test Case 4:**
Subsegment [3], 3 is equal to k=3.

**Test Case 5:**
Subsegment [4,4], 4 is the most common and equals k=4.
