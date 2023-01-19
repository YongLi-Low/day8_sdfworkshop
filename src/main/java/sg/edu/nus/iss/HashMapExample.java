package sg.edu.nus.iss;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public void example() {
        Map<String, Integer> phones = new HashMap<>(); // Map<Key, value>
        phones.put("iPhone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 4);
        phones.put("Samsung", 20);

        System.out.println("Number of phone types: " + phones.size());

        for (String key: phones.keySet()) { // get the key
            System.out.println(key + " - " + phones.get(key));
        }

        String searchString = "";
        Console con = System.console();

        while (!searchString.equals("quit")) {
            searchString = con.readLine("Enter the brand of phone: ");

            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            }
            else {
                System.out.println("Line item not found.");
            }
        }

        // remove all the Map data
        phones.clear();

        // check the size of map after clear()
        System.out.println("Total phone types: " + phones.size());
    }
}
