package sg.edu.nus.iss;

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
    public static void main(String[] args) {
        ArraySortExample ase = new ArraySortExample();
        ase.example1();

        CollectionSortExample cse = new CollectionSortExample();
        cse.example2();
    }
}
