package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    
    public List<Employee> readFromCSV(String fileName) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        List<Employee> employees = new ArrayList<Employee>();


        String row = "";
        String[] data = null;
        while ((row = br.readLine()) != null) {
            if (row.startsWith("st")) {
                continue;
            }
            data = row.split(",");
            // System.out.println(Arrays.asList(data));
            employees.add(new Employee(data[0], data[1], data[2], data[3], data[4], Integer.parseInt(data[5])));
        }

        br.close();

        return employees;

        // for (Employee e: employees){
        //     System.out.println(e);
        // }
    }
}
