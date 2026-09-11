package ds_04_hashMap;

/**
 * Custom implementation of a Hash Map (Hash Table) using Separate Chaining for collision resolution.
 *
 * Key Features:
 * - Fixed bucket array capacity.
 * - Separate chaining using singly linked list nodes for colliding keys.
 * - Key-value mapping with basic operations: put, get, remove.
 *
 * Time Complexities (N = number of elements, B = number of buckets):
 * - put: Average O(1 + N/B), Worst O(N)
 * - get: Average O(1 + N/B), Worst O(N)
 * - remove: Average O(1 + N/B), Worst O(N)
 *
 * Space Complexity: O(B + N)
 */
public class HashMap {
	
	// Default number of buckets in the hash table
	private int SIZE = 5;
	
	// Array of bucket heads (each bucket is a linked list of Nodes)
	private Node[] buckets = new Node[SIZE];
	
	/**
	 * Represents an entry (key-value pair) in the Hash Map bucket linked list.
	 */
	class Node {
		int key;
		int value;
		Node next;

		/**
		 * Creates a new key-value node.
		 *
		 * @param key   The integer key
		 * @param value The integer value associated with the key
		 */
		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	/**
	 * Computes the bucket array index for a given key using modulo hashing.
	 *
	 * @param key The integer key
	 * @return The bucket index within [0, SIZE - 1]
	 */
	public int getHash(int key) {
		return key % SIZE;
	}
	
	/**
	 * Associates the specified value with the specified key in this map.
	 * If the key already exists, its value is overwritten.
	 *
	 * @param key   The key with which the specified value is to be associated
	 * @param value The value to be associated with the specified key
	 */
	public void put(int key, int value) {
		int index = getHash(key);
		
		// Case 1: Bucket is currently empty -> insert as the first node
		if (buckets[index] == null) {
			buckets[index] = new Node(key, value);
			return;
		}
		
		// Case 2: Bucket is not empty -> traverse chain to check for existing key or append at end
		Node temp = buckets[index];
		Node prev = null;
		while (temp != null) {
			// If key already exists, update its value and return
			if (temp.key == key) {
				//throw new RuntimeException("Key already exists!");
				//System.out.println("Key already exists.");
				temp.value = value; // overriding the previous value
				return;
			}
			prev = temp;
			temp = temp.next;
		}
		
		// Key was not found in the chain -> append new node to the end of the chain
		prev.next = new Node(key, value);
	}
	
	/**
	 * Returns the value to which the specified key is mapped.
	 *
	 * @param key The key whose associated value is to be returned
	 * @return The integer value associated with the key
	 * @throws RuntimeException if the key is not found in the map
	 */
	public int get(int key) {
		int index = getHash(key);
		
		// Bucket is empty -> key cannot exist
		if (buckets[index] == null) {
			throw new RuntimeException("Key doesn't exist");
		}
		
		// Traverse the bucket chain to find the key
		Node temp = buckets[index];
		while (temp != null) {
			if (temp.key == key) {
				return temp.value;
			}
			temp = temp.next;
		}
		
		// Key was not found in the chain
		throw new RuntimeException("Key not present!");
	}
	
	/**
	 * Removes the mapping for a key from this map if it is present.
	 *
	 * @param key The key whose mapping is to be removed
	 * @return The value of the removed key
	 * @throws RuntimeException if the key does not exist
	 */
	public int remove(int key) {
		int index = getHash(key);
		
		// Bucket is empty -> key cannot exist
		if (buckets[index] == null) {
			throw new RuntimeException("Key doesn't exist");
		}
		
		Node temp = buckets[index];
		Node prev = null;
		
		// Traverse bucket chain to find the node to delete
		while (temp != null) {
			if (temp.key == key) {
				int removedVal = temp.value;
				// If head of bucket is to be removed
				if (prev == null) {
					buckets[index] = temp.next;
				} else {
					// Bypass the current node in the linked list
					prev.next = temp.next;
				}
				return removedVal;
			}
			prev = temp;
			temp = temp.next;
		}
		
		throw new RuntimeException("Key not present!");
	}
	
}

/**
 * Driver class demonstrating usage of custom HashMap.
 */
class HashMapRunner {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//hm.get(10);
		hm.put(10, 100);
		hm.put(20, 200);
		hm.put(20, 300);
		//int value = hm.get(30);
		//System.out.println(value);	//key not present
		System.out.println(hm.get(20));
		hm.remove(20);
		//System.out.println(hm.get(20)); //key not present
		hm.put(1, 9);
		System.out.println(hm.get(1));
	}
}
