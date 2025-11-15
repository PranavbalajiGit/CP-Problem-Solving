# Ambitious Kid

## Problem Statement

Chaneka, Pak Chanek's child, is an ambitious kid. Pak Chanek wants to test Chaneka's ambition.

Pak Chanek gives Chaneka an array of `n` integers `a[1], a[2], a[3], ..., a[n]`. Chaneka can do the following operation:

- Choose one element, then increase or decrease the element's value by `1`

Chaneka can do that operation as many times as she wants.

Now, Pak Chanek asks Chaneka, what is the minimum number of operations that needs to be done to make the product of all elements of the array equal to `0`?

## Input Format

The first line contains a single integer `n` (1 ≤ n ≤ 100) — the number of elements in the array.

The second line contains `n` integers `a[1], a[2], a[3], ..., a[n]` (-100 ≤ a[i] ≤ 100) — the elements of the array.

## Output Format

Output an integer representing the minimum number of operations needed to make the product of all elements in the array equal to `0`.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ n ≤ 100
- -100 ≤ a[i] ≤ 100

## Sample Test Cases

### Input
```
3
2 -6 5
```

### Output
```
2
```

### Input
```
5
0 -1 -2 -3 -4
```

### Output
```
0
```

### Input
```
4
1 2 3 4
```

### Output
```
1
```

### Input
```
3
-3 -3 0
```

### Output
```
0
```

## Explanation

**Test Case 1:** n=3, a=[2, -6, 5]  
To make the product equal to 0, we need at least one element to be 0. The element closest to 0 is 2 (distance of 2). We can decrease 2 by 2 operations to make it 0: 2 → 1 → 0. Answer: 2

**Test Case 2:** n=5, a=[0, -1, -2, -3, -4]  
The array already contains 0, so the product is already 0. No operations are needed. Answer: 0

**Test Case 3:** n=4, a=[1, 2, 3, 4]  
The element closest to 0 is 1 (distance of 1). We can decrease 1 by 1 operation to make it 0: 1 → 0. Answer: 1

**Test Case 4:** n=3, a=[-3, -3, 0]  
The array already contains 0, so the product is already 0. No operations are needed. Answer: 0
