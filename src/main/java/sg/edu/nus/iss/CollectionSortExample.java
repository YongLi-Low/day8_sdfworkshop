package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    public void example2() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        // print out unsorted list
        System.out.println("Unsorted list: " + numbers);

        // Sort in ascending
        Collections.sort(numbers);

        // Print out sorted list
        System.out.println("Sorted list: " + numbers);

        // Sort in descending
        Collections.sort(numbers, Collections.reverseOrder());

        // Print out the sorted list (reverse)
        System.out.println("Sorted list (reversed): " + numbers);
    }
}
