package Implementation;

import java.util.*; // Importing all classes from the java.util package

public class HashMapCode {

    static class HashMap<K, V> {

        // Inner class Node to store key-value pairs
        private class Node {
            K key;
            V value;




            public Node(K key, V value) {
                this.key = key; // Initialize key
                this.value = value; // Initialize value
            }
        }

        private int n; // Number of key-value pairs
        private int N; // Number of buckets
        private LinkedList<Node>[] buckets; // Array of LinkedLists (buckets) to store nodes

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; // Initial size of buckets array
            this.buckets = new LinkedList[4]; // Initialize buckets array
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); // Initialize each bucket as an empty LinkedList
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode(); // Get hashcode of the key
            return Math.abs(bi) % N; // Ensure the index is within bounds of the buckets array
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi]; // Get the linked list at the bucket index
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Use equals method to compare keys
                    return i; // Return index if key is found
                }
            }
            return -1; // Return -1 if key is not found
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // Get bucket index for the key
            int di = searchInLL(key, bi); // Search for the key in the linked list

            if (di == -1) {
                buckets[bi].add(new Node(key, value)); // Add new node if key not found
                n++; // Increment size
            } else {
                Node node = buckets[bi].get(di); // Get existing node
                node.value = value; // Update value
            }

            double lambda = (double) n / N; // Load factor
            if (lambda > 2.0) {
                rehash(); // Rehash if load factor is greater than 2
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key); // Get bucket index for the key
            int di = searchInLL(key, bi); // Search for the key in the linked list
            return di != -1; // Return true if key is found, otherwise false
        }

        public V remove(K key) {
            int bi = hashFunction(key); // Get bucket index for the key
            int di = searchInLL(key, bi); // Search for the key in the linked list

            if (di == -1) {
                return null; // Return null if key is not found
            } else {
                Node node = buckets[bi].remove(di); // Remove node and return its value
                n--; // Decrement size
                return node.value;
            }
        }


        public V get(K key) {
            int bi = hashFunction(key); // Get bucket index for the key
            int di = searchInLL(key, bi); // Search for the key in the linked list

            if (di == -1) {
                return null; // Return null if key is not found
            } else {
                Node node = buckets[bi].get(di); // Get the node and return its value
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>(); // Create a list to store keys

            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i]; // Get each linked list
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j); // Get each node
                    keys.add(node.key); // Add key to the list
                }
            }
            return keys; // Return the list of keys
        }

        public boolean isEmpty() {
            return n == 0; // Return true if the hash map is empty, otherwise false
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets; // Store old buckets
            buckets = new LinkedList[N * 2]; // Double the size of the buckets array
            N = N * 2; // Update N to new size

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>(); // Initialize new buckets as empty LinkedLists
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i]; // Get each old linked list
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j); // Get each node
                    put(node.key, node.value); // Reinsert node into new buckets
                }
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // Create a new hash map
        map.put("India", 190); // Add key-value pairs
        map.put("China", 200);
        map.put("USA", 50);

        ArrayList<String> keys = map.keySet(); // Get all keys
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + map.get(keys.get(i))); // Print key-value pairs
        }

        map.remove("India"); // Remove key "India"
        System.out.println(map.get("India")); // Try to get value for key "India" (should be null)
    }
}
