# Data Structures & Algorithms in Java

A curated repository dedicated **exclusively** to core Data Structures and Algorithm implementations from scratch in Java.

This project focuses on fundamental data structures, memory layouts, pointer/reference manipulation, and algorithmic efficiency without relying on Java's built-in collections framework.

---

## 📋 Coding Practice Master Sheet

In addition to core implementations, this repository includes tracking and practice tools:

- **[`TRACKER.md`](TRACKER.md)**: Live checklist tracking completed vs. pending implementations across all core data structures and algorithms.
- **[`Coding_Interview_Master_List.xlsx`](Coding_Interview_Master_List.xlsx)**: A comprehensive problem tracker covering curated coding problems, categorizations by pattern/data structure, difficulty levels, status, and notes for technical interview prep.

---

## 📂 Repository Structure

```
dsa-java-implementation/
├── Coding_Interview_Master_List.xlsx  # Master coding interview problem tracker
├── TRACKER.md                         # Implementation progress tracker (completed vs pending)
├── ds_01_array/                       # Dynamic Array (Custom ArrayList)
├── ds_02_linkedList/                  # Singly, Doubly, and Circular Linked Lists
│   └── SinglyLinkedList.java
├── ds_03_stack/                       # Stack implementations (Linked & Array based)
│   └── Stack.java
├── ds_04_queue/                       # Queue, Circular Queue, and Deque
│   └── Queue.java
├── ds_05_hashMap/                     # Hash Map and Hash Set implementations
│   └── HashMap.java
├── ds_06_tree/                        # Binary Tree, BST, AVL, Trie, Segment Tree
├── ds_07_heap_priority_queue/        # Min-Heap, Max-Heap, Priority Queue
│   ├── LinkedMinPriorityQueue.java
│   └── MinPriorityQueue.java
├── ds_08_advanced/                    # Disjoint Set Union (DSU), LRU/LFU Cache
├── algo_01_search/                    # Linear, Binary, Rotated Search
├── algo_02_sort/                      # Merge, Quick, Heap, Counting Sort
├── algo_03_graph/                     # BFS, DFS, Dijkstra, TopoSort, MST
├── algo_04_dp/                        # Knapsack, LCS, LIS, Coin Change
├── algo_05_backtracking/              # N-Queens, Sudoku, Subsets & Permutations
└── README.md
```

---

## 🛠️ Implemented Data Structures

| Data Structure | Package | Key Operations | Description |
| :--- | :--- | :--- | :--- |
| **Singly Linked List** | `ds_02_linkedList` | `insertAtStart`, `insertAtEnd`, `insertAtIndex`, `deleteAt`, `reverse`, `search` | Dynamic node-based linear structure with pointer manipulation, traversal, cycle detection, and reversal. |
| **Stack** | `ds_03_stack` | `push`, `pop`, `peek`, `size`, `isEmpty` | Last-In-First-Out (LIFO) stack implemented using linked nodes with $O(1)$ operations. |
| **Queue** | `ds_04_queue` | `push` (enqueue), `pop` (dequeue), `peek`, `size`, `isEmpty` | First-In-First-Out (FIFO) queue implemented using linked nodes maintaining head and tail references. |
| **Hash Map** | `ds_05_hashMap` | `put`, `get`, `remove`, `containsKey`, `size` | Array-of-buckets hash table using separate chaining for collision resolution with custom hash calculation. |
| **Linked Min Priority Queue** | `ds_07_heap_priority_queue` | `insert`, `extractMin`, `peek`, `size`, `isEmpty` | Tree/node-based pointer implementation of a min priority queue with parent and child links. |
| **Min Priority Queue** | `ds_07_heap_priority_queue` | `insert`, `extractMin`, `peek`, `size`, `isEmpty` | Dynamic array-backed binary min-heap priority queue with $O(\log N)$ operations. |

---

## 🚀 Getting Started

### Prerequisites
- **Java Development Kit (JDK 8 or higher)**
- Any standard Java IDE (IntelliJ IDEA, Eclipse, VS Code) or the command-line interface.

### Compiling and Running from Terminal

1. **Clone the repository:**
   ```bash
   git clone https://github.com/rohitkr7/dsa-java-implementation.git
   cd dsa-java-implementation
   ```

2. **Compile a data structure:**
   ```bash
   # Example: Compiling Singly Linked List
   javac ds_02_linkedList/SinglyLinkedList.java
   ```

3. **Run the implementation:**
   ```bash
   # Example: Executing the main driver method
   java ds_02_linkedList.SinglyLinkedList
   ```

---

## 🗺️ Roadmap & Upcoming Implementations

- [ ] **Trees**: Binary Tree, Binary Search Tree (BST), AVL Tree, Trie, Segment Tree
- [ ] **Heaps**: Min-Heap, Max-Heap, Priority Queue
- [ ] **Disjoint Set**: Union-Find (Disjoint Set Union)
- [ ] **Graphs**: Adjacency List/Matrix, BFS, DFS, Dijkstra's, Topological Sort
- [ ] **Sorting Algorithms**: Merge Sort, Quick Sort, Heap Sort, Counting Sort
- [ ] **Searching Algorithms**: Binary Search variants
- [ ] **Advanced Algorithms**: Dynamic Programming, Greedy, Backtracking, Divide & Conquer
