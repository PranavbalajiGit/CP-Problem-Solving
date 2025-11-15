# Halloumi Boxes

## Problem Statement

Theofanis has n boxes labeled with integers from a[1] to a[n]. The boxes are placed in a line.

He has a machine that can reverse the order of exactly k consecutive boxes (k is given).

Determine if it is possible to sort the entire line of boxes in non-decreasing order by performing any number of these operations (possibly zero).

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 100) — the number of test cases.

For each test case:
- The first line contains two integers n and k (1 ≤ k ≤ n ≤ 100) — the number of boxes and the length of the consecutive segment that can be reversed.
- The second line contains n integers a[1], a[2], ..., a[n] (1 ≤ a[i] ≤ 100) — the labels of the boxes.

## Output Format

For each test case, print "YES" if it is possible to sort the boxes using the machine's operation any number of times, or "NO" otherwise.

You can print each letter in any case (YES, yes, YeS, etc.).

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 100
- 1 ≤ k ≤ n ≤ 100
- 1 ≤ a[i] ≤ 100

## Sample Test Cases

### Input
```
5
3 2
1 2 3
3 3
3 2 1
4 2
1 3 2 4
5 4
1 3 2 5 4
5 3
1 2 4 3 5
```

### Output
```
YES
YES
YES
NO
NO
```

## Explanation

**Test Case 1:** Already sorted. Answer: YES

**Test Case 2:** Reverse the entire array. Answer: YES

**Test Case 3:** Reverse the middle two elements. Answer: YES

**Test Case 4:** It's impossible to sort using segments of length 4. Answer: NO

**Test Case 5:** It's impossible with k=3. Answer: NO
