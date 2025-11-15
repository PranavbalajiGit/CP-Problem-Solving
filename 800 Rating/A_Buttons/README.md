# Buttons

## 1. Problem Statement

Anna and Katie are playing a game with buttons:\
- There are `a` buttons only Anna can press, `b` only Katie can press,
and `c` buttons either of them can press.\
- Anna starts first.\
- Each button can be pressed once.\
- The player who cannot press a button on their turn loses.

------------------------------------------------------------------------

## 2. Input / Output Format

### Input

-   Integer `t` --- number of test cases\
-   For each test case: integers `a`, `b`, `c`

### Output

-   `First` if Anna wins, otherwise `Second`

------------------------------------------------------------------------

## 3. Constraints

-   1 ≤ t ≤ 10⁴\
-   1 ≤ a, b, c ≤ 10⁹

------------------------------------------------------------------------

## 4. Examples

Input

    5
    1 1 1
    9 3 3
    1 2 3
    6 6 9
    2 2 8

Output

    First
    First
    Second
    First
    Second
