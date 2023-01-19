package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        // Collections.sort(numbers, Collections.reverseOrder());
        numbers.sort(Comparator.reverseOrder());

        // Print out the sorted list (reverse)
        System.out.println("Sorted list (reversed): " + numbers);
    }

    public void example4() {
        Employee emp1 = new Employee("12345", "Andy Tay", "SS", "Lecturer", 
        "abc@nus.edu.sg", 40_000);
        Employee emp2 = new Employee("23456", "Florence Chua", "SS", "Lecturer", 
        "abc@nus.edu.sg", 20_000);
        Employee emp3 = new Employee("34567", "Dionnis Lee", "SS", "Lecturer", 
        "abc@nus.edu.sg", 10_000);
        Employee emp4 = new Employee("45678", "Stephanie Ng", "SS", "Lecturer", 
        "abc@nus.edu.sg", 60_000);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        // Print out employees before sorting
        System.out.println("Employees before sorting: " + employees);

        // Do an ascending sort using Collections
        Collections.sort(employees);

        // Print out sorted employees list
        System.out.println("Employees after sorting: " + employees);

        // Sorting using Comparator and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employees (salary): " + employees);

        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().
        equalsIgnoreCase("Stephanie Ng")).collect(Collectors.toList());
        System.out.println("Filtered Employees: " + filteredEmployees);
    }
}
