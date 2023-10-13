package Learn;
import java.util.*;

public class LearnJavaStackMethod {

    private static char lastCharacterFromStacked(char[] chars){
        Stack<Character> stack = new Stack<>();
        char lastChar = 'c';
        for(char c : chars){
            stack.push(c);
        }
        for(int i = 0;i < chars.length;i++){
            lastChar = stack.pop();
        }
        return lastChar;
    }

    public static void main(String[] args){
        char[] charArray = {'c', 'r', 'l'};
        System.out.println(lastCharacterFromStacked(charArray));
    }
}
