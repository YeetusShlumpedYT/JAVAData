package Learn;

import java.util.Scanner;

public class AddingIfElseStatementsInSysout {
    /*
    returns a or b depending on if condition is true or false
    answer = (condition) ? a : b
    so if condition is true return a else return b
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println((num1>num2) ? "First number is larger" : "Second number is larger");
    }
}
