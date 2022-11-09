//NAME:RAMLOCUND Gitendrajeet
//Algorithmics Assignment
//DATE:25.04.2021
//Creating Generic Queues of Cheques

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListQueue<E> {

	public ArrayList<Object> list; // Array of elements
	private int capacity; //Variable that will store capacity of array upon user creation of the object

	public ArrListQueue(int c) {

		this.capacity = c;
		list = new ArrayList<Object>(capacity);//Creating an ArrayList named list
	}

	// Insert Elements to arrayList
	public void insert(int index, Object E) throws Exception {
		index=0;//Initialise Index as 0 to start the counter while same is being incremented by a for loop
		if (isFull())
			throw new Exception("Queue Of Cheque is full");
		else
			list.add(index, new Cheque());//Adding object to arrayList
		System.out.println();
	}

	// Function to check if arrayList is Empty
	public boolean isEmpty() {
		return list.size() == -1;
	}

	// Function to check if arrayList is Full
	public boolean isFull() {
		return (capacity == list.size());
	}

	// Remove elements from the arrayList
	public boolean remove(Object E) throws Exception {

		if (isEmpty())
			throw new Exception("Queue of Cheque is empty");
		else
			return list.remove(E);
	}

	// return the front element without removing it from queue
	public Object peek() throws Exception {
		if (isEmpty())
			throw new Exception("Queue of Cheque is empty");
		else
			return list.get(0);
	}

	// display queue elements
	public void display(ArrayList<Object> list) throws Exception {
		if (isEmpty())
			throw new Exception("Queue of Cheque is empty");
		else {
			System.out.println("\n\nQueue Of Cheques " + "[" + list.size() + "]");
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			System.out.println();
		}
	}

	// Reset Queue of Cheque
	public void reset() {
		list.clear();
	}

	// Search for Cheque in the ArrayList
	public void search(ArrayList<Object> list, Object E) {

		boolean result = true;
		result = list.contains(E);
		if (result)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}

	// Return the size of arrayList
	public int size() {

		return list.size();
	}

	// Push element onto Queue
	public void push(int index, Object E) throws Exception {
		index = list.size() + 1;
		if (isFull())
			throw new Exception("Queue of Cheque is Full");
		else
			list.add(index, new Cheque());
	}

	// Pop element from Queue
	public Object pop() throws Exception {
		if (isEmpty())
			throw new Exception("Queue of Cheque is Empty");
		else
			return list.remove(--capacity);
	}

	//Menu to Manipulate the Queue of Cheque
	@SuppressWarnings("unchecked")
	public void menu() throws Exception {

		int choice = 12;//pointer to make program run continuously until user exits
		Scanner in = new Scanner(System.in);
		while (choice != 0) {
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println("|" + "    Queue of Cheque Manipulation Menu  " + "|");
			System.out.println("|" + "       Coded By: Ramlochund.G          " + "|");
			System.out.println("-----------------------------------------");
			System.out.println("|     1. Insert Cheque into Queue       |");
			System.out.println("|     2. Remove Cheque from Queue       |");
			System.out.println("|     3. Peek Cheque from Queue         |");
			System.out.println("|     4. Pop Cheque from Queue          |");
			System.out.println("|     5. Push Cheque from Queue         |");
			System.out.println("|     6. Reset Cheque from Queue        |");
			System.out.println("|     7. Search Cheque from Queue       |");
			System.out.println("|     8. Display ArrayList Cheque       |");
			System.out.println("|     9. Clone Cheque                   |");
			System.out.println("|    10. Compare Cheque                 |");
			System.out.println("|    11. Exit Program                   |");
			System.out.println("========================================|");
			System.out.print("          Choice (1 - 11) : ");
			choice = in.nextInt();

			try {
				switch (choice) {
				case 1: // insert Cheque to ArrayList
					System.out.print("How many Cheque you want to Add: ");
					int selection = in.nextInt();
					for (int i = 0; i < selection; i++)
						insert(selection, list);
					break;
				case 2: // Remove Cheque from ArrayList
					System.out.print("Index of Cheque Number to remove in size of: " + list.size() + " in ArrayList: ");
					int c = in.nextInt();
					list.remove(c);
					break;
				case 3: // Peek an Element from Cheque Queue
					System.out.print("Front element : " + peek());
					break;
				case 4: // returns the element present at the top of the stack and then removes it.
					System.out.print("Pop Element : " +"NOT AVAILABLE FOR QUEUE!!!!!");
					break;
				case 5: // To insert an element at the back of the queue
					System.out.println("Push Element in Queue of Cheque : ");
					insert(list.size(), list);
					break;
				case 6: // Reset Queue of Cheques
					reset();
						System.out.println("Reset Sucessfull");
					break;
				case 7: // Search in Queue of Cheques
					System.out.print("Search Cheque Number in Queue: ");
					int str = in.nextInt();
					search(list, str);
					break;
				case 8: // Display to Output on the screen
					display(list);
					break;
				case 9: // Clone Cheques
					System.out.print("Index of Cheque to Clone: ");
					int cln = in.nextInt();
					//(list.get(cln)).clone();
					break;
				case 10: // Compare Cheques
					System.out.print("Index of Cheque 1 to Compare in Queue: ");
					String in1 = in.next();
					System.out.print("Index of Cheque 2 to Compare in Queue: ");
					String in2 = in.next();
					System.out.print("Comparing the Cheques: " + ((Comparable<Cheque>) list).compareTo(new Cheque()));
					
					break;
				case 11: // Exit Program
					System.out.println("Program Over...");
					break;
				default:
					System.out.println("Incorrect Input");
					System.out.println("Please input a choice between 1 and 10!");
					System.out.println("Try Again ...");
				}

			} catch (Exception e) {
				System.out.println("\t\tMESSAGE : " + e.getMessage());
			}
		}
		in.close();
	}

}
