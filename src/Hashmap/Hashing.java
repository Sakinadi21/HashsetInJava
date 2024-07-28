package Hashmap;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String, Integer>map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("Bangladesh", 16);
        map.put("US",30);
        map.put("China",180);

        System.out.println(map);
        map.put("China",150);
        System.out.println(map);


        /*map.put()
        map->exist->update value
        put->doesn't exit -> new pair inserted
         */

        //Search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));//key exists
        System.out.println(map.get("Indonesia"));

        /*  .get
        key exist->value print
        key doesn't exist->null
        */
        /* .containsKey
        exist->true
        doesn't exist ->false
         */



    }
}
