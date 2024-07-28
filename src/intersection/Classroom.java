package intersection;

import java.util.HashSet;

public class Classroom { // Class definition

    // Method to find the intersection count of two arrays
    public static int intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>(); // Create a HashSet to store unique elements from arr1
        int count = 0; // Variable to count the number of common elements

        // Add all elements of arr1 to the HashSet
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Iterate through arr2 and check if elements are in the HashSet
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) { // If an element of arr2 is in the HashSet
                count++; // Increment the count
                set.remove(arr2[j]); // Remove the element from the HashSet to avoid counting duplicates
            }
        }

        return count; // Return the count of common elements
    }

    public static void main(String[] args) {
        int arr1[] = {7, 3, 9}; // First array
        int arr2[] = {6, 3, 9, 2, 9, 4}; // Second array
        System.out.println(intersection(arr1, arr2)); // Call the method and print the result
    }
}

