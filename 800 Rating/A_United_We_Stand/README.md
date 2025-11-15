# United We Stand

## Problem Statement

You are given an array of n integers, representing the strength of n people.

People can be grouped into teams of size two.

The strength of a team is the maximum strength among the two members.

Your task is to find the minimum possible maximum strength of any team after optimal pairing.

## Input Format

The first line contains an integer t (1 ≤ t ≤ 10^4) — the number of test cases.

Each test case consists of two lines:
- The first line contains an even integer n (2 ≤ n ≤ 100) — the number of people.
- The second line contains n integers a[1], a[2], ..., a[n] (1 ≤ a_i ≤ 100) — the strengths of the people.

## Output Format

For each test case, print the minimum possible maximum team strength after pairing.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10^4
- 2 ≤ n ≤ 100, n is even
- 1 ≤ a_i ≤ 100

## Sample Test Cases

### Input
```
2
4
1 2 3 4
6
1 10 2 9 3 8
```

### Output
```
3
9
```

## Explanation

**Test Case 1:**
Pair (1,2) and (3,4) or (2,3) and (1,4), maximum strength is 3.

**Test Case 2:**
One optimal pairing: (1,2), (3,8), (9,10), max strength 9.
