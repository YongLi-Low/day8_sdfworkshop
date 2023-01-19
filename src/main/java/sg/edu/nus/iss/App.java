package sg.edu.nus.iss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws IOException {
        // ArraySortExample ase = new ArraySortExample();
        // ase.example1();
        // System.out.println();

        // CollectionSortExample cse = new CollectionSortExample();
        // cse.example2();
        // System.out.println();

        // ase.example3();
        // System.out.println();

        // cse.example4();
        // System.out.println();

        // ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        // chme.example();

        // LinkedListExample lle = new LinkedListExample();
        // lle.example();

        // StackExample se = new StackExample();
        // se.example();

        String dirPath = "data";
        String fileName = "data.txt";

        // Creating a directory
        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if (isDirCreated) {
            System.out.println("New directory " + dirPath + " created");
        }
        else {
            System.out.println("Directory " + dirPath + " already exists");
        }

        // Creating a file in the directory created above
        File newFile = new File(dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        if (isFileCreated) {
            System.out.println("New file " + fileName + " created");
        }
        else {
            System.out.println("File" + fileName + " already exists");
        }

        // List files under a directory
        File fileList[] = newDir.listFiles();
        for (File f : fileList) {
            System.out.println("File " + f.getPath() + ":" + f.getCanonicalPath());
        }

        // Use FileOutputStream to write some integers to file 'data.txt'
        FileOutputStream fos = new FileOutputStream(newFile);
        for (int i = 0; i < 10; i++) {
            char str[] = Integer.toString(i).toCharArray();
            fos.write(str[0]);
            fos.write('\n');
        }
        
        // Convert string to byte array using getBytes()
        String welcomeMessage = "Welcome to ISS TFIP Programme";
        byte[] outPutData = welcomeMessage.getBytes();
        
        // Writing the string in byte array 1 character at a time to the file.
        fos.write(outPutData);

        // flush() clears the OutPutStream. Force data to store to the file destination.
        fos.flush();
        fos.close();

        String fileEmployee = "employee.txt";

        // create a file in the directory created above
        File newEmployeeFile = new File(dirPath + File.separator + fileName);
        boolean isEmployeeFileCreated = newFile.createNewFile();

        if (isFileCreated) {
            System.out.println("New file " + fileName + " created");
        }
        else {
            System.out.println("File" + fileName + " already exists");
        }

        CSVWriter cw = new CSVWriter();
        List<Employee> employeeList = cw.generateEmployees();
        cw.writeToCSV(employeeList, dirPath + File.separator + fileEmployee);

        CSVReader cr = new CSVReader();
        List<Employee> employeeList1 = cr.readFromCSV(dirPath + File.separator + fileEmployee);

        for (Employee e: employeeList1){
            System.out.println(e);
        }
    }

    
}
