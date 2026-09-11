package ds_07_heap_priority_queue;

import java.util.NoSuchElementException;

public class LinkedMinPriorityQueue<T> {

    // Internal node structure holding data and references
    private static class Node<T> {
        int priority;       // Ordering key (smaller value = higher priority)
        T value;            // Stored payload
        Node<T> left;       // Pointer to left child
        Node<T> right;      // Pointer to right child
        Node<T> parent;     // Pointer to parent node (essential for siftUp)

        Node(int priority, T value) {
            this.priority = priority;
            this.value = value;
        }
    }

    private Node<T> root;   // Entry point of the tree
    private int size;       // Number of active elements in the heap
    
    public LinkedMinPriorityQueue() {
        this.root = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // O(1) peek: the root always holds the minimum element in a min-heap
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty.");
        }
        return root.value;
    }

    // O(log n) insert: adds element at next complete tree spot, then bubbles up
    public void insert(int priority, T value) {
        Node<T> newNode = new Node<>(priority, value);
        size++; // Increment total count to determine the new node's 1-based index

        // If heap was empty, new node becomes the root
        if (root == null) {
            root = newNode;
            return;
        }

        // In a 1-based complete binary tree, the parent of index K is at K / 2
        Node<T> parent = getNode(size / 2);
        newNode.parent = parent;

        // Attach to left if available; otherwise attach to right
        if (parent.left == null) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        // Restore heap invariant by moving the node up if priority is smaller
        siftUp(newNode);
    }

    // O(log n) extractMin: removes root, replaces with last node, then bubbles down
    public T extractMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty.");
        }

        T minValue = root.value; // Save minimum value to return later

        // If only one node exists, simply clear the tree
        if (size == 1) {
            root = null;
            size = 0;
            return minValue;
        }

        // Locate the rightmost leaf on the deepest level using 1-based index (size)
        Node<T> lastNode = getNode(size);

        // Copy last node's priority and value into the root
        root.priority = lastNode.priority;
        root.value = lastNode.value;

        // Sever the connection between lastNode and its parent
        Node<T> parent = lastNode.parent;
        if (parent.left == lastNode) {
            parent.left = null;
        } else {
            parent.right = null;
        }
        lastNode.parent = null; // Clean up back-reference

        size--; // Decrement size after removal

        // Restore heap invariant by pushing root value downward
        siftDown(root);

        return minValue;
    }

    // Traverses from root to target 1-based index in O(log n) using bit operations
    private Node<T> getNode(int index) {
        // Find most significant bit (e.g., for index 6 [binary 110], highest bit is 4 [100])
        int highestBit = Integer.highestOneBit(index);
        Node<T> current = root;

        // Skip the most significant bit (root), inspect subsequent bits: 0 = left, 1 = right
        for (int mask = highestBit >> 1; mask > 0; mask >>= 1) {
            if ((index & mask) == 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return current;
    }

    // Bubbles a node upward while its priority is smaller than its parent's
    private void siftUp(Node<T> node) {
        while (node.parent != null && node.priority < node.parent.priority) {
            swapData(node, node.parent); // Swap values instead of rewiring pointers
            node = node.parent;          // Move up the tree
        }
    }

    // Bubbles a node downward by swapping with its smallest child
    private void siftDown(Node<T> node) {
        // Continue as long as at least a left child exists
        while (node.left != null) {
            Node<T> smallest = node.left;

            // Check if right child exists and has a strictly smaller priority
            if (node.right != null && node.right.priority < node.left.priority) {
                smallest = node.right;
            }

            // If current node is larger than the smaller child, swap and proceed downward
            if (node.priority > smallest.priority) {
                swapData(node, smallest);
                node = smallest;
            } else {
                break; // Heap property satisfied
            }
        }
    }

    // Helper: swaps data payload and priority values between two nodes in O(1)
    private void swapData(Node<T> a, Node<T> b) {
        int tempPriority = a.priority;
        T tempValue = a.value;

        a.priority = b.priority;
        a.value = b.value;

        b.priority = tempPriority;
        b.value = tempValue;
    }

    // Driver code demonstrating basic priority queue operations
    public static void main(String[] args) {
        LinkedMinPriorityQueue<String> pq = new LinkedMinPriorityQueue<>();

        // Insert elements with arbitrary priorities
        pq.insert(3, "Task C");
        pq.insert(1, "Task A");
        pq.insert(2, "Task B");

        System.out.println("Top element: " + pq.peek()); // Task A

        // Extract items in priority order (lowest numerical priority first)
        while (!pq.isEmpty()) {
            System.out.println("Processed: " + pq.extractMin());
        }
    }
}