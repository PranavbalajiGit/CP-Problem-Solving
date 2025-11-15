# Coins

## Problem Statement

In Berland, there are two types of coins having denominations of **2** burles and **k** burles.

Your task is to determine whether it is possible to represent **n** burles using these coins. In other words, you need to check whether there exist **non-negative integers** `x` and `y` such that:

**2·x + k·y = n**

## Input Format

The first line contains a single integer `t` (1 ≤ t ≤ 10⁴) — the number of test cases.

Each test case consists of a single line containing two integers `n` and `k` (1 ≤ k ≤ n ≤ 10¹⁸) — the target amount and the second coin denomination.

## Output Format

For each test case, print:
- **YES** if it is possible to represent `n` burles using coins of denominations 2 and `k`
- **NO** otherwise

## Constraints

- Time Limit: 2000 ms
- Memory Limit: 262144 KB
- 1 ≤ t ≤ 10⁴
- 1 ≤ k ≤ n ≤ 10¹⁸

## Sample Test Cases

### Input
```
4
5 3
6 1
7 4
8 8
```

### Output
```
YES
YES
NO
YES
```

## Explanation

**Test Case 1:** n=5, k=3  
We can use x=1 coin of denomination 2 and y=1 coin of denomination 3: 2·1 + 3·1 = 5 ✓

**Test Case 2:** n=6, k=1  
When k=1, we can make any denomination. For example: 2·0 + 1·6 = 6 ✓

**Test Case 3:** n=7, k=4  
Both 2 and 4 are even, so we can only make even sums. It's impossible to make 7 (odd) ✗

**Test Case 4:** n=8, k=8  
We can use x=0 coins of denomination 2 and y=1 coin of denomination 8: 2·0 + 8·1 = 8 ✓


