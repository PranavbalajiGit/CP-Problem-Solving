# Line Trip

## Problem Statement

You start at position 0 on a number line and want to make a trip to position x and back to 0.

There are n gas stations on the number line, at positions a[1], a[2], ..., a[n].

Your car consumes 1 liter of fuel per unit distance and has an unlimited fuel tank capacity.

You can refuel only at gas stations and at the start (position 0), but not at the destination (position x).

Determine the minimum initial amount of fuel needed in your tank so that you can complete the round trip without running out of fuel.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 100) — the number of test cases.

For each test case:
- The first line contains two integers n and x (1 ≤ n ≤ 100, 1 ≤ x ≤ 100) — the number of gas stations and the destination position.
- The second line contains n integers a[1], a[2], ..., a[n] (0 < a[i] < x) — the positions of the gas stations.

## Output Format

For each test case, output the minimum initial fuel amount needed.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 100
- 1 ≤ n ≤ 100
- 1 ≤ x ≤ 100
- 0 < a[i] < x

## Sample Test Cases

### Input
```
3
3 7
1 2 5
1 10
8
2 12
4 8
```

### Output
```
5
10
8
```

## Explanation

**Test Case 1:**
The segments to consider for fuel are from 0 to 1, 1 to 2, 2 to 5, 5 to 7, and back.
The maximum gap is from 5 to 7 (2 units), so double that for the round trip. The maximum among these and the first station distance determines the minimum starting fuel.

**Test Case 2:**
Only one station at 8, so initial fuel must be enough to reach 8 and back.

**Test Case 3:**
Stations at 4, so trip can be planned to always refuel optimally.
