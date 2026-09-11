# 📊 DSA Implementation & Progress Tracker

This document tracks all core Data Structures and Algorithms planned and implemented from scratch in Java in this repository, prioritized by their importance in technical interviews.

---

### Status Legend
- `✅ Completed` - Implemented and functional in repository
- `⏳ In Progress` - Currently being developed
- `⬜ Not Started` - Planned for implementation

### Interview Priority Legend
- `🔥 High` - **Must-Know (Tier 1 / FAANG Essential)**: Frequently asked directly or forms the core pattern of coding rounds.
- `⭐ Medium` - **Important**: Frequently tested in follow-up rounds, design questions, or medium-hard problems.
- `📘 Low` - **Foundational / Advanced**: Good for conceptual depth; rarely asked to implement from scratch in a 45-min interview.

---

## 📌 Summary Dashboard

| Category | Total Topics | 🔥 High Priority | Completed | In Progress | Not Started | Overall Progress |
| :--- | :---: | :---: | :---: | :---: | :---: | :---: |
| **Data Structures** | 23 | 15 | 6 | 0 | 17 | `26%` |
| **Algorithms** | 30 | 17 | 0 | 0 | 30 | `0%` |
| **Overall** | **53** | **32** | **6** | **0** | **47** | **`11%`** |

---

## 🧱 1. Data Structures

