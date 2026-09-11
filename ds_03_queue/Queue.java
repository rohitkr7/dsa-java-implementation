package ds_03_queue;

/**
 * Custom implementation of a Queue (First-In-First-Out / FIFO) using a Singly Linked List.
 *
 * Key Features:
 * - Dynamic sizing using linked node structures.
 * - Maintains both 'start' (front/head) and 'end' (rear/tail) references.
 * - Enqueuing occurs at the rear ('end') in O(1) time.
 * - Dequeuing occurs at the front ('start') in O(1) time.
 *
 * Time Complexities:
 * - push (enqueue): O(1)
 * - pop (dequeue): O(1)
 * - peek: O(1)
 * - isEmpty / getSize: O(1)
 * - display: O(N)
 *
 * Space Complexity: O(N) where N is the number of elements.
 */
public class Queue {
	
	/**
	 * Represents an individual element/node within the linked queue.
	 */
	class Node {
		Node next;
		int data;

		/**
		 * Creates a new node with the specified data value.
		 *
		 * @param data The integer payload stored in this node
		 */
		Node(int data) {
			this.next = null;
			this.data = data;
		}
	}
	
	// 'start' points to the front of the queue (where elements are dequeued)
	// 'end' points to the rear of the queue (where elements are enqueued)
	private Node start, end;
	
	// Tracks the current number of elements in the queue
	private int size = 0;
	
	/**
	 * Enqueues an element at the rear of the queue.
	 *
	 * @param data The integer value to be pushed into the queue
	 */
	public void push(int data) {
		Node temp = new Node(data);

		// Case 1: Queue is empty -> both start and end point to the new node
		if (start == null) {
			start = temp;
			end = temp;
			size++;
			return;
		}

		// Case 2: Link current rear node to the new node, then update rear reference
		end.next = temp;
		end = temp;
		size++;
	}
	
	/**
	 * Dequeues and returns the element at the front of the queue.
	 *
	 * @return The integer value removed from the front of the queue,
	 *         or Integer.MIN_VALUE if the queue is empty (underflow).
	 */
	public int pop() {
		// Check for empty queue (underflow)
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		
		// Capture front node, advance start pointer, and decrement size
		Node temp = start;
		start = start.next;
		size--;
		
		// If queue becomes empty after dequeue, reset end pointer as well
		if (start == null) {
			end = null;
		}
		
		return temp.data;
	}
	
	/**
	 * Returns the front element of the queue without removing it.
	 *
	 * @return The integer value at the front of the queue,
	 *         or Integer.MIN_VALUE if the queue is empty.
	 */
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return Integer.MIN_VALUE;
		}
		
		return start.data;
	}
	
	/**
	 * Checks whether the queue is empty.
	 *
	 * @return true if the queue contains no elements, false otherwise
	 */
	public boolean isEmpty() {
		return start == null;
	}
	
	/**
	 * Returns the total number of elements currently in the queue.
	 *
	 * @return The size of the queue
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Displays all elements in the queue from front to rear.
	 */
	public void display() {
		Node temp = start;
		if (temp == null) {
			System.out.println("Stack is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
}

/**
 * Driver class demonstrating usage of custom Queue.
 */
class QueueRunner {
	public static void main(String[] args) {
		Queue que = new Queue();
		System.out.println(que.peek());
		que.pop();
		que.push(10);
		que.display();
		System.out.println(que.getSize());
		que.push(20);
		que.push(30);
		que.display();
		System.out.println(que.getSize());
		que.pop();
		que.display();
		System.out.println(que.getSize());
		que.pop();
		que.display();
		que.pop();
		que.display();
		que.pop();
	}
}
