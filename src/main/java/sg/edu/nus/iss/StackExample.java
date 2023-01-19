package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public void example() {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // pop or taking something from the stack
        for (int i = 0; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack Item (pop): " + stackItem);
        }

        // See what is the last item on top of the stack
        Integer topItem = stack.peek();
        System.out.println("Top item integer: " + topItem);

        // Get the first element on the stack (bottom most element)
        Integer firstItem = stack.firstElement();
        System.out.println("First element on stack: " + firstItem);

        // Search for an item in the stack and return the index where its found on the stack
        Integer idxElement = stack.search(2);
        System.out.println("Stack element found at index: " + idxElement);

        // Iterating through a stack. It iterates from the bottom of the stack first.
        Iterator<Integer> its = stack.iterator();
        while (its.hasNext()) {
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: " + stackIt);
        }
    }
}
