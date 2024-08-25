package edu.ilstu;

/*
 * doubly linked list thats sorted in ascending order
 * With a insert, delete, and toString method.
 * 
 * Stefan Tujarov 
 * 
 * ULID: SBTUJAR
 */

public class SortedList {

	private int size;
	private Node head;

	public SortedList() {
		this.size = 0;
		this.head = null;
	}

	public void insert(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current != null && current.getValue() < value) {
				current = current.getNext();
			}

			if (current == head) {
				newNode.setNext(head);
				head.setPrevious(newNode);
				head = newNode;
			} else if (current == null) {
				Node previous = head;
				while (previous.getNext() != null) {
					previous = previous.getNext();
				}
				previous.setNext(newNode);
				newNode.setPrevious(previous);
			} else {
				Node prev = current.getPrevious();
				prev.setNext(newNode);
				newNode.setPrevious(prev);
				newNode.setNext(current);
				current.setPrevious(newNode);
			}
		}
		size++;
	}

	public boolean delete(int value) {
		Node current = head;
		while (current != null && current.getValue() < value) {
			current = current.getNext();
		}

		if (current != null && current.getValue() == value) {
			Node previous = current.getPrevious();
			Node next = current.getNext();

			if (previous != null) {
				previous.setNext(next);
			} else {
				head = next;
			}

			if (next != null) {
				next.setPrevious(previous);
			}

			size--;
			return true;
		} else {
			System.out.println("Value " + value + " not found.");
			return false;
		}
	}

	public String toString() {
		String result = "[";
		Node current = head;
		while (current != null) {
			result += current.getValue();
			if (current.getNext() != null) {
				result += ",";
			}
			current = current.getNext();
		}
		result += "]";
		return result;
	}

	public int getSize() {
		return size;
	}
}
