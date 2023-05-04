package topswork;

import java.util.HashSet;

public class hashset_toarray {

	public static void main(String[] args) {
		  HashSet<String> set = new HashSet<>();
	        set.add("apple");
	        set.add("banana");
	        set.add("orange");
	        set.add("grape");

	        // Convert the HashSet to an array
	        String[] array = set.toArray(new String[set.size()]);

	        // Print the array
	        for (String element : array) {
	            System.out.println(element);
	        }
	    }
	

	}