### 1.1 Linear Data Structures
| Status | Priority | Data Structure | Package / Location | Key Operations / Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ⬜ | `⭐ Medium` | **Dynamic Array (Custom ArrayList)** | `ds_01_array/DynamicArray.java` | Resizing policy (doubling), amortized $O(1)$ append, element shifting |
| ✅ | `🔥 High` | **Singly Linked List** | [`ds_02_linkedList/SinglyLinkedList.java`](ds_02_linkedList/SinglyLinkedList.java) | Reversal, cycle detection (Floyd's), middle node, merge two lists |
| ⬜ | `🔥 High` | **Doubly Linked List** | `ds_02_linkedList/DoublyLinkedList.java` | Bidirectional pointers; foundational for building LRU Cache & Deque |
| ⬜ | `📘 Low` | **Circular Linked List** | `ds_02_linkedList/CircularLinkedList.java` | Round-robin scheduling, circular traversal |
| ✅ | `🔥 High` | **Stack (Linked Node based)** | [`ds_03_stack/Stack.java`](ds_03_stack/Stack.java) | LIFO, $O(1)$ push/pop/peek; monotonic stack patterns |
| ⬜ | `⭐ Medium` | **Stack (Array based)** | `ds_03_stack/ArrayStack.java` | Fixed/resizing array implementation with overflow handling |
| ✅ | `🔥 High` | **Queue (Linked Node based)** | [`ds_04_queue/Queue.java`](ds_04_queue/Queue.java) | FIFO, $O(1)$ enqueue/dequeue; core for BFS & tree level-order |
| ⬜ | `⭐ Medium` | **Queue (Circular Array based)** | `ds_04_queue/CircularQueue.java` | Ring buffer with modulo arithmetic (frequent "Design Circular Queue" question) |
| ⬜ | `🔥 High` | **Double-Ended Queue (Deque)** | `ds_04_queue/Deque.java` | Insert/delete at both ends; essential for sliding window maximum |

### 1.2 Hash-Based Data Structures
| Status | Priority | Data Structure | Package / Location | Key Operations / Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ✅ | `🔥 High` | **Hash Map (Separate Chaining)** | [`ds_05_hashMap/HashMap.java`](ds_05_hashMap/HashMap.java) | Array of buckets with linked lists, hash functions, collision handling, load factor |
| ⬜ | `⭐ Medium` | **Hash Map (Open Addressing)** | `ds_05_hashMap/OpenAddressingHashMap.java` | Linear probing, quadratic probing, tombstone deletion |
| ⬜ | `⭐ Medium` | **Hash Set** | `ds_05_hashMap/HashSet.java` | Set implementation backed by hashing ($O(1)$ lookup/insert/remove) |

### 1.3 Tree Data Structures
| Status | Priority | Data Structure | Package / Location | Key Operations / Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ⬜ | `🔥 High` | **Binary Tree** | `ds_06_tree/BinaryTree.java` | In/Pre/Post/Level order traversals, height, diameter, LCA |
| ⬜ | `🔥 High` | **Binary Search Tree (BST)** | `ds_06_tree/BinarySearchTree.java` | Insert, search, delete (3 cases), validate BST, predecessor/successor |
| ⬜ | `⭐ Medium` | **AVL Tree** | `ds_06_tree/AVLTree.java` | Self-balancing BST using LL, RR, LR, RL rotations (balance factor) |
| ⬜ | `📘 Low` | **Red-Black Tree** | `ds_06_tree/RedBlackTree.java` | Conceptually asked in Java HashMap internals; rarely coded from scratch |
| ⬜ | `🔥 High` | **Trie (Prefix Tree)** | `ds_06_tree/Trie.java` | Prefix search, autocomplete, Word Search II, dictionary matching |
| ⬜ | `⭐ Medium` | **Segment Tree** | `ds_06_tree/SegmentTree.java` | Range sum/min/max queries with point updates ($O(\log N)$) |
| ⬜ | `⭐ Medium` | **Fenwick Tree (BIT)** | `ds_06_tree/FenwickTree.java` | Binary Indexed Tree for prefix sums with low memory overhead |

### 1.4 Heaps & Priority Queues
| Status | Priority | Data Structure | Package / Location | Key Operations / Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ⬜ | `🔥 High` | **Min Heap (Array based)** | `ds_07_heap_priority_queue/MinHeap.java` | Array representation, heapify-up/down, extractMin; Top-K problems |
| ⬜ | `🔥 High` | **Max Heap (Array based)** | `ds_07_heap_priority_queue/MaxHeap.java` | Array representation, heapify-up/down, extractMax; Median of stream |
| ✅ | `🔥 High` | **Min Priority Queue (Array based)** | [`ds_07_heap_priority_queue/MinPriorityQueue.java`](ds_07_heap_priority_queue/MinPriorityQueue.java) | Heap-backed priority queue; core for Dijkstra & Greedy interval problems |
| ✅ | `🔥 High` | **Linked Min Priority Queue (Tree based)** | [`ds_07_heap_priority_queue/LinkedMinPriorityQueue.java`](ds_07_heap_priority_queue/LinkedMinPriorityQueue.java) | Node-based tree representation with parent/child links; siftUp/siftDown |

### 1.5 Advanced / Specialized Structures
| Status | Priority | Data Structure | Package / Location | Key Operations / Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ⬜ | `🔥 High` | **Disjoint Set Union (DSU)** | `ds_08_advanced/DisjointSetUnion.java` | Union-Find with path compression & union by rank; Kruskal & connected components |
| ⬜ | `🔥 High` | **LRU Cache** | `ds_08_advanced/LRUCache.java` | Hash Map + Doubly Linked List for $O(1)$ get and put (top interview favorite) |
| ⬜ | `⭐ Medium` | **LFU Cache** | `ds_08_advanced/LFUCache.java` | Least Frequently Used cache with frequency buckets ($O(1)$ operations) |

---

## ⚡ 2. Algorithms

### 2.1 Searching Algorithms
| Status | Priority | Algorithm | Package / Location | Time Complexity | Interview Notes |
| :---: | :---: | :--- | :--- | :---: | :--- |
| ⬜ | `📘 Low` | **Linear Search** | `algo_01_search/LinearSearch.java` | $O(N)$ | Basic baseline search |
| ⬜ | `🔥 High` | **Binary Search (Iterative & Recursive)** | `algo_01_search/BinarySearch.java` | $O(\log N)$ | Must-know: lower bound, upper bound, binary search on answer space |
| ⬜ | `🔥 High` | **Search in Rotated Sorted Array** | `algo_01_search/RotatedBinarySearch.java` | $O(\log N)$ | Modified binary search handling inflection/pivot point |

### 2.2 Sorting Algorithms
| Status | Priority | Algorithm | Package / Location | Best / Avg / Worst | Interview Notes |
| :---: | :---: | :--- | :--- | :---: | :--- |
| ⬜ | `📘 Low` | **Bubble Sort** | `algo_02_sort/BubbleSort.java` | $O(N) / O(N^2) / O(N^2)$ | Conceptual foundational sort |
| ⬜ | `📘 Low` | **Selection Sort** | `algo_02_sort/SelectionSort.java` | $O(N^2) / O(N^2) / O(N^2)$ | Selection of minimum element |
| ⬜ | `📘 Low` | **Insertion Sort** | `algo_02_sort/InsertionSort.java` | $O(N) / O(N^2) / O(N^2)$ | Efficient for nearly-sorted arrays |
| ⬜ | `🔥 High` | **Merge Sort** | `algo_02_sort/MergeSort.java` | $O(N \log N)$ (all) | Divide-and-conquer, stable sort, count inversions, sort linked list |
| ⬜ | `🔥 High` | **Quick Sort** | `algo_02_sort/QuickSort.java` | $O(N \log N) / O(N \log N) / O(N^2)$ | Partitioning logic (Lomuto/Hoare), QuickSelect for K-th largest element |
| ⬜ | `⭐ Medium` | **Heap Sort** | `algo_02_sort/HeapSort.java` | $O(N \log N)$ (all) | In-place $O(1)$ space sorting using binary heap |
| ⬜ | `⭐ Medium` | **Counting Sort** | `algo_02_sort/CountingSort.java` | $O(N + K)$ | Non-comparison sort, frequency array, Dutch National Flag connection |

### 2.3 Graph Algorithms
| Status | Priority | Algorithm | Package / Location | Time Complexity | Interview Notes |
| :---: | :---: | :--- | :--- | :---: | :--- |
| ⬜ | `🔥 High` | **Breadth-First Search (BFS)** | `algo_03_graph/GraphBFS.java` | $O(V + E)$ | Shortest path in unweighted graphs, level-order processing |
| ⬜ | `🔥 High` | **Depth-First Search (DFS)** | `algo_03_graph/GraphDFS.java` | $O(V + E)$ | Connected components, cycle detection, path finding |
| ⬜ | `🔥 High` | **Cycle Detection (Directed & Undirected)** | `algo_03_graph/CycleDetection.java` | $O(V + E)$ | Visited states (0/1/2 or white/gray/black), parent tracking, DSU |
| ⬜ | `🔥 High` | **Dijkstra's Algorithm** | `algo_03_graph/Dijkstra.java` | $O((V + E) \log V)$ | Single-source shortest path (non-negative weights) using min-heap |
| ⬜ | `⭐ Medium` | **Bellman-Ford Algorithm** | `algo_03_graph/BellmanFord.java` | $O(V \cdot E)$ | Shortest path with negative weights, negative cycle detection |
| ⬜ | `⭐ Medium` | **Floyd-Warshall Algorithm** | `algo_03_graph/FloydWarshall.java` | $O(V^3)$ | All-pairs shortest path dynamic programming |
| ⬜ | `⭐ Medium` | **Prim's Algorithm** | `algo_03_graph/PrimsMST.java` | $O(E \log V)$ | Minimum Spanning Tree (greedy cut property with PriorityQueue) |
| ⬜ | `🔥 High` | **Kruskal's Algorithm** | `algo_03_graph/KruskalsMST.java` | $O(E \log E)$ | Minimum Spanning Tree using DSU and edge sorting |
| ⬜ | `🔥 High` | **Topological Sort** | `algo_03_graph/TopologicalSort.java` | $O(V + E)$ | Kahn's algorithm (indegree queue) & DFS post-order stack (Course Schedule) |
| ⬜ | `⭐ Medium` | **Tarjan's / Kosaraju's Algorithm** | `algo_03_graph/StronglyConnectedComponents.java` | $O(V + E)$ | Bridges, articulation points, Strongly Connected Components (SCC) |

### 2.4 Dynamic Programming
| Status | Priority | Algorithm / Problem | Package / Location | Technique & Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ⬜ | `🔥 High` | **0/1 Knapsack Problem** | `algo_04_dp/Knapsack01.java` | Core DP pattern (Subset Sum, Partition Equal Subset Sum) |
| ⬜ | `🔥 High` | **Unbounded Knapsack** | `algo_04_dp/UnboundedKnapsack.java` | 1D space optimization, Rod Cutting, Coin Change foundations |
| ⬜ | `🔥 High` | **Longest Common Subsequence (LCS)** | `algo_04_dp/LongestCommonSubsequence.java` | String DP pattern, Shortest Common Supersequence, Edit Distance base |
| ⬜ | `🔥 High` | **Longest Increasing Subsequence (LIS)** | `algo_04_dp/LongestIncreasingSubsequence.java` | $O(N^2)$ DP and $O(N \log N)$ Binary Search (Patience Sort) |
| ⬜ | `🔥 High` | **Coin Change (Min Coins & Total Ways)** | `algo_04_dp/CoinChange.java` | Unbounded knapsack variant; one of the most asked DP problems |
| ⬜ | `🔥 High` | **Edit Distance (Levenshtein)** | `algo_04_dp/EditDistance.java` | 2D matrix state transitions (Insert, Delete, Replace) |
| ⬜ | `⭐ Medium` | **Matrix Chain Multiplication (MCM)** | `algo_04_dp/MatrixChainMultiplication.java` | Interval DP / partition pattern (Burst Balloons, Palindrome Partitioning) |

### 2.5 Backtracking & Recursion
| Status | Priority | Algorithm / Problem | Package / Location | Interview Notes |
| :---: | :---: | :--- | :--- | :--- |
| ⬜ | `⭐ Medium` | **N-Queens Problem** | `algo_05_backtracking/NQueens.java` | Classic backtracking with row/col/diagonal constraint validation |
| ⬜ | `⭐ Medium` | **Sudoku Solver** | `algo_05_backtracking/SudokuSolver.java` | 9x9 grid constraint satisfaction with pruning |
| ⬜ | `🔥 High` | **Subsets & Permutations** | `algo_05_backtracking/SubsetsPermutations.java` | Power set, permutations with/without duplicates, combination sum |
