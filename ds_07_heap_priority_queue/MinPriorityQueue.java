package ds_07_heap_priority_queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Custom Min-Priority Queue implementation backed by a Binary Min-Heap in an ArrayList.
 *
 * How it works:
 * - A binary heap is a complete binary tree where every level is fully filled
 *   (except possibly the last, which is filled from left to right).
 * - Because it is complete, it can be efficiently represented using a flat array or ArrayList
 *   without explicit left, right, or parent pointers.
 * - Array Index Mapping (0-based):
 *     parent(i) = (i - 1) / 2
 *     leftChild(i)  = 2 * i + 1
 *     rightChild(i) = 2 * i + 2
 * - Min-Heap Property: The priority of each parent node is <= the priorities of its children.
 *   The element with the smallest priority value (highest urgency) is always at index 0.
 *
 * Time Complexities:
 * - insert:     O(log N) - Append to end and sift up
 * - extractMin: O(log N) - Replace root with last item and sift down
 * - peek:       O(1)     - Directly read index 0
 * - size:       O(1)
 * - isEmpty:    O(1)
 *
 * Space Complexity:
 * - O(N) where N is the number of elements in the queue.
 */
public class MinPriorityQueue<T> {

    /**
     * Internal container storing an item's priority and payload.
     * Lower priority numbers represent higher priority (e.g., 1 comes before 5).
     */
    private static class Node<T> {
        int priority; // Key used for heap ordering
        T value;      // Associated payload/data

        Node(int priority, T value) {
            this.priority = priority;
            this.value = value;
        }
    }

    // Dynamic array storing heap nodes in level-order
    private final ArrayList<Node<T>> heap;

    /**
     * Initializes an empty Min-Priority Queue.
     */
    public MinPriorityQueue() {
        this.heap = new ArrayList<>();
    }

    /**
     * Checks if the priority queue contains no elements.
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    /**
     * Returns the number of elements currently in the priority queue.
     *
     * @return count of items
     */
    public int size() {
        return heap.size();
    }

    /**
     * Retrieves (without removing) the value with the highest priority (minimum priority key).
     *
     * @return payload of the highest priority element
     * @throws NoSuchElementException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }
        // Root of the min-heap is always at index 0
        return heap.get(0).value;
    }

    /**
     * Inserts a new value with a given priority into the priority queue.
     *
     * Step 1: Add new element at the end of the ArrayList (maintains complete tree shape).
     * Step 2: Sift up the new element until the min-heap property is restored.
     *
     * @param priority ordering key (lower number = higher priority)
     * @param value payload data to store
     */
    public void insert(int priority, T value) {
        // Append to the end of the array (next available leaf in the tree)
        heap.add(new Node<>(priority, value));
        // Restore min-heap property by bubbling up the newly added leaf
        siftUp(heap.size() - 1);
    }

    /**
     * Removes and returns the value with the highest priority (minimum priority key).
     *
     * Step 1: Record the value at index 0 (root).
     * Step 2: Remove the last element from the array (to maintain complete tree property).
     * Step 3: Place the last element at index 0 and sift it down to its correct position.
     *
     * @return payload of the extracted minimum element
     * @throws NoSuchElementException if the queue is empty
     */
    public T extractMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty.");
        }

        // Save the root value (minimum priority) to return
        T minValue = heap.get(0).value;

        // Remove the last leaf node in O(1)
        Node<T> lastNode = heap.remove(heap.size() - 1);

        // If elements still remain, move the last node to the root and sift it down
        if (!isEmpty()) {
            heap.set(0, lastNode);
            siftDown(0);
        }

        return minValue;
    }

    /**
     * Heapify-Up (Bubble-Up):
     * Restores the min-heap property by bubbling an element upwards.
     * Compares the element at 'index' with its parent. If the element's priority
     * is smaller than its parent, swap them and continue upwards.
     *
     * @param index index of the node to bubble up
     */
    private void siftUp(int index) {
        // Parent index formula for 0-based array: (index - 1) / 2
        int parent = (index - 1) / 2;

        // Continue bubbling up as long as we haven't reached root and child < parent
        while (index > 0 && heap.get(index).priority < heap.get(parent).priority) {
            swap(index, parent);
            index = parent;
            parent = (index - 1) / 2;
        }
    }

    /**
     * Heapify-Down (Bubble-Down):
     * Restores the min-heap property by sinking an element downwards.
     * Compares the element at 'index' with its left and right children.
     * Swaps with the smaller of the two children, and continues downwards.
     *
     * @param index index of the node to sink down
     */
    private void siftDown(int index) {
        int size = heap.size();

        while (true) {
            int smallest = index;
            int left = 2 * index + 1;   // Left child index formula
            int right = 2 * index + 2;  // Right child index formula

            // Check if left child exists and has a smaller priority
            if (left < size && heap.get(left).priority < heap.get(smallest).priority) {
                smallest = left;
            }

            // Check if right child exists and has an even smaller priority
            if (right < size && heap.get(right).priority < heap.get(smallest).priority) {
                smallest = right;
            }

            // If a child has smaller priority, swap and continue down
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else {
                // Min-heap property satisfied: parent is <= both children
                break;
            }
        }
    }

    /**
     * Helper method to swap two elements at indices i and j in the ArrayList.
     *
     * @param i first index
     * @param j second index
     */
    private void swap(int i, int j) {
        Node<T> temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    /**
     * Example driver demonstrating priority queue usage.
     */
    public static void main(String[] args) {
        MinPriorityQueue<String> pq = new MinPriorityQueue<>();

        // Enqueue items with arbitrary priorities
        pq.insert(3, "Task C (Low)");
        pq.insert(1, "Task A (Urgent)");
        pq.insert(2, "Task B (Medium)");

        // Peek the top element without removing
        System.out.println("Top priority item (peek): " + pq.peek()); // Expected: Task A

        // Extract items in priority order (lowest numerical priority first)
        System.out.println("\nProcessing items by priority:");
        while (!pq.isEmpty()) {
            System.out.println("Processed: " + pq.extractMin());
        }
    }
}