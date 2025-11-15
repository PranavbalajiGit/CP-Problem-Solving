# Cover in Water

## Problem Statement

Filip has a row of cells, some of which are blocked, and some are empty. He wants all empty cells to have water in them.

He has two actions at his disposal:

1. **Action 1:** Place water in an empty cell
2. **Action 2:** Remove water from one cell and place it in any other empty cell

Additionally, there is a special rule: If at some moment cell i is empty and both cells i-1 and i+1 contain water, then cell i automatically becomes filled with water.

Find the minimum number of times Filip needs to perform **Action 1** in order to fill all the empty cells with water. Note that you don't need to minimize the use of Action 2.

## Input Format

The first line contains a single integer t — the number of test cases.

For each test case:
- The first line contains an integer n — the length of the row
- The second line contains a string s of length n, where:
  - `.` represents an empty cell
  - `#` represents a blocked cell

## Output Format

For each test case, output a single integer — the minimum number of times Action 1 needs to be performed to fill all empty cells with water.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 262144 KB
- 1 ≤ t ≤ 10⁴
- 1 ≤ n ≤ 100

## Sample Test Cases

### Input
```
5
3
...
7
#......
7
##.#.##
7
.......
7
#.#.#.#
```

### Output
```
2
2
3
2
4
```

## Explanation

**Test Case 1:** n=3, s="..."  
There are 3 consecutive empty cells. We can place water in the first and third cells, and the middle cell will automatically fill due to the special rule. Answer: 2

**Test Case 2:** n=7, s="#......"  
We have 6 consecutive empty cells after a blocked cell. By placing water in two cells strategically, we can use the special rule to fill the remaining cells. Answer: 2

**Test Case 3:** n=7, s="##.#.##"  
There are 2 separate groups of empty cells (one with 1 cell, one with 1 cell), plus one isolated cell. Since no group has 3+ consecutive cells, we need to fill each empty cell individually. Answer: 3

**Test Case 4:** n=7, s="......."  
All 7 cells are empty. Since we have more than 3 consecutive empty cells, we only need 2 operations to fill all cells using the special rule. Answer: 2

**Test Case 5:** n=7, s="#.#.#.#"  
There are 4 separate single empty cells. Each must be filled individually since there are no groups of 3+ consecutive empty cells. Answer: 4
