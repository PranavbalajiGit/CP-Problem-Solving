# Don't Try to Count

## Problem Statement

You are given two strings:
- `x` of length `n`
- `s` of length `m`

Both strings consist of lowercase Latin letters.

In one operation, you can append the current value of `x` to the end of string `x`. For example, if `x = "aba"`, after performing the operation once, `x` becomes `"abaaba"`.

Note that the value of `x` changes after each operation.

Find the minimum number of operations required to make `s` appear in `x` as a substring. If it is impossible, output -1.

## Input Format

The first line contains a single integer `t` (1 ≤ t ≤ 10⁴) — the number of test cases.

For each test case:
- The first line contains two integers `n` and `m` (1 ≤ n, m ≤ 25) — the lengths of strings `x` and `s`
- The second line contains the string `x` of length `n`
- The third line contains the string `s` of length `m`

## Output Format

For each test case, output a single integer — the minimum number of operations needed to make `s` appear as a substring in `x`. If this is impossible, output -1.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10⁴
- 1 ≤ n, m ≤ 25
- Both strings consist of lowercase Latin letters

## Sample Test Cases

### Input
```
7
1 5
a
aaaaa
4 5
abab
babab
3 5
aba
ababa
4 3
cdef
abc
5 3
abbbb
babbb
1 19
a
babbbabbabbbbbaaabb
2 3
ab
ddd
```

### Output
```
3
1
1
-1
0
5
-1
```

## Explanation

**Test Case 1:** n=1, m=5, x="a", s="aaaaa"  
- After 1 operation: x = "aa" (length 2)
- After 2 operations: x = "aaaa" (length 4)
- After 3 operations: x = "aaaaaaaa" (length 8)
After 3 operations, "aaaaa" appears as a substring in x. Answer: 3

**Test Case 2:** n=4, m=5, x="abab", s="babab"  
- After 1 operation: x = "abababab"
"babab" appears as a substring in x. Answer: 1

**Test Case 3:** n=3, m=5, x="aba", s="ababa"  
- After 1 operation: x = "abaaba"
"ababa" appears as a substring in x. Answer: 1

**Test Case 4:** n=4, m=3, x="cdef", s="abc"  
No matter how many operations we perform, "abc" will never appear in x because x only contains characters 'c', 'd', 'e', 'f', but s requires 'a' and 'b'. Answer: -1

**Test Case 5:** n=5, m=3, x="abbbb", s="babbb"  
"babbb" is already a substring of x without any operations. Answer: 0

**Test Case 6:** n=1, m=19, x="a", s="babbbabbabbbbbaaabb"  
x only contains the character 'a', but s contains 'b', so it's impossible. Answer: -1

**Test Case 7:** n=2, m=3, x="ab", s="ddd"  
x only contains 'a' and 'b', but s requires 'd', so it's impossible. Answer: -1
