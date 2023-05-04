package topswork;

import java.util.ArrayList;
import java.util.Collections;

public class shufflearraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");

        System.out.println("Original list: " + list);

        // Shuffle the list
        Collections.shuffle(list);

        System.out.println("Shuffled list: " + list);
        
    }
}
