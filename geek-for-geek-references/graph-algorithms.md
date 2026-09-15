# Graph Algorithms

Curated from GeeksforGeeks' Graph Algorithms hub. Only topics that
actually show up in Google / Meta / Amazon / FAANG-level interviews
are kept.

Priority tags:
- **[MUST]** — expect this; know it cold, can code it in 15–20 min
- **[GOOD]** — comes up often enough to be worth knowing well
- **[NICE]** — occasionally asked, mostly at senior/staff level or as a follow-up

---

## 1. Foundations — start here
- **[MUST]** [Introduction to Graphs](https://www.geeksforgeeks.org/dsa/introduction-to-graphs-data-structure-and-algorithm-tutorials/) — terminology: directed/undirected, weighted, degree, etc.
- **[MUST]** [Graph Representations](https://www.geeksforgeeks.org/dsa/graph-and-its-representations/) — adjacency list vs matrix; know both cold
- **[GOOD]** [Transpose of a Graph](https://www.geeksforgeeks.org/dsa/transpose-graph/) — reverse all edges; the key trick behind Kosaraju's SCC algorithm
- **[MUST]** [Breadth First Traversal (BFS)](https://www.geeksforgeeks.org/dsa/breadth-first-search-or-bfs-for-a-graph/)
- **[MUST]** [Depth First Traversal (DFS)](https://www.geeksforgeeks.org/dsa/depth-first-search-or-dfs-for-a-graph/)
- **[MUST]** [BFS vs DFS — when to use which](https://www.geeksforgeeks.org/dsa/difference-between-bfs-and-dfs/)

## 2. BFS/DFS Applications (very common as standalone questions)
- **[MUST]** [Number of Islands (DFS)](https://www.geeksforgeeks.org/dsa/find-the-number-of-islands-using-dfs/)
- **[MUST]** [Flood Fill](https://www.geeksforgeeks.org/dsa/flood-fill-algorithm/)
- **[MUST]** [Check for Bipartite Graph](https://www.geeksforgeeks.org/dsa/bipartite-graph/)
- **[MUST]** [Rotten Oranges (multi-source BFS)](https://www.geeksforgeeks.org/dsa/minimum-time-required-so-that-all-oranges-become-rotten/)
- **[MUST]** [Shortest Path in Binary Matrix](https://www.geeksforgeeks.org/dsa/shortest-path-in-a-binary-maze/)
- **[GOOD]** [Word Ladder (shortest transformation chain)](https://www.geeksforgeeks.org/dsa/word-ladder-length-of-shortest-chain-to-reach-a-target-word/)
- **[GOOD]** [Clone a Graph](https://www.geeksforgeeks.org/dsa/clone-an-undirected-graph/)
- **[GOOD]** [Pacific Atlantic Water Flow](https://www.geeksforgeeks.org/dsa/atlantic-pacific-water-flow/)
- **[MUST — not on GfG]** **Bidirectional BFS pattern** — for "shortest transformation sequence" problems (Word Ladder II, Open the Lock). GfG's own [Bidirectional Search](https://www.geeksforgeeks.org/dsa/bidirectional-search/) page explains the generic AI-search version but never ties it to this problem family. Best walkthrough: [NeetCode — Word Ladder II](https://neetcode.io/problems/word-ladder-ii) or the top-voted [LeetCode discuss post on bidirectional BFS](https://leetcode.com/problems/word-ladder/solutions/) for Word Ladder.
- **[MUST — not on GfG]** **Multi-source BFS pattern** — generalizes Rotten Oranges to any "distance from multiple starting points" problem (01 Matrix, Walls and Gates). GfG treats each as a one-off problem; the pattern itself is best explained in [NeetCode's Graphs playlist](https://neetcode.io/courses/dsa-for-beginners/13) or [LeetCode's 01 Matrix official solution](https://leetcode.com/problems/01-matrix/solutions/).

## 3. Cycle Detection & Union-Find
- **[MUST]** [Detect Cycle in a Directed Graph](https://www.geeksforgeeks.org/dsa/detect-cycle-in-a-graph/)
- **[MUST]** [Detect Cycle in an Undirected Graph](https://www.geeksforgeeks.org/dsa/detect-cycle-undirected-graph/)
- **[MUST]** [Disjoint Set / Union-Find — Introduction](https://www.geeksforgeeks.org/dsa/introduction-to-disjoint-set-data-structure-or-union-find-algorithm/)
- **[MUST]** [Union by Rank and Path Compression](https://www.geeksforgeeks.org/dsa/union-by-rank-and-path-compression-in-union-find-algorithm/) — the optimized version interviewers actually expect
- **[MUST — not on GfG]** **Union-Find applied to real interview problems** — Number of Provinces, Accounts Merge, Redundant Connection, Graph Valid Tree all reduce to "Union-Find + count/detect." GfG teaches the data structure but not this problem family. Best coverage: [NeetCode — Union Find playlist](https://neetcode.io/practice?tab=graphs) or the pattern write-up in [LeetCode's "Union Find" tag explore card](https://leetcode.com/tag/union-find/).
- **[GOOD]** [Cycle Detection via Colors (directed, DFS-based)](https://www.geeksforgeeks.org/dsa/detect-cycle-direct-graph-using-colors/)

## 4. Topological Sort (extremely high-frequency at Google)
- **[MUST]** [Topological Sorting (DFS-based)](https://www.geeksforgeeks.org/dsa/topological-sorting/)
- **[MUST]** [Kahn's Algorithm (BFS-based / in-degree)](https://www.geeksforgeeks.org/dsa/topological-sorting-indegree-based-solution/)
- **[GOOD]** [Longest Path in a DAG](https://www.geeksforgeeks.org/dsa/find-longest-path-directed-acyclic-graph/)
- **[GOOD]** [Shortest Path in a DAG](https://www.geeksforgeeks.org/dsa/shortest-path-for-directed-acyclic-graphs/)

> **Highest-ROI applications of topological sort — not framed this way on GfG:**
> - **[MUST] Course Schedule I & II** — "can you finish all courses / give a valid order" = cycle detection + topo order via Kahn's. The single most-asked topological-sort question at Google/Meta. [NeetCode — Course Schedule](https://neetcode.io/problems/course-schedule) and [Course Schedule II](https://neetcode.io/problems/course-schedule-ii).
> - **[MUST] Alien Dictionary** — derive a topo order of letters from a sorted word list; the hard part is *building* the graph from adjacent-word comparisons, then Kahn's. Classic Google question. [NeetCode — Alien Dictionary](https://neetcode.io/problems/foreign-dictionary) (LeetCode 269, premium — NeetCode's version is free).
>
> Both reduce directly to Kahn's Algorithm above, but GfG only teaches the raw algorithm, not these applications.

## 5. Shortest Path
- **[MUST]** [Dijkstra's Algorithm](https://www.geeksforgeeks.org/dsa/dijkstras-shortest-path-algorithm-greedy-algo-7/)
- **[GOOD]** [Bellman-Ford (handles negative weights)](https://www.geeksforgeeks.org/dsa/bellman-ford-algorithm-dp-23/)
- **[GOOD]** [Floyd-Warshall (all-pairs shortest path)](https://www.geeksforgeeks.org/dsa/floyd-warshall-algorithm-dp-16/)
- **[NICE]** [Shortest Path in an Unweighted Graph (plain BFS variant)](https://www.geeksforgeeks.org/dsa/shortest-path-unweighted-graph/)
- **[NICE]** [0-1 BFS (binary-weighted shortest path)](https://www.geeksforgeeks.org/dsa/0-1-bfs-shortest-path-binary-graph/)
- **[NICE]** [Detecting Negative Cycle using Floyd-Warshall](https://www.geeksforgeeks.org/dsa/detecting-negative-cycle-using-floyd-warshall/) — good follow-up if you're asked about Bellman-Ford's negative-cycle check
- **[MUST — not on GfG]** **Constrained/state-augmented Dijkstra** — Google loves adding a twist to plain Dijkstra: "cheapest path with at most K stops," "path with max success probability," "path with fewest edges among shortest paths." The trick (augment the state, not just the distance array) isn't framed this way on GfG. Best coverage: [NeetCode — Cheapest Flights Within K Stops](https://neetcode.io/problems/cheapest-flights-within-k-stops) and [LeetCode discuss — Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/solutions/).

## 6. Minimum Spanning Tree
- **[MUST]** [Prim's Algorithm](https://www.geeksforgeeks.org/dsa/prims-minimum-spanning-tree-mst-greedy-algo-5/)
- **[MUST]** [Kruskal's Algorithm](https://www.geeksforgeeks.org/dsa/kruskals-minimum-spanning-tree-algorithm-greedy-algo-2/)
- **[GOOD]** [Prim's vs Kruskal's — when to use which](https://www.geeksforgeeks.org/dsa/difference-between-prims-and-kruskals-algorithm-for-mst/)

## 7. Connectivity & Strongly Connected Components
- **[GOOD]** [Strongly Connected Components (concept)](https://www.geeksforgeeks.org/dsa/strongly-connected-components/)
- **[GOOD]** [Tarjan's Algorithm for SCC](https://www.geeksforgeeks.org/dsa/tarjan-algorithm-find-strongly-connected-components/)
- **[NICE]** [Articulation Points (Cut Vertices)](https://www.geeksforgeeks.org/dsa/articulation-points-or-cut-vertices-in-a-graph/)
- **[NICE]** [Bridges in a Graph](https://www.geeksforgeeks.org/dsa/bridge-in-a-graph/)

## 8. High-Value "Must Do" Problems
- **[MUST]** [Number of Islands / Largest Region in Boolean Matrix](https://www.geeksforgeeks.org/dsa/find-length-largest-region-boolean-matrix/)
- **[GOOD]** [Graph Coloring](https://www.geeksforgeeks.org/dsa/graph-coloring-applications/)
- **[GOOD]** [Boggle — All Words on a Board (DFS + backtracking)](https://www.geeksforgeeks.org/dsa/boggle-find-possible-words-board-characters/)
- **[NICE]** [Count Trees in a Forest](https://www.geeksforgeeks.org/dsa/count-number-trees-forest/)
- **[GOOD — not on GfG]** **BFS + Bitmask DP ("Shortest Path Visiting All Nodes")** — a genuinely Google-flavored pattern: treat "which nodes visited so far" as bits in a state and BFS/DP over (node, bitmask) pairs. GfG's TSP article uses pure DP-on-bitmask without the BFS framing this needs. Best coverage: [LeetCode 847 — Shortest Path Visiting All Nodes, top discuss solutions](https://leetcode.com/problems/shortest-path-visiting-all-nodes/solutions/) and [NeetCode's walkthrough](https://neetcode.io/problems/shortest-path-visiting-all-nodes).

## 9. Reference / Practice
- [Graph Data Structure — full topic index](https://www.geeksforgeeks.org/dsa/graph-data-structure/)
- [Practice Graph Problems (GfG problem set)](https://www.geeksforgeeks.org/explore?page=1&category=Graph)
- [Interesting Shortest Path Questions](https://www.geeksforgeeks.org/dsa/interesting-shortest-path-questions-set-1/)

---

## Suggested prep order
1. Foundations + BFS/DFS applications (Section 1–2)
2. Topological Sort (Section 4) — very high ROI for Google
3. Union-Find + Cycle Detection (Section 3)
4. Dijkstra + MST (Sections 5–6)
5. SCC / Articulation Points if time allows (Section 7)
