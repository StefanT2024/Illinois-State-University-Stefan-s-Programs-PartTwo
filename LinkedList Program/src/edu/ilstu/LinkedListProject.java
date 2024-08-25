package edu.ilstu;

/*
 * Main class, using insert method to insert the values into acceding order, 
 * Printing out the results, and using delete method.
 * 
 * Stefan Tujarov 
 * 
 * ULID: SBTUJAR
 * 
 */
public class LinkedListProject {

	public static void main(String[] args) {
		SortedList sortedList = new SortedList();

		sortedList.insert(25);
		sortedList.insert(17);
		sortedList.insert(12);
		sortedList.insert(21);
		sortedList.insert(78);
		sortedList.insert(47);

		System.out.println("Sorted List: " + sortedList.toString());

		sortedList.delete(30);

		System.out.println("Sorted List: " + sortedList.toString());

		sortedList.delete(21);

		System.out.println("Sorted List: " + sortedList.toString());
	}
}
