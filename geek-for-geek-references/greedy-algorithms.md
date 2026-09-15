# Greedy Algorithms

Curated from the [GfG Greedy Algorithms hub](https://www.geeksforgeeks.org/dsa/greedy-algorithms/), pruned to what actually shows up in Google/Meta/Amazon SWE loops, and reorganized by technique instead of GfG's Easy/Medium/Hard tiers. A few items below aren't linked from the hub page but do exist elsewhere on GfG — those links point to the correct GfG article. Two genuinely high-value patterns have no GfG article at all and are flagged as such.

**Priority legend**
- **[MUST]** — expect this; know it cold, codeable in 15–20 min
- **[GOOD]** — comes up often enough to be worth knowing well
- **[NICE]** — occasional ask, mostly senior/staff level or as a follow-up

## Foundations
- [Introduction to Greedy Algorithms](https://www.geeksforgeeks.org/dsa/introduction-to-greedy-algorithm-data-structures-and-algorithm-tutorials/) — **[MUST]**
- [General Structure of a Greedy Algorithm](https://www.geeksforgeeks.org/dsa/greedy-algorithms-general-structure-and-applications/) — **[MUST]** (sort or heap, then commit; the shape every answer below follows)
- [Scheduling in Greedy Algorithms](https://www.geeksforgeeks.org/dsa/scheduling-in-greedy-algorithms/) — **[GOOD]** (walks through *why* "shortest first" and "earliest start" fail and earliest-end works — this is the exchange-argument intuition interviewers want when they ask "why is that greedy correct?")

## Interval Scheduling & Merging
*The highest-frequency greedy cluster by a wide margin. Sort by start to merge, sort by end to select.*
- [Activity Selection](https://www.geeksforgeeks.org/dsa/activity-selection-problem-greedy-algo-1/) — **[MUST]** (sort by end time; also the answer to "Non-overlapping Intervals" / max-intervals-to-keep phrasings)
- [Merge Overlapping Intervals](https://www.geeksforgeeks.org/dsa/merging-intervals/) — **[MUST]**
- [Insert Interval](https://www.geeksforgeeks.org/dsa/insert-in-sorted-and-non-overlapping-interval-array/) — **[MUST]**
- [Minimum Platforms](https://www.geeksforgeeks.org/dsa/minimum-number-platforms-required-railwaybus-station/) — **[MUST]** (identical to "Meeting Rooms II"; know both the two-pointer sweep and the min-heap version)
- [Minimum Arrows to Burst Balloons](https://www.geeksforgeeks.org/dsa/find-minimum-number-of-arrows-needed-to-burst-all-balloons/) — **[GOOD]** (minimum points to stab all intervals — activity selection inverted)
- [Job Sequencing with Deadlines](https://www.geeksforgeeks.org/dsa/job-sequencing-problem/) — **[GOOD]** (sort by profit, then fill the latest free slot; DSU makes it near-linear as a follow-up)
- [Max Trains with Given Stoppages](https://www.geeksforgeeks.org/dsa/maximum-trains-stoppage-can-provided/) — **[NICE]** (per-platform activity selection)

## Array / Sorting Greedy
- [Jump Game — Minimum Jumps](https://www.geeksforgeeks.org/dsa/minimum-number-jumps-reach-endset-2on-solution/) — **[MUST]** (O(n) reachability window is the expected answer; the DP framing is the fallback)
- [Gas Station / Circular Tour](https://www.geeksforgeeks.org/dsa/find-a-tour-that-visits-all-stations/) — **[MUST]** (the "if it fails at i, restart at i+1" argument is the whole interview)
- [Fractional Knapsack](https://www.geeksforgeeks.org/dsa/fractional-knapsack-problem/) — **[MUST]** (sort by value/weight ratio; the canonical greedy-is-optimal proof)
- [Assign Cookies](https://www.geeksforgeeks.org/dsa/assign-cookies/) — **[GOOD]** (two sorted pointers; easiest clean example of the matching pattern)
- [Maximize Array Sum After K Negations](https://www.geeksforgeeks.org/dsa/maximize-array-sum-after-k-negations-using-sorting/) — **[GOOD]**
- [Minimize the Maximum Height Difference](https://www.geeksforgeeks.org/dsa/minimize-the-maximum-difference-between-the-heights/) — **[GOOD]** (sort, then test each split point)
- [Minimum Sum of Absolute Differences of Pairs](https://www.geeksforgeeks.org/dsa/minimum-sum-absolute-difference-pairs-two-arrays/) — **[NICE]** (sort both arrays and pair in order — trivial once stated, but the proof is the ask)
- [Minimum Cost to Make Array Size 1](https://www.geeksforgeeks.org/dsa/minimum-cost-make-array-size-1-removing-larger-pairs/) — **[NICE]**

## Heap-Based Greedy
*When the next-best choice changes after every pick, reach for a priority queue instead of a sort.*
- [Minimum Cost to Connect n Ropes](https://www.geeksforgeeks.org/dsa/connect-n-ropes-minimum-cost/) — **[MUST]** (repeatedly merge the two smallest; Huffman's skeleton)
- **Task Scheduler (CPU cooldown) — [MUST — not on GfG]** — schedule tasks with a cooldown `n` between identical tasks and return the minimum intervals. Two accepted answers: the max-heap + cooldown-queue simulation, and the O(1) formula `(maxFreq - 1) * (n + 1) + countOfMaxFreq`. GfG has a practice problem but no article explaining either, and the formula derivation is exactly what gets probed. Best coverage: [NeetCode — Task Scheduler](https://neetcode.io/problems/task-scheduling) and the [LeetCode 621 official solution](https://leetcode.com/problems/task-scheduler/solutions/).
- [Huffman Coding](https://www.geeksforgeeks.org/dsa/huffman-coding-greedy-algo-3/) — **[GOOD]** (asked as a design-flavored warm-up more often than as a code-it-now problem)
- [Huffman Decoding](https://www.geeksforgeeks.org/dsa/huffman-decoding/) — **[NICE]**
- [Minimize Cash Flow Among Friends](https://www.geeksforgeeks.org/dsa/minimize-cash-flow-among-given-set-friends-borrowed-money/) — **[NICE]** (max-heap of creditors vs debtors; note the true optimum is NP-hard and this is the expected heuristic)
- [Minimum Cost to Cut a Board into Squares](https://www.geeksforgeeks.org/dsa/minimum-cost-cut-board-squares/) — **[NICE]** (always cut along the most expensive remaining line)

## String Greedy
- [Rearrange Characters So No Two Adjacent Are Same](https://www.geeksforgeeks.org/dsa/rearrange-characters-string-no-two-adjacent/) — **[MUST]** ("Reorganize String"; max-heap on frequency, plus the feasibility check `maxFreq <= (n+1)/2`)
- **Partition Labels — [MUST — not on GfG]** — split a string into the most parts such that no letter spans two parts. One pass to record each character's last index, then a second pass extending the current partition's right edge. No GfG article covers it, and the "furthest last-occurrence" trick generalizes to a whole family of one-pass interval-on-a-string problems. Best coverage: [NeetCode — Partition Labels](https://neetcode.io/problems/partition-labels) and the [LeetCode 763 official solution](https://leetcode.com/problems/partition-labels/solutions/).
- [Lowest Number by Removing k Digits](https://www.geeksforgeeks.org/dsa/build-lowest-number-by-removing-n-digits-from-a-given-number/) — **[MUST]** (monotonic-stack greedy; the same machinery answers "Remove Duplicate Letters" and "Create Maximum Number")
- [Minimum Swaps for Bracket Balancing](https://www.geeksforgeeks.org/dsa/minimum-swaps-bracket-balancing/) — **[GOOD]**
- [Smallest Number with Given Digit Count and Digit Sum](https://www.geeksforgeeks.org/dsa/find-smallest-number-with-given-number-of-digits-and-digit-sum/) — **[GOOD]** (fill from the right greedily — a common phone-screen construction problem)
- [Largest Palindromic Number by Permuting Digits](https://www.geeksforgeeks.org/dsa/largest-palindromic-number-permuting-digits/) — **[NICE]**
- [Rearrange a String so Same Characters Are d Apart](https://www.geeksforgeeks.org/dsa/rearrange-a-string-so-that-all-same-characters-become-at-least-d-distance-away/) — **[NICE]** (generalizes the Task Scheduler cooldown to strings)

## Greedy on Graphs
*(cross-listed with Graph Algorithms — keep one set of notes, not two)*
- [Dijkstra's Algorithm](https://www.geeksforgeeks.org/dsa/dijkstras-shortest-path-algorithm-greedy-algo-7/) — **[MUST]**
- [Kruskal's MST](https://www.geeksforgeeks.org/dsa/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/) — **[MUST]** (sort edges + Union-Find)
- [Prim's MST](https://www.geeksforgeeks.org/dsa/prims-minimum-spanning-tree-mst-greedy-algo-5/) — **[MUST]**
- [Minimum Cost to Connect All Cities](https://www.geeksforgeeks.org/dsa/minimum-cost-connect-cities/) — **[GOOD]** (MST in disguise; the most common way MST actually gets asked)

## Greedy vs DP — Knowing When Greedy Breaks
*Interviewers plant these deliberately. Being able to say "greedy fails here, and here's the counterexample" is worth as much as any solved problem.*
- [Minimum Coins — Greedy Version](https://www.geeksforgeeks.org/dsa/greedy-algorithm-to-find-minimum-number-of-coins/) — **[MUST]** (works for canonical currency systems, fails on e.g. `{1, 15, 25}` for 30; the DP answer is [Coin Change — Minimum Coins](https://www.geeksforgeeks.org/dsa/find-minimum-number-of-coins-that-make-a-change/))
- [Minimum Currency Notes for a Sum](https://www.geeksforgeeks.org/dsa/find-number-currency-notes-sum-upto-given-amount/) — **[GOOD]** (the canonical-denomination case where greedy *is* provably safe)
- Fractional vs 0/1 Knapsack — **[MUST]** (ratio-sorting is optimal when items split, and provably wrong when they don't; contrast [Fractional Knapsack](https://www.geeksforgeeks.org/dsa/fractional-knapsack-problem/) with [0/1 Knapsack](https://www.geeksforgeeks.org/dsa/0-1-knapsack-problem-dp-10/))

## Reference / Practice
- [GfG Greedy Interview Questions](https://www.geeksforgeeks.org/interview-experiences/top-20-greedy-algorithms-interview-questions/) and the [GfG Greedy practice set](https://www.geeksforgeeks.org/explore?page=1&category=Greedy)
- LeetCode's [Greedy tag](https://leetcode.com/tag/greedy/) and [Intervals tag](https://leetcode.com/tag/interval/); NeetCode 150's Greedy and Intervals sections are the tightest timed-rep list
- *Introduction to Algorithms* (CLRS) — ch. 16, for greedy-choice property and matroid theory behind why activity selection and MST are provably optimal
- *Algorithm Design* (Kleinberg & Tardos) — ch. 4, the best written treatment of exchange arguments; read this if "prove your greedy is correct" is a weak spot
- Practice habit: for every greedy solution, state the sort key out loud and give a one-sentence exchange argument before coding. Interviewers cut you off less when the justification comes first.

## Suggested prep order
1. Foundations — especially the scheduling article's failed-strategy walkthrough
2. Interval Scheduling & Merging (highest ROI; do this before anything else)
3. Array / Sorting Greedy
4. Heap-Based Greedy
5. String Greedy
6. Greedy on Graphs (skip if already covered in your graph prep)
7. Greedy vs DP boundary cases — light pass, but do it before any onsite
