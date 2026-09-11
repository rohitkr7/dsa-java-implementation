package ds_02_linkedList;

/**
 * Custom implementation of a Singly Linked List from scratch in Java.
 *
 * Key Features:
 * - Node-based dynamic linear data structure.
 * - Each node contains a data element and a reference (pointer) to the next node.
 * - Supports insertions and deletions at the beginning, end, and arbitrary 1-based index positions.
 * - Provides both iterative and recursive traversal methods.
 *
 * Time Complexities:
 * - insertAtStart: O(1)
 * - insertAtEnd: O(N) (without tail pointer)
 * - insertAtPosition: O(N)
 * - deleteFront: O(1)
 * - deleteEnd: O(N)
 * - deleteAtPosition: O(N)
 * - getSize / isEmpty: O(1)
 *
 * Space Complexity: O(N) where N is the number of elements.
 */
public class SinglyLinkedList {

	// Reference to the first (head) node of the list
	private Node head;
	
	// Tracks the total number of nodes in the list
	private int size;

	/**
	 * Represents an individual node in the singly linked list.
	 */
	class Node {
		Node next;
		int data;

		/**
		 * Creates a new node storing the provided integer value.
		 *
		 * @param data The integer payload
		 */
		Node(int data) {
			this.next = null;
			this.data = data;
		}
	}

	/**
	 * Inserts a new node containing the specified data at the end (tail) of the list.
	 *
	 * @param data The integer value to insert
	 */
	public void insertAtEnd(int data) {
		Node temp = head;
		// Case 1: List is currently empty -> new node becomes the head
		if (head == null) {
			head = new Node(data);
			size++;
		} else {
			// Case 2: Traverse to the last node whose next reference is null
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
			size++;
		}
	}

	/**
	 * Inserts a new node containing the specified data at the start (head) of the list.
	 *
	 * @param data The integer value to insert
	 */
	public void insertAtStart(int data) {
		// Case 1: Empty list
		if (head == null) {
			head = new Node(data);
			size++;
			return;
		}

		// Case 2: Non-empty list -> point new node to current head and update head
		Node temp = head;
		head = new Node(data);
		head.next = temp;
		size++;
	}

	/**
	 * Inserts a new node at a specified 1-based position in the list.
	 *
	 * @param pos  The 1-based index position where the element should be inserted
	 * @param data The integer value to insert
	 */
	public void insertAtPosition(int pos, int data) {
		// Validate that the position is within valid range [1, size + 1]
		if (size < pos) {
			System.out.println("Position doesn't exist.");
			return;
		}
		
		// If inserting at position 1, delegate to insertAtStart
		if (pos == 1) {
			insertAtStart(data);
			return;
		}
		
		int count = 1;
		Node temp = head;
		
		// Traverse until the node immediately before the desired position (pos - 1)
		while (temp != null) {
			if (count == pos - 1) {
				Node newNode = new Node(data);
				newNode.next = temp.next;
				temp.next = newNode;
				size++;
				return;
			}
			temp = temp.next;
			count++;
		}
	}

	/**
	 * Prints all node values in the list sequentially from head to tail.
	 */
	public void print() {
		Node temp = head;
		if (head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}

	/**
	 * Recursively traverses and prints node values from the given starting node.
	 *
	 * @param start The node to begin recursive traversal from
	 */
	public void traverseRecursively(Node start) {
		Node current = start;
		if (current == null) {
			System.out.print("NULL");
			return;
		}
		System.out.print(current.data + " --> ");
		traverseRecursively(current.next);
	}

	/**
	 * Deletes the node at the front (head) of the list and returns its data.
	 *
	 * @return The data of the removed front node, or Integer.MIN_VALUE if the list is empty
	 */
	public int deleteFront() {
		if (head == null) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}
		
		Node temp = head;
		head = head.next;
		size--;
		
		return temp.data;
	}

	/**
	 * Deletes the node at the end (tail) of the list and returns its data.
	 *
	 * @return The data of the removed tail node, or Integer.MIN_VALUE if the list is empty
	 */
	public int deleteEnd() {
		// Case 1: Empty list
		if (head == null) {
			System.out.println("Linked list is empty");
			return Integer.MIN_VALUE;
		}
		
		// Case 2: Only one node in the list
		if (head.next == null) {
			Node temp = head;
			head = null;
			size--;
			return temp.data;
		}
		
		// Case 3: More than one node -> traverse to the second-to-last node
		Node temp = head;
		Node current = null;
		while (temp.next != null) {
			current = temp;
			temp = temp.next;
		}
		current.next = null;
		size--;
		return temp.data;
	}
	
	/**
	 * Checks whether the linked list is empty.
	 *
	 * @return true if the list has no elements; false otherwise
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Deletes the node at a specified 1-based position in the list.
	 *
	 * @param pos The 1-based index position of the node to delete
	 * @return The data of the removed node, or Integer.MIN_VALUE on invalid position/underflow
	 */
	public int deleteAtPosition(int pos) {
		if (isEmpty()) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		}
		
		if (size < pos || pos < 1) {
			System.out.println("Position doesn't exist.");
			return Integer.MIN_VALUE;
		}
		
		// Deleting at head position
		if (pos == 1) {
			return deleteFront();
		}
		
		Node temp = head;
		int count = 1;
		
		// Traverse to the node immediately before the target node (pos - 1)
		while (temp != null && temp.next != null) {
			if (count == pos - 1) {
				int data = temp.next.data;
				temp.next = temp.next.next;
				size--;
				return data;
			}
			count++;
			temp = temp.next;
		}
		
		return Integer.MIN_VALUE;
	}

	/**
	 * Returns the current total count of nodes in the linked list.
	 *
	 * @return The size of the list
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * Returns the head node reference of the list.
	 *
	 * @return The head Node
	 */
	public Node getHead() {
		return head;
	}

}

/**
 * Driver class demonstrating usage and testing of SinglyLinkedList.
 */
class SinglyLLRunner {

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(50);
		list.insertAtStart(60);
		list.print();
		System.out.println("Size: " + list.getSize());
		list.insertAtPosition(3, 100);
		list.print();
		System.out.println("Size: " + list.getSize());
		list.insertAtPosition(2, 500);
		list.print();
		System.out.println("Size: " + list.getSize());
		list.insertAtPosition(1, 1000);
		list.print();
		System.out.println("Size: " + list.getSize());
		//list.traverseRecursively(list.head);
		list.deleteEnd();
		list.print();
		System.out.println("Size: " + list.getSize());
		list.deleteEnd();
		list.deleteEnd();
		list.deleteEnd();
		list.print();
		System.out.println("Deleted: " + list.deleteEnd());
		list.print();
		list.deleteEnd();
		list.deleteEnd();
		list.print();
		System.out.println("----------------------");
		list.deleteEnd();
		list.print();
		list.deleteEnd();
		list.deleteEnd();
		System.out.println("Size: " + list.getSize());
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(50);
		list.insertAtStart(60);
		list.print();
		list.deleteFront();
		list.print();
		list.deleteFront();
		list.deleteFront();
		list.deleteFront();
		list.deleteFront();
		list.deleteFront();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtStart(50);
		list.insertAtStart(60);
		list.print();
		list.deleteAtPosition(2);
		list.print();
		list.deleteAtPosition(3);
		list.print();
		list.deleteAtPosition(1);
		list.print();
	}
}
