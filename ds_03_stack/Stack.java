package ds_03_stack;

/**
 * Custom implementation of a Stack (Last-In-First-Out / LIFO) using a Linked List.
 *
 * Key Features:
 * - Dynamic node-based memory allocation without fixed capacity limits.
 * - Maintains 'start' (bottom of stack) and 'top' (most recently pushed element).
 * - Pushes new elements onto the top of the stack.
 *
 * Time Complexities:
 * - push: O(1)
 * - pop: O(N) (due to single-link traversal to find the node preceding top)
 * - peek: O(1)
 * - size / isEmpty: O(1)
 * - display: O(N)
 *
 * Space Complexity: O(N) where N is the number of elements.
 */
public class Stack {

	/**
	 * Represents an individual element/node in the stack.
	 */
	class Node {
		Node next;
		int data;

		/**
		 * Creates a new node storing the given integer data.
		 *
		 * @param data The integer payload
		 */
		Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	// 'start' points to the first inserted node (bottom of stack)
	// 'top' points to the most recently inserted node (top of stack)
	Node start, top;
	
	// Tracks the total number of elements currently stored in the stack
	int size = 0;

	/**
	 * Pushes an integer onto the top of this stack.
	 *
	 * @param data The integer value to be pushed
	 */
	public void push(int data) {
		Node temp = new Node(data);

		// Case 1: Stack is empty -> new node is both start (bottom) and top
		if (start == null) {
			start = temp;
			top = temp;
			size++;
			return;
		}

		// Case 2: Link current top node to the new node, and advance top reference
		top.next = temp;
		top = temp;
		size++;
	}

	/**
	 * Removes and returns the integer at the top of this stack.
	 *
	 * @return The integer value popped from the top of the stack,
	 *         or Integer.MIN_VALUE if the stack is empty (underflow).
	 */
	public int pop() {
		// Check for empty stack (underflow)
		if (top == null) {
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}

		Node temp = start;
		
		// Case 1: Only one element in the stack
		if (start == top) {
			start = top = null;
			size--;
			return temp.data;
		}
		
		// Case 2: More than one element -> traverse until reaching the node preceding top
		while (temp.next != top) {
			temp = temp.next;
		}
		
		// Detach old top and set previous node as the new top
		int poppedData = top.data;
		temp.next = null;
		top = temp;
		size--;

		return poppedData;
	}

	/**
	 * Looks at the integer at the top of this stack without removing it.
	 *
	 * @return The integer at the top of the stack,
	 *         or Integer.MIN_VALUE if the stack is empty.
	 */
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return Integer.MIN_VALUE;
		}
		return top.data;
	}

	/**
	 * Returns the number of elements in this stack.
	 *
	 * @return The current size of the stack
	 */
	public int size() {
		return size;
	}

	/**
	 * Tests if this stack is empty.
	 *
	 * @return true if and only if this stack contains no items; false otherwise
	 */
	public boolean isEmpty() {
		return start == null;
	}

	/**
	 * Displays all elements in the stack from bottom to top.
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
 * Driver class demonstrating usage of custom Stack.
 */
class StackRunner {
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.peek());
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		System.out.println(stack.peek());
		stack.push(30);
		stack.display();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
