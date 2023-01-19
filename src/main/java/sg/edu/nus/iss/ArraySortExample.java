package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {

    public void example1() {

        // Customs array with data (name)
        String name[] = {"darryl", "elaine", "james", "chris", "mark", 
        "zenith", "sophia", "asher", "brandon", "helen", "daniel", "marcus"};

        // Print out unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(name));

        // Sort the array in ascending order
        Arrays.sort(name);

        // Print out sorted array
        System.out.println("Sorted array: " + Arrays.toString(name));

        // Sort array in descending order
        Arrays.sort(name, Collections.reverseOrder());
        
        // Print out sorted array
        System.out.println("Sorted array (reversed): " + Arrays.toString(name));
    }
}
