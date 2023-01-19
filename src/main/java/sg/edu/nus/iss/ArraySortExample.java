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

    public void example3() {
        // Integer[] numbers = {10, 5, 1, 2, 4, 13, 46, 5, 6, 9, 8};
        Integer numbers[] = {10, 5, 1, 2, 4, 13, 46, 5, 6, 9, 8};  // this declaration can do reverse sort

        // sort numbers array in ascending order
        Arrays.sort(numbers);

        // print out sorted numbers
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        // sort numbers array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // print out sorted numbers (reverse)
        System.out.println("Sorted numbers (reversed): " + Arrays.toString(numbers));

    }
}
