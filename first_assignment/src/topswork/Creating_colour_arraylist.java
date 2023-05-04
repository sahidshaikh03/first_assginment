package topswork;

import java.util.ArrayList;

public class Creating_colour_arraylist {

	public static void main(String[] args) {
		  ArrayList<String> colors = new ArrayList<String>();

		    // add some colors to the ArrayList
		    colors.add("red");
		    colors.add("green");
		    colors.add("blue");
		    colors.add("yellow");

		    // print out the collection
		    System.out.println("Colors in the collection:");
		    for (String color : colors) {
		      System.out.println(color);
		    }
		  }
		}
	
