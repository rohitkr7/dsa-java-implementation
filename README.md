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
├── ds_01_linkedList/                  # Singly Linked List implementation
│   └── SinglyLinkedList.java
├── ds_02_stack/                       # Stack (LIFO) implementation
│   └── Stack.java
├── ds_03_queue/                       # Queue (FIFO) implementation
│   └── Queue.java
├── ds_04_hashMap/                     # Custom Hash Map implementation
│   └── HashMap.java
└── README.md
```

---

## 🛠️ Implemented Data Structures

| Data Structure | Package | Key Operations | Description |
| :--- | :--- | :--- | :--- |
| **Singly Linked List** | `ds_01_linkedList` | `insertAtStart`, `insertAtEnd`, `insertAtIndex`, `deleteAt`, `reverse`, `search` | Dynamic node-based linear structure with pointer manipulation, traversal, cycle detection, and reversal. |
| **Stack** | `ds_02_stack` | `push`, `pop`, `peek`, `size`, `isEmpty` | Last-In-First-Out (LIFO) stack implemented using linked nodes with $O(1)$ operations. |
| **Queue** | `ds_03_queue` | `push` (enqueue), `pop` (dequeue), `peek`, `size`, `isEmpty` | First-In-First-Out (FIFO) queue implemented using linked nodes maintaining head and tail references. |
| **Hash Map** | `ds_04_hashMap` | `put`, `get`, `remove`, `containsKey`, `size` | Array-of-buckets hash table using separate chaining for collision resolution with custom hash calculation. |

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
   javac ds_01_linkedList/SinglyLinkedList.java
   ```

3. **Run the implementation:**
   ```bash
   # Example: Executing the main driver method
   java ds_01_linkedList.SinglyLinkedList
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
