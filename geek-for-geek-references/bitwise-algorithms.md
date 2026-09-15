# Bitwise Algorithms

Curated from the [GfG Bitwise Algorithms hub](https://www.geeksforgeeks.org/dsa/bitwise-algorithms/), pruned to what actually shows up in Google/Meta/Amazon SWE loops, and reorganized by technique rather than GfG's easy/medium/hard tiers. A few items below exist on GfG but aren't linked from the hub page — those links point to the correct article.

**Priority legend**
- **[MUST]** — expect this; know it cold, codeable in 15–20 min
- **[GOOD]** — comes up often enough to be worth knowing well
- **[NICE]** — occasional ask, mostly senior/staff level or as a follow-up

## Foundations
- [Introduction to Bitwise Algorithms](https://www.geeksforgeeks.org/dsa/introduction-to-bitwise-algorithms-data-structures-and-algorithms-tutorial/) — **[MUST]**
- [All about Bit Manipulation](https://www.geeksforgeeks.org/dsa/all-about-bit-manipulation/) — **[MUST]**
- [Bits Manipulation — Important Tactics](https://www.geeksforgeeks.org/dsa/bits-manipulation-important-tactics/) — **[MUST]** (the single highest-value page here; also contains the closed-form XOR of 1..n)
- [Bitwise Operators in Java](https://www.geeksforgeeks.org/java/bitwise-operators-in-java/) — **[GOOD]** (know `>>` vs `>>>` and that shifts are mod-32 on `int`)
- [Bitwise Hacks for Competitive Programming](https://www.geeksforgeeks.org/competitive-programming/bitwise-hacks-for-competitive-programming/) — **[GOOD]**

## Core Bit Toolkit
These are the primitives every harder problem is built from. You should be able to write each one from memory without thinking.
- [Check if K-th Bit is Set](https://www.geeksforgeeks.org/dsa/check-whether-k-th-bit-set-not/) — **[MUST]**
- [Set the K-th Bit](https://www.geeksforgeeks.org/dsa/set-k-th-bit-given-number/) — **[MUST]**
- [Turn Off the Rightmost Set Bit](https://www.geeksforgeeks.org/dsa/turn-off-the-rightmost-set-bit/) — **[MUST]** (`n & (n-1)`)
- [Position of the Rightmost Set Bit](https://www.geeksforgeeks.org/dsa/position-of-rightmost-set-bit/) — **[MUST]** (`n & -n`)
- [Count Set Bits](https://www.geeksforgeeks.org/dsa/count-set-bits-in-an-integer/) — **[MUST]** (Brian Kernighan's loop; know the lookup-table variant as a follow-up)
- [Check if a Number is a Power of Two](https://www.geeksforgeeks.org/dsa/program-to-find-whether-a-given-number-is-power-of-2/) — **[MUST]**
- [Most Significant Set Bit](https://www.geeksforgeeks.org/dsa/find-significant-set-bit-number/) — **[GOOD]**
- [Smallest Power of 2 ≥ n](https://www.geeksforgeeks.org/dsa/smallest-power-of-2-greater-than-or-equal-to-n/) — **[GOOD]**
- [Reverse the Bits of a Number](https://www.geeksforgeeks.org/dsa/reverse-actual-bits-given-number/) — **[GOOD]** (not linked from the hub page)
- [Parity of a Number](https://www.geeksforgeeks.org/dsa/program-to-find-parity/) — **[GOOD]**
- [Swap Two Numbers Without a Temp Variable](https://www.geeksforgeeks.org/dsa/swap-two-numbers-without-using-temporary-variable/) — **[NICE]**

## XOR Patterns
The densest source of real interview questions in this whole topic. The recurring idea: XOR cancels pairs, so anything "find the odd one out" or "range of XORs" reduces to a linear scan.
- [Odd Occurring Number / Single Number](https://www.geeksforgeeks.org/dsa/find-the-number-occurring-odd-number-of-times/) — **[MUST]**
- [Find the Missing Number](https://www.geeksforgeeks.org/dsa/find-the-missing-number/) — **[MUST]** (not linked from the hub page; know both the XOR and sum-formula answers)
- [Two Non-Repeating Elements in an Array of Repeating Elements](https://www.geeksforgeeks.org/dsa/find-two-non-repeating-elements-in-an-array-of-repeating-elements/) — **[MUST]** (partition on any set bit of the total XOR)
- [Element Appearing Once When All Others Appear Thrice](https://www.geeksforgeeks.org/dsa/find-the-element-that-appears-once/) — **[MUST]** (not linked from the hub page; the `ones`/`twos` state trick, or per-bit count mod 3)
- [Count Subarrays with a Given XOR](https://www.geeksforgeeks.org/dsa/count-number-subarrays-given-xor/) — **[MUST]** (not linked from the hub page; prefix-XOR + hash map, same shape as "subarray sum equals k")
- [Maximum XOR of Two Numbers in an Array](https://www.geeksforgeeks.org/dsa/maximum-xor-of-two-numbers-in-an-array/) — **[GOOD]** (not linked from the hub page; binary trie, greedy from the MSB)
- [Maximum Subarray XOR](https://www.geeksforgeeks.org/dsa/find-the-maximum-subarray-xor-in-a-given-array/) — **[GOOD]** (prefix XOR into the same trie)

## Arithmetic Without Arithmetic Operators
- [Add Two Numbers Without Arithmetic Operators](https://www.geeksforgeeks.org/dsa/add-two-numbers-without-using-arithmetic-operators/) — **[MUST]** (`sum = a^b`, `carry = (a&b)<<1`; be ready to discuss 32-bit masking for negatives)
- [Divide Two Integers Without Multiplication, Division, or Mod](https://www.geeksforgeeks.org/dsa/divide-two-integers-without-using-multiplication-division-mod-operator/) — **[MUST]** (not linked from the hub page; shift-and-subtract, plus the `INT_MIN / -1` overflow case)
- [Min/Max of Two Integers Without Branching](https://www.geeksforgeeks.org/dsa/compute-the-minimum-or-maximum-max-of-two-integers-without-branching/) — **[GOOD]**
- [Detect if Two Integers Have Opposite Signs](https://www.geeksforgeeks.org/dsa/detect-if-two-integers-have-opposite-signs/) — **[NICE]**
- [Check for Integer Overflow](https://www.geeksforgeeks.org/dsa/check-for-integer-overflow/) — **[NICE]**
- [Modulus Division by a Power of 2](https://www.geeksforgeeks.org/dsa/compute-modulus-division-by-a-power-of-2-number/) — **[NICE]**

## Bitmask Enumeration & Bitmask DP
- [Power Set — All Subsets via Bitmask](https://www.geeksforgeeks.org/dsa/power-set/) — **[MUST]** (not linked from the hub page; the `for (i = 0; i < 1<<n; i++)` enumeration is the standard answer to Subsets/LC 78)
- **Counting Bits for 0..n — popcount DP** — **[GOOD — not on GfG]** — `dp[i] = dp[i>>1] + (i&1)` builds every popcount in O(n). GfG only covers the *aggregate sum* of set bits from 1 to n ([that article is here](https://www.geeksforgeeks.org/dsa/count-total-set-bits-in-all-numbers-from-1-to-n/)), not the per-number DP array that interviewers actually ask for. Best coverage: [LeetCode 338 — Counting Bits, official solution](https://leetcode.com/problems/counting-bits/solutions/) or [NeetCode — Counting Bits](https://neetcode.io/problems/counting-bits).
- [Bitmasking + DP — Assign a Unique Cap to Every Person](https://www.geeksforgeeks.org/dsa/bitmasking-and-dynamic-programming-set-1-count-ways-to-assign-unique-cap-to-every-person/) — **[GOOD]** (the canonical "mask = which items are used" state)
- [Traveling Salesman Problem via Bitmask DP](https://www.geeksforgeeks.org/dsa/bitmasking-dynamic-programming-set-2-tsp/) — **[NICE]**
- **Bitmask subset-partition DP** — **[NICE — not on GfG]** — "Partition to K Equal Sum Subsets," "Matchsticks to Square," and "Fair Distribution of Cookies" all reduce to DP over a used-elements mask. GfG teaches bitmask DP only through TSP and the caps problem, never this family. Best coverage: [NeetCode — Partition to K Equal Sum Subsets](https://neetcode.io/problems/partition-to-k-equal-sum-subsets) and the [LeetCode 698 official solution](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/solutions/).

> Bit-state BFS ("Shortest Path Visiting All Nodes") lives in the Graph Algorithms list rather than here, since the hard part is the BFS framing, not the bit tricks.

## Harder Follow-Ups
- [Longest Sequence of 1s in Binary with One Flip](https://www.geeksforgeeks.org/dsa/find-longest-sequence-1s-binary-representation-one-flip/) — **[GOOD]**
- [Next Higher Number with the Same Number of Set Bits](https://www.geeksforgeeks.org/dsa/next-higher-number-with-same-number-of-set-bits/) — **[NICE]**
- [Generate n-bit Gray Codes](https://www.geeksforgeeks.org/dsa/generate-n-bit-gray-codes/) — **[NICE]**
- [Gray to Binary and Binary to Gray](https://www.geeksforgeeks.org/dsa/gray-to-binary-and-binary-to-gray-conversion/) — **[NICE]**
- [Check if a Binary Representation is a Palindrome](https://www.geeksforgeeks.org/dsa/check-binary-representation-number-palindrome/) — **[NICE]**

## Reference / Practice
- [GfG practice set — Bit Magic](https://www.geeksforgeeks.org/explore?page=1&category=Bit%20Magic&sortBy=submissions) for timed reps
- LeetCode's [Bit Manipulation tag](https://leetcode.com/tag/bit-manipulation/); the Blind 75 / NeetCode 150 bit-manipulation block is small enough to finish in a single sitting and covers most of what gets asked
- *Hacker's Delight* (Warren) — the reference for why these tricks work, if you want depth beyond interview needs
- In Java, know `Integer.bitCount`, `highestOneBit`, `numberOfTrailingZeros`, and `reverse` — but be ready to hand-roll each one, since interviewers usually ask for the manual version after you name the builtin

## Suggested prep order
1. Foundations + Core Bit Toolkit — these are prerequisites, not a topic
2. XOR patterns (highest interview density by a wide margin)
3. Arithmetic without arithmetic operators
4. Bitmask enumeration, then bitmask DP
5. Harder follow-ups, only if you have time left over
