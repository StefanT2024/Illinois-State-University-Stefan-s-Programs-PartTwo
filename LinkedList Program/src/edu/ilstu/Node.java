package edu.ilstu;

/*
 * Node class that stores three variables,
 * and methods (Accessors, Mutators)
 * 
 * Stefan Tujarov
 * 
 * ULID: SBTUJAR
 */

public class Node {

	private int value;
	private Node next;
	private Node previous;

	public Node(int value) {
		this.value = value;
		this.next = null;
		this.previous = null;
	}

	public int getValue() {
		return value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}
}
