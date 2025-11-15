# Game with Integers

## Problem Statement

Vana and Vovva are playing a game.
You are given an integer n. The game starts with player Vana and they take turns.
On their turn, a player can either add 1 to n or subtract 1 from n.

If after Vana's move the integer is divisible by 3, Vana wins and the game ends.
If, after 10 moves (if Vana has not won), then Vovva wins.

For a given integer n, determine who will win the game if both play optimally.

- Print "first" if Vana wins.
- Print "second" if Vovva wins.

## Input Format

The first line contains a single integer t (1 ≤ t ≤ 10⁴) — the number of test cases.

Each test case contains a single integer n (1 ≤ n ≤ 10⁹).

## Output Format

For each test case, output one line with "first" if Vana wins, or "second" if Vovva wins.

## Constraints

- Time Limit: 1000 ms
- Memory Limit: 256 MB
- 1 ≤ t ≤ 10⁴
- 1 ≤ n ≤ 10⁹

## Sample Test Cases

### Input
```
4
3
8
20
1
```

### Output
```
second
first
first
first
```

## Explanation

**Test Case 1:** n=3
n is already divisible by 3. Since it's Vana's move and they win if n is divisible by 3 after their move, but right at the start it's Vovva's win. The answer: second.

**Test Case 2:** n=8
Vana can subtract 1 to get 7 or add 1 to get 9. If n=9 after the move, n is divisible by 3, so Vana wins. The answer: first.

**Test Case 3:** n=20
Vana can make a move to immediately win or force a win in a few moves: first.

**Test Case 4:** n=1
After adding 1, n becomes 2; after another player's move, can again get to n=3. Vana can always force a win except for n originally multiple of 3. The answer: first.
