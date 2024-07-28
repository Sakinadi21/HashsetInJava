package StartPoint;

import java.util.HashMap;

public class Classroom {
    // Method to find the starting point of the journey
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>(); // Create a reverse map to find the starting point

        // Fill the reverse map with reversed key-value pairs
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }

        // Find the starting point, which is not present in the reverse map
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // Return the starting point
            }
        }
        return null; // Return null if no starting point is found
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>(); // Create a map to store tickets
        tickets.put("Chennai", "Bengaluru"); // Add ticket from Chennai to Bengaluru
        tickets.put("Mumbai", "Delhi"); // Add ticket from Mumbai to Delhi
        tickets.put("Goa", "Chennai"); // Add ticket from Goa to Chennai
        tickets.put("Delhi", "Goa"); // Add ticket from Delhi to Goa

        String start = getStart(tickets); // Find the starting point of the journey

        // Print the journey from start to end
        while (tickets.containsKey(start)) {
            System.out.println(start); // Print the current start
            start = tickets.get(start); // Move to the next destination
        }
        System.out.println(start); // Print the final destination
    }

}
