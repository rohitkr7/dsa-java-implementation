# Dynamic Programming

Curated from the [GfG Dynamic Programming hub](https://www.geeksforgeeks.org/dsa/dynamic-programming/), pruned to what actually shows up in Google/Meta/Amazon SWE loops, and organized by pattern instead of difficulty tier. A few items below aren't linked from the hub page itself but do exist elsewhere on GfG — those links point to the correct GfG article. Every source topic turned out to exist somewhere on GfG, so nothing here is an external-only add.

**Priority legend**
- **[MUST]** — expect this; know it cold, codeable in 15–20 min
- **[GOOD]** — comes up often enough to be worth knowing well
- **[NICE]** — occasional ask, mostly senior/staff level or as a follow-up

## Foundations
- [Introduction to Dynamic Programming](https://www.geeksforgeeks.org/dsa/introduction-to-dynamic-programming-data-structures-and-algorithm-tutorials/) — **[MUST]**
- [Tabulation vs Memoization](https://www.geeksforgeeks.org/dsa/tabulation-vs-memoization/) — **[MUST]**
- [Steps to Solve a DP Problem](https://www.geeksforgeeks.org/dsa/solve-dynamic-programming-problem/) — **[MUST]**

## 1D / Sequence DP
- [Fibonacci Number](https://www.geeksforgeeks.org/dsa/program-for-nth-fibonacci-number/) — **[MUST]**
- [Climbing Stairs](https://www.geeksforgeeks.org/dsa/count-ways-reach-nth-stair/) — **[MUST]**
- [Min Cost Climbing Stairs](https://www.geeksforgeeks.org/dsa/minimum-cost-to-reach-the-top-of-the-floor-by-climbing-stairs/) — **[GOOD]**
- [House Robber](https://www.geeksforgeeks.org/dsa/find-maximum-possible-stolen-value-houses/) — **[MUST]**
- [House Robber II — Circular Houses](https://www.geeksforgeeks.org/dsa/maximum-sum-in-circular-array-such-that-no-two-elements-are-adjacent-set-2/) — **[GOOD]**
- [Decode Ways](https://www.geeksforgeeks.org/dsa/count-possible-decodings-given-digit-sequence/) — **[MUST]**
- [Word Break](https://www.geeksforgeeks.org/dsa/word-break-problem-dp-32/) — **[MUST]**
- [Jump Game](https://www.geeksforgeeks.org/dsa/minimum-number-of-jumps-to-reach-end-of-a-given-array/) — **[MUST]** (greedy is the expected O(n) solution; know the DP framing too)
- [Perfect Squares](https://www.geeksforgeeks.org/dsa/minimum-number-of-squares-whose-sum-equals-to-given-number-n/) — **[GOOD]**
- [Triangle — Minimum Sum Path](https://www.geeksforgeeks.org/dsa/minimum-sum-path-triangle/) — **[GOOD]**
- [Weighted Job Scheduling](https://www.geeksforgeeks.org/dsa/weighted-job-scheduling/) — **[NICE]** (sort by end time + binary search + 1D DP)

## Kadane's & Subarray DP
- [Kadane's Algorithm — Maximum Subarray Sum](https://www.geeksforgeeks.org/dsa/largest-sum-contiguous-subarray/) — **[MUST]**
- [Maximum Product Subarray](https://www.geeksforgeeks.org/dsa/maximum-product-subarray/) — **[GOOD]**
- [Maximum Sum Rectangle in a 2D Matrix](https://www.geeksforgeeks.org/dsa/maximum-sum-rectangle-in-a-2d-matrix/) — **[NICE]** (2D Kadane's)

## Grid / Path DP
- [Unique Paths in a Grid](https://www.geeksforgeeks.org/dsa/count-possible-paths-top-left-bottom-right-nxm-matrix/) — **[MUST]**
- [Unique Paths with Obstacles](https://www.geeksforgeeks.org/dsa/unique-paths-in-a-grid-with-obstacles/) — **[GOOD]**
- [Min Cost Path](https://www.geeksforgeeks.org/dsa/min-cost-path-dp-6/) — **[GOOD]**
- [Maximal Square — Largest Square Submatrix of 1s](https://www.geeksforgeeks.org/dsa/maximum-size-sub-matrix-with-all-1s-in-a-binary-matrix/) — **[MUST]**
- [Longest Increasing Path in a Matrix](https://www.geeksforgeeks.org/dsa/longest-increasing-path-matrix/) — **[GOOD]** (DFS + memo on an implicit DAG)

## Knapsack & Subset-Sum Family
- [0/1 Knapsack](https://www.geeksforgeeks.org/dsa/0-1-knapsack-problem-dp-10/) — **[MUST]**
- [Subset Sum Problem](https://www.geeksforgeeks.org/dsa/subset-sum-problem-dp-25/) — **[MUST]**
- [Partition Equal Subset Sum](https://www.geeksforgeeks.org/dsa/partition-problem-dp-18/) — **[MUST]**
- [Target Sum](https://www.geeksforgeeks.org/dsa/number-of-ways-to-calculate-a-target-number-using-only-array-elements/) — **[GOOD]**
- [Coin Change — Minimum Coins](https://www.geeksforgeeks.org/dsa/find-minimum-number-of-coins-that-make-a-change/) — **[MUST]**
- [Coin Change — Count Ways](https://www.geeksforgeeks.org/dsa/coin-change-dp-7/) — **[GOOD]**
- [Unbounded Knapsack](https://www.geeksforgeeks.org/dsa/unbounded-knapsack-repetition-items-allowed/) — **[GOOD]**
- [Rod Cutting](https://www.geeksforgeeks.org/dsa/cutting-a-rod-dp-13/) — **[GOOD]**

## String DP
- [Longest Common Subsequence](https://www.geeksforgeeks.org/dsa/longest-common-subsequence-dp-4/) — **[MUST]**
- [Edit Distance](https://www.geeksforgeeks.org/dsa/edit-distance-dp-5/) — **[MUST]**
- [Longest Increasing Subsequence](https://www.geeksforgeeks.org/dsa/longest-increasing-subsequence-dp-3/) — **[MUST]** (know both the O(n²) DP and the O(n log n) patience-sorting version)
- [Longest Common Substring](https://www.geeksforgeeks.org/dsa/longest-common-substring-space-optimized-dp-solution/) — **[GOOD]**
- [Longest Palindromic Substring](https://www.geeksforgeeks.org/dsa/longest-palindromic-substring-using-dynamic-programming-2/) — **[MUST]** (expand-around-center is the expected O(n²) answer; DP table is the fallback explanation)
- [Longest Palindromic Subsequence](https://www.geeksforgeeks.org/dsa/longest-palindromic-subsequence-dp-12/) — **[GOOD]**
- [Palindrome Partitioning — Minimum Cuts](https://www.geeksforgeeks.org/dsa/palindrome-partitioning-dp-17/) — **[GOOD]**
- [Wildcard Pattern Matching](https://www.geeksforgeeks.org/dsa/wildcard-pattern-matching/) — **[GOOD]**
- [Regular Expression Matching](https://www.geeksforgeeks.org/dsa/implementing-regular-expression-matching/) — **[GOOD]** (hard, but a known Google favorite)

## Stock Trading (State-Machine DP)
- [Stock Buy & Sell — Complete Tutorial (all variations)](https://www.geeksforgeeks.org/dsa/all-variations-of-stock-problems/) — **[MUST]** (read this first — it's the unifying buy/sell state framework)
- [Stock Buy & Sell — Single Transaction](https://www.geeksforgeeks.org/dsa/best-time-to-buy-and-sell-stock/) — **[MUST]**
- [Stock Buy & Sell — Unlimited Transactions](https://www.geeksforgeeks.org/dsa/stock-buy-sell/) — **[GOOD]**
- [Stock Buy & Sell — At Most 2 Transactions](https://www.geeksforgeeks.org/dsa/maximum-profit-by-buying-and-selling-a-share-at-most-twice/) — **[GOOD]**
- [Stock Buy & Sell — At Most k Transactions](https://www.geeksforgeeks.org/dsa/maximum-profit-by-buying-and-selling-a-share-at-most-k-times/) — **[NICE]**
- [Stock Buy & Sell — With Cooldown](https://www.geeksforgeeks.org/dsa/maximizing-stock-profit-with-cooldown/) — **[NICE]**
- [Stock Buy & Sell — With Transaction Fee](https://www.geeksforgeeks.org/dsa/maximum-profit-after-buying-and-selling-the-stocks-with-transaction-fees/) — **[NICE]**

## Interval DP
- [Matrix Chain Multiplication](https://www.geeksforgeeks.org/dsa/matrix-chain-multiplication-dp-8/) — **[GOOD]** (the archetypal interval-DP pattern)
- [Painter's Partition Problem](https://www.geeksforgeeks.org/dsa/painters-partition-problem/) — **[GOOD]** (same shape as "Split Array Largest Sum")
- [Optimal Strategy for a Game](https://www.geeksforgeeks.org/dsa/optimal-strategy-for-a-game-dp-31/) — **[NICE]** (game-theory DP; stone-game family)

## Tree DP
- [DP on Trees — Introduction](https://www.geeksforgeeks.org/dsa/introduction-to-dynamic-programming-on-trees/) — **[GOOD]** (covers the House-Robber-III-style "include/exclude node" pattern)
- [Max Height of Tree When Any Node Can Be Root](https://www.geeksforgeeks.org/dsa/maximum-height-of-tree-when-any-node-can-be-considered-as-root/) — **[NICE]** (rerooting technique, staff-level follow-up)

## Bitmask DP
- [Bitmasking and DP — Assign Unique Cap to Every Person](https://www.geeksforgeeks.org/dsa/bitmasking-and-dynamic-programming-set-1-count-ways-to-assign-unique-cap-to-every-person/) — **[GOOD]**
- [Traveling Salesman Problem (Bitmask DP)](https://www.geeksforgeeks.org/dsa/bitmasking-dynamic-programming-set-2-tsp/) — **[NICE]**

## DP on Graphs
*(cross-listed with Graph Algorithms — GfG's own DP page leads with these as canonical DP examples)*
- [Bellman–Ford Algorithm](https://www.geeksforgeeks.org/dsa/bellman-ford-algorithm-dp-23/) — **[NICE]**
- [Floyd–Warshall Algorithm](https://www.geeksforgeeks.org/dsa/floyd-warshall-algorithm-dp-16/) — **[NICE]**

## Combinatorial / Math DP
*(mostly senior/staff-level follow-ups, not first-line asks)*
- [Unique BSTs (Catalan Number)](https://www.geeksforgeeks.org/dsa/number-of-unique-bst-with-a-given-key-dynamic-programming/) — **[GOOD]**
- [Count Valid Parenthesis Expressions](https://www.geeksforgeeks.org/dsa/find-number-valid-parentheses-expressions-given-length/) — **[NICE]**
- [Pascal's Triangle](https://www.geeksforgeeks.org/dsa/pascal-triangle/) — **[NICE]**
- [Egg Dropping Puzzle](https://www.geeksforgeeks.org/dsa/egg-dropping-puzzle-dp-11/) — **[NICE]**
- [Digit DP — Introduction](https://www.geeksforgeeks.org/dsa/digit-dp-introduction/) — **[NICE]**

## Reference / Practice
- LeetCode's [Dynamic Programming tag](https://leetcode.com/tag/dynamic-programming/) and the DP subset of Blind 75 / NeetCode 150 for timed, pattern-based reps
- *Elements of Programming Interviews* — DP chapter for extra rigor on state definition and proofs of optimal substructure
- *Introduction to Algorithms* (CLRS) — ch. 15, for the formal treatment behind Matrix Chain Multiplication and interval DP
- When practicing in Java: write the recursive brute force first, add memoization, then convert to tabulation — that progression is what most FAANG interviewers expect to see out loud

## Suggested prep order
1. Foundations + 1D/Sequence DP
2. Kadane's & Subarray DP
3. Grid / Path DP
4. Knapsack & Subset-Sum family
5. String DP
6. Stock Trading state-machine
7. Interval DP + Tree DP
8. Bitmask DP + DP on Graphs + Combinatorial/Math DP (staff-level follow-ups, lowest ROI — do these last)
