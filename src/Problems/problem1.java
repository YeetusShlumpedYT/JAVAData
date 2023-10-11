package Problems;
import java.util.*;
public class problem1 {
    /*Write a program that asks the user for their name and age,
    and then prints a message saying, "Hello [Name], you are [Age] years old!"
     */

    //Overall Score: 95%

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old!");

    }

}
