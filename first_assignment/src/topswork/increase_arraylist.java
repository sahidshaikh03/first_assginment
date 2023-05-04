package topswork;

import java.util.ArrayList;

public class increase_arraylist {

	public static void main(String[] args) {
		 ArrayList<String> list = new ArrayList<>(5);
	        
	        // add some elements to the list
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	        
	        // check current capacity
	        System.out.println("Current capacity: " + list.size());
	        
	        // increase capacity to 10
	        list.ensureCapacity(10);
	        
	        // check new capacity
	        System.out.println("New capacity: " + list.size());
	    }
	

	}


