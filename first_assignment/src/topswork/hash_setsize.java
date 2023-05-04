package topswork;

import java.util.HashSet;

public class hash_setsize {

	public static void main(String[] args) {
		   HashSet<String> hashSet = new HashSet<String>();
	        
		 hashSet.add("apple");
	        hashSet.add("banana");
	        hashSet.add("orange");
	        hashSet.add("grape");
	        hashSet.add("kiwi");
	        
	        // get the number of elements in the hash set
	        int size = hashSet.size();
	        
	        // print the number of elements
	        System.out.println("Number of elements in the hash set: " + size);
	    }
	}


	


