# Grasshopper on a Line

## Problem Statement

There is a grasshopper on a line consisting of n cells, numbered from 1 to n.

The grasshopper starts on cell x.

The grasshopper will make exactly k jumps.

In each jump, it jumps to an adjacent cell (either to the left or right).

Your task is to find any sequence of k jumps such that the grasshopper stays inside the line and ends up on some cell y.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 1000) — the number of test cases.

For each test case:
- The first line contains three integers n, x, and k (1 ≤ n ≤ 1000, 1 ≤ x ≤ n, 1 ≤ k ≤ 1000).

## Output Format

For each test case, output a string of length k, consisting only of characters 'L' and 'R'.

'L' means the grasshopper jumps one cell to the left.

'R' means the grasshopper jumps one cell to the right.

If there are multiple valid sequences, output any.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 1000
- 1 ≤ n ≤ 1000
- 1 ≤ x ≤ n
- 1 ≤ k ≤ 1000

## Sample Test Cases

### Input
```
3
7 2 3
7 5 2
4 3 1
```

### Output
```
RRR
LL
L
```

## Explanation

**Test Case 1:** n=7, x=2, k=3
The grasshopper can jump right 3 times: positions 2 → 3 → 4 → 5. Answer: RRR

**Test Case 2:** n=7, x=5, k=2
The grasshopper can jump left 2 times: positions 5 → 4 → 3. Answer: LL

**Test Case 3:** n=4, x=3, k=1
The grasshopper can jump left once: positions 3 → 2. Answer: L
