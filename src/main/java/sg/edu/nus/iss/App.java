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
        System.out.println();

        CollectionSortExample cse = new CollectionSortExample();
        cse.example2();
        System.out.println();

        ase.example3();
        System.out.println();

        cse.example4();
        System.out.println();

        ConcurrentHashMapExample chme = new ConcurrentHashMapExample();
        chme.example();
    }
}
