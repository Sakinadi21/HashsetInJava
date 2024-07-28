package MajorElement;

import java.util.*; // Import all classes from the java.util package

public class Classroom {

    // Method to find and print majority elements in an array (elements that appear more than n/3 times)
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store elements and their counts
        int n = nums.length; // Get the length of the array

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // If the element is already in the map, increment its count
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                // If the element is not in the map, add it with count 1
                map.put(nums[i], 1);
            }
        }

        // Iterate over the keys in the map
        for (int key : map.keySet()) {
            // If the count of an element is greater than n/3, print it
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) { // Main method to test the majorityElement method
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}; // Test array
        majorityElement(nums); // Call the method with the test array
    }
}
