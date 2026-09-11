package ds_07_heap_priority_queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Custom Binary Max-Heap implementation from scratch in Java using an array.
 *
 * Core Concepts:
 * - A Binary Max-Heap is a complete binary tree where the key at the root is the maximum
 *   among all keys present in the heap. The same property holds recursively for all subtrees.
 * - Complete Binary Tree Property: Every level of the tree is completely filled, except
 *   possibly the last level, which is filled from left to right.
 * - Array Representation: Because the tree is complete, it can be efficiently represented
 *   as a contiguous array without explicit node pointer objects:
 *     parent(i)     = (i - 1) / 2
 *     leftChild(i)  = 2 * i + 1
 *     rightChild(i) = 2 * i + 2
 * - Heap Invariant: heap[parent(i)] >= heap[i] for all valid child indices i.
 *
 * Time Complexities:
 * - peek:               O(1)     - Direct access to array index 0
 * - insert:             O(log N) - Append to end and sift/bubble up
 * - poll (extractMax):  O(log N) - Replace root with last element and sift/bubble down
 * - size / isEmpty:     O(1)
 *
 * Space Complexity:
 * - O(N) where N is the number of elements stored.
 */
public class MaxHeap {
    // Current maximum allocated slots in the internal array
    private int capacity;
    // Current number of active elements in the heap
    private int size;
    // Internal array storing the binary heap elements
    private int[] heap;

    /**
     * Constructs an empty Max-Heap with an initial capacity.
     *
     * @param capacity initial allocated size of the array
     */
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // =========================================================================
    // Array Index Helper Methods
    // =========================================================================

    // Calculates the parent index for a given child index: (i - 1) / 2
    private int getParentIndex(int index) { return (index - 1) / 2; }

    // Calculates the left child index: 2 * i + 1
    private int getLeftChildIndex(int index) { return 2 * index + 1; }

    // Calculates the right child index: 2 * i + 2
    private int getRightChildIndex(int index) { return 2 * index + 2; }

    // Checks if a parent exists (root at index 0 has no parent)
    private boolean hasParent(int index) { return getParentIndex(index) >= 0; }

    // Checks if left child exists within the active size boundary
    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }

    // Checks if right child exists within the active size boundary
    private boolean hasRightChild(int index) { return getRightChildIndex(index) < size; }

    // Retrieves the value of the parent element
    private int parent(int index) { return heap[getParentIndex(index)]; }

    // Retrieves the value of the left child element
    private int leftChild(int index) { return heap[getLeftChildIndex(index)]; }

    // Retrieves the value of the right child element
    private int rightChild(int index) { return heap[getRightChildIndex(index)]; }

    /**
     * Swaps values at two indices in the array in O(1) time.
     */
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /**
     * Resizes the internal array by doubling its capacity when full.
     * Guarantees amortized O(1) insertion time.
     */
    private void ensureCapacity() {
        if (size == capacity) {
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity *= 2;
        }
    }

    // =========================================================================
    // Core Heap Operations
    // =========================================================================

    /**
     * Retrieves the maximum element (at the root) without removing it.
     *
     * @return maximum element stored in the heap
     * @throws NoSuchElementException if heap is empty
     */
    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException("Heap is empty");
        }
        // In a max-heap, the maximum value is always at index 0
        return heap[0];
    }

    /**
     * Removes and returns the maximum element (root) from the heap.
     *
     * Steps:
     * 1. Save the root element (index 0).
     * 2. Overwrite the root with the last element in the array to preserve complete tree structure.
     * 3. Decrement size.
     * 4. Call heapifyDown() to sink the new root to its correct position, restoring max-heap property.
     *
     * @return the extracted maximum element
     * @throws NoSuchElementException if heap is empty
     */
    public int poll() {
        if (size == 0) {
            throw new NoSuchElementException("Heap is empty");
        }

        int maxItem = heap[0];           // Maximum item to return
        heap[0] = heap[size - 1];        // Move last element to root
        size--;                          // Shrink active heap size
        heapifyDown();                   // Restore max-heap ordering downwards
        return maxItem;
    }

    /**
     * Inserts a new element into the max-heap.
     *
     * Steps:
     * 1. Ensure array has sufficient capacity (double if full).
     * 2. Insert the new element at the next available leaf position (index = size).
     * 3. Increment size.
     * 4. Call heapifyUp() to bubble the new element up until parent >= child.
     *
     * @param item value to insert
     */
    public void insert(int item) {
        ensureCapacity();
        heap[size] = item;               // Place new element at end (as rightmost leaf)
        size++;                          // Increase active element count
        heapifyUp();                     // Restore max-heap ordering upwards
    }

    /**
     * Restores max-heap property upwards from the last inserted element.
     * Compares child with its parent. While child > parent, swap them.
     */
    private void heapifyUp() {
        int index = size - 1; // Start from the newly added leaf element

        // Bubble up while node has a parent and node's value is greater than parent's value
        while (hasParent(index) && parent(index) < heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index); // Move pointer up to parent's position
        }
    }

    /**
     * Restores max-heap property downwards starting from the root.
     * Compares parent with its children. Swaps with the larger child until
     * parent >= both children (or a leaf is reached).
     */
    private void heapifyDown() {
        int index = 0; // Start at root

        // As long as there is at least one child (left child exists in complete tree)
        while (hasLeftChild(index)) {
            // Assume left child is the larger child initially
            int largerChildIndex = getLeftChildIndex(index);

            // If right child exists and is even greater than left child, choose right child
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = getRightChildIndex(index);
            }

            // If current element is already greater than or equal to largest child, heap property holds
            if (heap[index] >= heap[largerChildIndex]) {
                break;
            } else {
                // Otherwise swap with the larger child and continue sinking downwards
                swap(index, largerChildIndex);
            }

            index = largerChildIndex; // Move pointer down
        }
    }

    /**
     * Returns the total count of elements currently in the heap.
     */
    public int size() {
        return size;
    }

    /**
     * Checks whether the heap has no elements.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Example driver demonstrating Max-Heap insertion, peek, and extraction.
     */
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(5);

        // Insert elements in arbitrary order
        maxHeap.insert(15);
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(30);

        // Root should contain maximum element (30)
        System.out.println("Max element (peek): " + maxHeap.peek()); // Expected: 30

        // Extracting elements one by one should yield descending sorted order
        System.out.println("Extracted elements in descending order:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // Expected: 30 20 15 10 5
        }
        System.out.println();
    }
}