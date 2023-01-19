package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "staffNo, fullName, department, role, emailAddress, salary";

    public List<Employee> employees = null;

    // Create new directory and new file

    

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        // create some employees
        Employee emp1 = new Employee("12345", "Andy Tay", "SS", "Lecturer", 
        "abc@nus.edu.sg", 40_000);
        Employee emp2 = new Employee("23456", "Florence Chua", "SS", "Lecturer", 
        "abc@nus.edu.sg", 20_000);
        Employee emp3 = new Employee("34567", "Dionnis Lee", "SS", "Lecturer", 
        "abc@nus.edu.sg", 10_000);
        Employee emp4 = new Employee("45678", "Stephanie Ng", "SS", "Lecturer", 
        "abc@nus.edu.sg", 60_000);

        // add the employees to the list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        // write FILE_HEADER to CSV
        fw.append(FILE_HEADER);
        fw.append(NEWLINE_SEPERATOR);

        // read records row by row and write it using fw.append()
        for (Employee e : employees) {
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(COMMA_DELIMITER);

            fw.append(NEWLINE_SEPERATOR);
        }

        fw.flush();
        fw.close();
    }
}
