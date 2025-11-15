# Goals of Victory

## Problem Statement

There are n teams competing in a football tournament. Each team plays with every other team exactly once.

For each team except one, you are given the efficiency, defined as the difference between the number of goals scored by that team and the number of goals conceded by the team throughout the tournament.

You need to find the efficiency of the missing team.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 1000) — the number of test cases.

For each test case:
- The first line contains an integer n (2 ≤ n ≤ 100) — the number of teams
- The second line contains n-1 integers a_1, a_2, ..., a_{n-1} — the efficiencies of n-1 teams

## Output Format

For each test case, print the efficiency of the missing team.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 2 ≤ n ≤ 100
- -1000 ≤ a_i ≤ 1000

## Sample Test Cases

### Input
```
2
4
3 -4 5
3
5 8
```

### Output
```
-4
-13
```

## Explanation

**Test Case 1:**
Four teams compete. Efficiencies of 3 teams are 3, -4, and 5. Since the sum of efficiencies in a tournament must be zero, the missing team's efficiency is -(3 + (-4) + 5) = -4.

**Test Case 2:**
Three teams compete. Efficiencies of 2 teams are 5 and 8. The missing team's efficiency is -(5 + 8) = -13.
