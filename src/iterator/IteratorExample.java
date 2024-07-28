package iterator;


import java.util.HashSet;
import java.util.Iterator;

    public class IteratorExample {
        public static void main(String[] args) {
            // Creating a HashSet
            HashSet<String> set = new HashSet<>();

            // Adding elements to the HashSet
            set.add("Apple");
            set.add("Banana");
            set.add("Cherry");

            // Creating an iterator for the HashSet
            Iterator<String> iterator = set.iterator();

            // Using the iterator to traverse through the HashSet
            while (iterator.hasNext()) {
                // Getting the next element
                String element = iterator.next();
                // Printing the element
                System.out.println(element);
            }
        }
    }

/*An iterator is an object that enables you to traverse through a collection,
such as a HashSet, ArrayList, or other data structures in the Java Collections Framework,
one element at a time. It provides a way to access elements of a collection sequentially
without exposing the underlying structure of the collection.

Key Methods of an Iterator
hasNext():

Returns true if the iteration has more elements.
Returns false if there are no more elements to iterate over.
next():

Returns the next element in the iteration.
Throws a NoSuchElementException if the iteration has no more elements.
remove() (optional operation):

Removes from the underlying collection the last element
returned by this iterator (optional operation).
Can be called only once per call to next().
Throws IllegalStateException if the next() method has not yet been called,
or the remove() method has already been called after the last call to the next() method.*/