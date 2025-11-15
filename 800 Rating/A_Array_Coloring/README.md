# 1857A -- Array Coloring

## 1. Problem Statement

You are given an array of (n) integers. You need to color each element
in one of **two colors**, such that: - The sum of elements of **both
colors** has the **same parity** (both even or both odd). - Each color
is used at least once.

Determine whether such a coloring is possible.

------------------------------------------------------------------------

## 2. Input / Output Format

### Input

-   First line: integer (t) --- number of test cases.\
-   For each test case:
    -   A line with integer (n) ((2 `\le `{=tex}n `\le 50`{=tex})).\
    -   A line with (n) integers (a_1, a_2, `\dots`{=tex}, a_n) ((1
        `\le `{=tex}a_i `\le 50`{=tex})).

### Output

For each test case, print **"YES"** if such a coloring exists, otherwise
**"NO"**.

------------------------------------------------------------------------

## 3. Constraints

-   (1 `\le `{=tex}t `\le 1000`{=tex})\
-   (2 `\le `{=tex}n `\le 50`{=tex})\
-   (1 `\le `{=tex}a_i `\le 50`{=tex})

------------------------------------------------------------------------

## 4. Examples

**Input**

    7
    8
    1 2 4 3 2 3 5 4
    2
    4 7
    3
    3 9 8
    2
    1 7
    5
    5 4 3 2 1
    4
    4 3 4 5
    2
    50 48

**Output**

    YES
    NO
    YES
    YES
    NO
    YES
    YES
