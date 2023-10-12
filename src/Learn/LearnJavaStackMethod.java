package Learn;
import java.util.*;

public class LearnJavaStackMethod {
    public static void main(String[] args){

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');

        //Pop method: remove and retrieve the element at the top of the stack, you use the pop method
        char topElement = stack.pop();

        //Peek: To view the element at the top of the stack without removing it, you use the peek method.
        topElement = stack.peek();

        //Empty check: To check if the stack is empty, you can use the isEmpty method
        boolean isEmpty = stack.isEmpty();

    }
}
