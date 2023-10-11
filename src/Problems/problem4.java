package chatGPTproblems;
import java.util.*;

public class problem4 {
    /*
        Write a program that checks whether a given string is a palindrome or not.
        A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward
        (ignoring spaces, punctuation, and capitalization).

        Your program should:

        Prompt the user to enter a string.
        Remove spaces and convert the string to lowercase.
        Check if the modified string is a palindrome.
        Display a message indicating whether the string is a palindrome or not.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input.toLowerCase();

        StringBuilder reversed = new StringBuilder();

        for(int i = input.length();i>0;i--){
            reversed.append(input.charAt(i - 1));
        }

        //need to convert reversed from StringBuilder to "String" by using the .toString() method

        if(input.equals(reversed.toString())){
            System.out.println(reversed + " is a palindrome.");
        }else{
            System.out.println(input + " is not a palindrome.");
        }
    }
}
