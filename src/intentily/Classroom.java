package intentily;

import java.util.HashMap;

public class Classroom {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10}; // Input array
        int k = -10; // The target sum
        HashMap<Integer, Integer> map = new HashMap<>(); // Create a map to store the prefix sums and their frequencies

        map.put(0, 1); // Initialize the map with a prefix sum of 0 that has occurred once
        int ans = 0; // Variable to store the number of subarrays that sum up to k
        int sum = 0; // Variable to store the current prefix sum

        // Iterate over the array
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // Add the current element to the prefix sum

            // Check if there is a prefix sum that matches the current sum minus k
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k); // If found, add the frequency of that prefix sum to ans
            }

            // Update the frequency of the current prefix sum in the map
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1); // If the prefix sum already exists in the map, increment its frequency
            } else {
                map.put(sum, 1); // If the prefix sum does not exist in the map, add it with a frequency of 1
            }
        }

        System.out.println(ans); // Print the number of subarrays that sum up to k
    }
}
