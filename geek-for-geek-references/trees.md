# Tree Data Structure

Curated from the [GfG Tree Data Structure hub](https://www.geeksforgeeks.org/dsa/tree-data-structure/) and organized by pattern. The hub page itself is mostly data-structure internals (AVL rotations, Red-Black, B-Tree, Ternary Search Tree) and links almost none of the problems that actually get asked, so most items below are pulled from elsewhere on GfG — every link here points to a real GfG article except the three explicitly marked as off-site.

**Priority legend**
- **[MUST]** — expect this; know it cold, codeable in 15–20 min
- **[GOOD]** — comes up often enough to be worth knowing well
- **[NICE]** — occasional ask, mostly senior/staff level or as a follow-up

## Foundations
- [Introduction to Tree Data Structure](https://www.geeksforgeeks.org/dsa/introduction-to-tree-data-structure/) — **[MUST]**
- [Introduction to Binary Tree](https://www.geeksforgeeks.org/dsa/introduction-to-binary-tree/) — **[MUST]**
- [Types of Binary Tree](https://www.geeksforgeeks.org/dsa/types-of-binary-tree/) — **[GOOD]** (full vs complete vs perfect — the vocabulary interviewers use in follow-ups)
- [Properties of Binary Tree](https://www.geeksforgeeks.org/dsa/properties-of-binary-tree/) — **[GOOD]** (height/node-count bounds; needed to justify complexities out loud)

## Traversals
- [Inorder Traversal](https://www.geeksforgeeks.org/dsa/inorder-traversal-of-binary-tree/) — **[MUST]**
- [Preorder Traversal](https://www.geeksforgeeks.org/dsa/preorder-traversal-of-binary-tree/) — **[MUST]**
- [Postorder Traversal](https://www.geeksforgeeks.org/dsa/postorder-traversal-of-binary-tree/) — **[MUST]**
- [Level Order Traversal (BFS)](https://www.geeksforgeeks.org/dsa/level-order-tree-traversal/) — **[MUST]**
- [Iterative Inorder Using a Stack](https://www.geeksforgeeks.org/dsa/inorder-tree-traversal-without-recursion/) — **[MUST]** (the "now do it without recursion" follow-up is near-guaranteed)
- [Zigzag / Spiral Level Order](https://www.geeksforgeeks.org/dsa/zigzag-tree-traversal/) — **[MUST]**
- [Right View of a Binary Tree](https://www.geeksforgeeks.org/dsa/print-right-view-binary-tree-2/) — **[GOOD]**
- [Top View of a Binary Tree](https://www.geeksforgeeks.org/dsa/print-nodes-top-view-binary-tree/) — **[GOOD]** (horizontal-distance + hashmap trick)
- [Vertical Order Traversal](https://www.geeksforgeeks.org/dsa/vertical-order-traversal-of-binary-tree-using-map/) — **[GOOD]**
- [Boundary Traversal](https://www.geeksforgeeks.org/dsa/boundary-traversal-of-binary-tree/) — **[GOOD]**
- [Morris Traversal — Inorder in O(1) Space](https://www.geeksforgeeks.org/dsa/inorder-tree-traversal-without-recursion-and-without-stack/) — **[NICE]** (threading trick; a staff-level "can you do better than O(h) space" answer)
- **[GOOD — not on GfG]** **Vertical order with strict LeetCode-987 tie-breaking** — GfG's map-based version groups by horizontal distance but doesn't enforce the "same (row, col) → sort by value" rule that the interview version requires, and that ordering detail is where most candidates lose the problem. Best coverage: [LeetCode 987 official solution](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/solutions/).

## Core Structural Problems
- [Height / Maximum Depth](https://www.geeksforgeeks.org/dsa/find-the-maximum-depth-or-height-of-a-tree/) — **[MUST]**
- [Diameter of a Binary Tree](https://www.geeksforgeeks.org/dsa/diameter-of-a-binary-tree/) — **[MUST]** (the canonical "return one value, update a global" pattern)
- [Check if a Tree is Height-Balanced](https://www.geeksforgeeks.org/dsa/how-to-determine-if-a-binary-tree-is-balanced/) — **[MUST]** (know the single-pass O(n) version, not the O(n²) one)
- [Identical Trees](https://www.geeksforgeeks.org/dsa/write-c-code-to-determine-if-two-trees-are-identical/) — **[MUST]**
- [Mirror / Invert a Binary Tree](https://www.geeksforgeeks.org/dsa/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/) — **[MUST]**
- [Symmetric Tree](https://www.geeksforgeeks.org/dsa/symmetric-tree-tree-which-is-mirror-image-of-itself/) — **[MUST]**
- [Check if Subtree of Another Tree](https://www.geeksforgeeks.org/dsa/check-if-a-binary-tree-is-subtree-of-another-binary-tree/) — **[GOOD]**
- [Connect Nodes at Same Level](https://www.geeksforgeeks.org/dsa/connect-nodes-at-same-level/) — **[GOOD]** (the O(1)-space version is the real question)
- [Binary Tree to Doubly Linked List](https://www.geeksforgeeks.org/dsa/convert-binary-tree-to-doubly-linked-list-by-keeping-track-of-visited-node/) — **[GOOD]** (same shape as "flatten tree to list")
- [Children Sum Property](https://www.geeksforgeeks.org/dsa/check-for-children-sum-property-in-a-binary-tree/) — **[NICE]**

## Path & Sum Problems
- [Maximum Path Sum Between Any Two Nodes](https://www.geeksforgeeks.org/dsa/find-maximum-path-sum-in-a-binary-tree/) — **[MUST]** (the hard part is returning one branch upward while scoring both)
- [Nodes at Distance K from a Given Node](https://www.geeksforgeeks.org/dsa/print-nodes-distance-k-given-node-binary-tree/) — **[MUST]** (needs parent links or a parent map — a Google favorite)
- [K-Sum Paths](https://www.geeksforgeeks.org/dsa/count-all-k-sum-paths-in-a-binary-tree/) — **[GOOD]** (prefix-sum hashmap carried down the recursion)
- [Maximum Path Sum Between Two Leaves](https://www.geeksforgeeks.org/dsa/find-maximum-path-sum-two-leaves-binary-tree/) — **[GOOD]**
- [Maximum Sum of Non-Adjacent Nodes](https://www.geeksforgeeks.org/dsa/maximum-sum-nodes-binary-tree-no-two-adjacent/) — **[GOOD]** (House Robber III; the include/exclude tree-DP pattern)
- [Minimum Distance Between Two Nodes](https://www.geeksforgeeks.org/dsa/find-distance-between-two-nodes-of-a-binary-tree/) — **[GOOD]** (reduces to LCA + two depths)
- [Burn a Binary Tree from a Target Node](https://www.geeksforgeeks.org/dsa/burn-the-binary-tree-starting-from-the-target-node/) — **[GOOD]** (BFS over an implicit undirected graph)
- [Print Ancestors of a Node](https://www.geeksforgeeks.org/dsa/print-ancestors-of-a-given-node-in-binary-tree/) — **[NICE]**

## Lowest Common Ancestor
- [LCA in a Binary Tree](https://www.geeksforgeeks.org/dsa/lowest-common-ancestor-binary-tree-set-1/) — **[MUST]** (single-traversal version; be ready for the "what if a key is absent" follow-up)
- [LCA in a BST](https://www.geeksforgeeks.org/dsa/lowest-common-ancestor-in-a-binary-search-tree/) — **[MUST]** (O(h), no recursion needed)
- [LCA Using Parent Pointers](https://www.geeksforgeeks.org/dsa/lowest-common-ancestor-in-a-binary-tree-using-parent-pointer/) — **[NICE]**
- [LCA via RMQ / Sparse Table](https://www.geeksforgeeks.org/dsa/lowest-common-ancestor-in-a-binary-tree-set-3-using-rmq/) — **[NICE]** (O(1) per query after preprocessing; the answer to "now handle a million queries")

## Construction & Serialization
- [Build Tree from Inorder + Preorder](https://www.geeksforgeeks.org/dsa/construct-tree-from-given-inorder-and-preorder-traversal/) — **[MUST]** (the hashmap-index optimization is the point)
- [Serialize and Deserialize a Binary Tree](https://www.geeksforgeeks.org/dsa/serialize-deserialize-binary-tree/) — **[MUST]** (know why preorder + null markers works and level-order alone doesn't)
- [Sorted Array to Balanced BST](https://www.geeksforgeeks.org/dsa/sorted-array-to-balanced-bst/) — **[MUST]**
- [BST from Preorder Traversal](https://www.geeksforgeeks.org/dsa/construct-bst-from-given-preorder-traversa/) — **[GOOD]** (the O(n) bounds-based solution, not the O(n²) one)
- [Sorted Linked List to Balanced BST](https://www.geeksforgeeks.org/dsa/sorted-linked-list-to-balanced-bst/) — **[NICE]**

## Binary Search Tree
- [Introduction to BST](https://www.geeksforgeeks.org/dsa/introduction-to-binary-search-tree/) — **[MUST]**
- [Search and Insert](https://www.geeksforgeeks.org/dsa/binary-search-tree-set-1-search-and-insertion/) — **[MUST]**
- [Deletion in a BST](https://www.geeksforgeeks.org/dsa/deletion-in-binary-search-tree/) — **[MUST]** (the two-children case is the whole question)
- [Validate a BST](https://www.geeksforgeeks.org/dsa/a-program-to-check-if-a-binary-tree-is-bst-or-not/) — **[MUST]** (min/max bounds, not just local comparisons — the classic trap)
- [Kth Largest / Kth Smallest in a BST](https://www.geeksforgeeks.org/dsa/kth-largest-element-bst-using-constant-extra-space/) — **[MUST]** (kth smallest is the same walk in the other direction; early-terminating iterative inorder is the expected answer)
- [Inorder Successor in a BST](https://www.geeksforgeeks.org/dsa/inorder-successor-in-binary-search-tree/) — **[GOOD]**
- [Pair with Given Sum in a BST](https://www.geeksforgeeks.org/dsa/find-a-pair-with-given-sum-in-bst/) — **[GOOD]** (two-pointer over inorder, or two stacks for O(h) space)
- [Fix Two Swapped Nodes of a BST](https://www.geeksforgeeks.org/dsa/fix-two-swapped-nodes-of-bst/) — **[GOOD]** (Recover BST)
- [Largest BST in a Binary Tree](https://www.geeksforgeeks.org/dsa/largest-bst-binary-tree-set-2/) — **[GOOD]** (bottom-up aggregation of (min, max, size, isBST))
- [Remove BST Keys Outside a Range](https://www.geeksforgeeks.org/dsa/remove-bst-keys-outside-the-given-range/) — **[NICE]**
- [BST to Greater Sum Tree](https://www.geeksforgeeks.org/dsa/transform-bst-sum-tree/) — **[NICE]** (reverse inorder with a running sum)
- [Merge Two BSTs](https://www.geeksforgeeks.org/dsa/merge-two-bsts-with-limited-extra-space/) — **[NICE]**
- **[GOOD — not on GfG]** **BST Iterator (lazy controlled inorder)** — a design-flavored ask: expose `next()` / `hasNext()` in O(1) amortized time and O(h) space by keeping a partially-descended stack. GfG covers iterative inorder as a traversal but never as an incremental iterator interface, which is the part being tested. Best coverage: [NeetCode — Binary Search Tree Iterator](https://neetcode.io/problems/binary-search-tree-iterator).

## Trie (Prefix Tree)
- [Trie — Introduction and Common Questions](https://www.geeksforgeeks.org/dsa/introduction-to-trie-data-structure-and-algorithm-tutorials/) — **[MUST]**
- [Trie — Insert and Search](https://www.geeksforgeeks.org/dsa/trie-insert-and-search/) — **[MUST]** (implement it from scratch; know the array-vs-hashmap child tradeoff)
- [Trie — Delete](https://www.geeksforgeeks.org/dsa/trie-delete/) — **[GOOD]**
- [Auto-Complete Using a Trie](https://www.geeksforgeeks.org/dsa/auto-complete-feature-using-trie/) — **[GOOD]** (prefix descent + subtree collection; also a common system-design tie-in)
- [Word Search in a 2D Grid](https://www.geeksforgeeks.org/dsa/search-a-word-in-a-2d-grid-of-characters/) — **[GOOD]** (GfG's version matches straight lines in 8 directions; the interview version allows turns, so practice the backtracking form too)
- **[MUST — not on GfG]** **Trie + backtracking for multi-word grid search (Word Search II)** — search many words at once by walking the grid and the trie in lockstep, pruning dead prefixes. GfG has both tries and grid search but never combines them, and the combination is the entire point of the question. Best coverage: [NeetCode — Word Search II](https://neetcode.io/problems/search-for-word-ii) and [NeetCode — Design Add and Search Words](https://neetcode.io/problems/design-word-search-data-structure) for the wildcard variant.

## N-ary Trees
- [Generic (N-ary) Trees](https://www.geeksforgeeks.org/dsa/generic-treesn-array-trees/) — **[GOOD]**
- [Level Order Traversal of an N-ary Tree](https://www.geeksforgeeks.org/dsa/level-order-traversal-of-n-ary-tree/) — **[GOOD]**
- [Diameter of an N-ary Tree](https://www.geeksforgeeks.org/dsa/diameter-n-ary-tree/) — **[NICE]**
- [Serialize and Deserialize an N-ary Tree](https://www.geeksforgeeks.org/dsa/serialize-deserialize-n-ary-tree/) — **[NICE]**

## Balanced & Disk-Based Trees (conceptual only)
*Expect discussion, not implementation — nobody codes AVL rotations in a 45-minute loop, but "why is your index a B-Tree and not a BST" is a fair system-design question.*
- [AVL Tree — Introduction](https://www.geeksforgeeks.org/dsa/introduction-to-avl-tree/) — **[NICE]** (know rotations conceptually and the O(log n) guarantee)
- [Red-Black Tree — Introduction](https://www.geeksforgeeks.org/dsa/introduction-to-red-black-tree/) — **[NICE]** (why `std::map` / `TreeMap` use it)
- [B-Tree — Introduction](https://www.geeksforgeeks.org/dsa/introduction-of-b-tree-2/) — **[NICE]** (high fan-out for disk/database indexes)

## Range Query Structures
- [Segment Tree](https://www.geeksforgeeks.org/dsa/segment-tree-data-structure/) — **[NICE]** (range query + point update; occasional senior ask)
- [Binary Indexed Tree (Fenwick Tree)](https://www.geeksforgeeks.org/dsa/binary-indexed-tree-or-fenwick-tree-2/) — **[NICE]** (prefix sums with updates; shorter to code than a segment tree)

## Reference / Practice
- [GfG — Tree Coding Problems for Interviews](https://www.geeksforgeeks.org/dsa/top-50-tree-coding-problems-for-interviews/) and [BST Coding Problems for Interviews](https://www.geeksforgeeks.org/dsa/top-50-binary-search-tree-coding-problems-for-interviews/)
- [GfG — Practice Tree Problems](https://www.geeksforgeeks.org/explore?page=1&category=Tree)
- LeetCode's [Tree](https://leetcode.com/tag/tree/) and [Trie](https://leetcode.com/tag/trie/) tags, plus the tree subset of Blind 75 / NeetCode 150 for timed reps
- *Elements of Programming Interviews* — Binary Trees and BST chapters, for rigor on invariants and space bounds
- Tree-DP problems (include/exclude, rerooting) are covered in the Dynamic Programming list in this project — they're the same recursion with a memo layer
- Practice habit: for every problem, say out loud what each recursive call *returns* versus what it *updates globally*. Most tree interviews are lost by conflating the two, not by failing to recall an algorithm.

## Suggested prep order
1. Foundations + all four traversals, recursive and iterative
2. Core structural problems (height, diameter, balanced, mirror, symmetric)
3. Views and boundary traversals
4. BST fundamentals — insert, delete, validate, kth element, successor
5. LCA, then the path/sum family (nodes at distance K, max path sum, K-sum paths)
6. Construction and serialization
7. Tries, including the grid-search pattern
8. N-ary trees, balanced-tree concepts, segment tree / Fenwick (lowest ROI — do these last)
