package topswork;

import java.util.ArrayList;

public class remove_arraylist_element {
	 public static void main(String[] args) {
		  ArrayList<Integer> numbers = new ArrayList<Integer>();

		    // add some numbers to the ArrayList
		    numbers.add(10);
		    numbers.add(20);
		    numbers.add(30);
		    numbers.add(40);
		    numbers.add(50);

		    // print the ArrayList before removing the third element
		    System.out.println("Before removing the third element: " + numbers);

		    // remove the third element from the ArrayList
		    numbers.remove(2);

		    // print the ArrayList after removing the third element
		    System.out.println("After removing the third element: " + numbers);
		  }
	
}

