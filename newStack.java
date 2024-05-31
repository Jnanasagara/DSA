import java.util.Stack;

public class newStack { // STACK IS LIFO
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty());

        stack.push("MInecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("BorderLands");
        stack.push("The Last Of Us");

        stack.pop();

        // if popped more than number of elemnts , exceptions is thrown
        // "EmptyStackException"

        System.out.println(stack);
        System.out.println(stack.empty());

        String FavGame = stack.pop();

        System.out.println(FavGame); // will print the popped item
        System.out.println(stack);

        // if want to view without popping use "peak"
        System.out.println(stack.peek());
        System.out.println(stack);

        // Stack positions go backwards

        System.out.println(stack.search("MInecraft")); // if tried to search non existent item , then -1
    }
}
