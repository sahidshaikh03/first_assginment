package topswork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class iterate_arraylist {

	public static void main(String[] args) {
		  ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Orange");
	        
	        // Iterate through all elements in the array list using a for loop
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println(colors.get(i));
	        }
	        
	        // Iterate through all elements in the array list using a for-each loop
	        for (String color : colors) {
	            System.out.println(color);
	        }
	}
}

