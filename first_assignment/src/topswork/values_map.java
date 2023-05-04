package topswork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class values_map {
public static void main(String[] args) {
	 Map<Integer, String> map = new HashMap<>();
     map.put(1, "apple");
     map.put(2, "banana");
     map.put(3, "orange");

     // Get a collection view of the values contained in the map
//     Collection<String>
//      map.values();

     // Print the values
     System.out.println("values : "+map.values());
}
}
