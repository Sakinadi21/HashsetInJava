package hashfoR;

import java.util.HashMap;  // Importing HashMap class from java.util package
import java.util.Map;      // Importing Map interface from java.util package
import java.util.Set;      // Importing Set interface from java.util package

public class Hashing {
    public static void main(String[] args) {
        // Creating a HashMap where the key is a String (country) and the value is an Integer (population)
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting key-value pairs into the HashMap
        map.put("India", 120);          // Inserting ("India", 120)
        map.put("Bangladesh", 16);      // Inserting ("Bangladesh", 16)
        map.put("US", 30);              // Inserting ("US", 30)
        map.put("China", 180);          // Inserting ("China", 180)

        System.out.println(map);        // Printing the entire HashMap

        map.put("China", 150);          // Updating the value for key "China" to 150
        System.out.println(map);        // Printing the entire HashMap again to show the updated value for "China"

        /* map.put(key, value)
           - If the key exists, the value is updated
           - If the key doesn't exist, a new key-value pair is inserted
        */

        // Iterating over the entry set of the HashMap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());    // Printing the key (country)
            System.out.println(e.getValue());  // Printing the value (population)
        }

        // Getting the set of keys from the HashMap
        Set<String> keys = map.keySet();
        // Iterating over the set of keys
        for (String key : keys) {
            // Printing the key and its corresponding value
            System.out.println(key + " " + map.get(key));
        }
    }
}
