package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // Creating a HashSet of Integers
        HashSet<Integer> set = new HashSet<>();

        // Insert elements into the HashSet
        set.add(1); // Adds 1 to the set
        set.add(2); // Adds 2 to the set
        set.add(3); // Adds 3 to the set

        // Print the size of the HashSet
        System.out.println("Size of set is: " + set.size()); // Should print "Size of set is: 3"

        // Print all elements of the HashSet
        System.out.println(set); // Should print the set, e.g., "[1, 2, 3]"

        // Search if the HashSet contains specific elements
        if (set.contains(1)) {
            System.out.println("Set contains 1"); // Should print "Set contains 1"
        }
        if (!set.contains(6)) {
            System.out.println("Set does not contain 6"); // Should print "Set does not contain 6"
        }

        // Delete an element from the HashSet
        set.remove(1); // Removes 1 from the set
        if (!set.contains(1)) {
            System.out.println("Set does not contain 1 - we deleted 1"); // Should print "Set does not contain 1 - we deleted 1"
        }

        // Create an iterator for the HashSet
        Iterator<Integer> it = set.iterator();

        // Use the iterator to print each element in the HashSet
        while (it.hasNext()) {
            System.out.println(it.next()); // Prints the next element in the set
        }
    }
}
