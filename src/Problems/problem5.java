package Problems;
import java.util.*;
public class problem5 {
    /*
        Write a function that takes an array of integers as input and returns the maximum sum achievable under these conditions.
     */

    public static void main(String[] args){
        while(true){
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a positive integer: ");
                int num1 = scanner.nextInt();
                Math.abs(num1);
                System.out.print("Enter another positive integer: ");
                int num2 = scanner.nextInt();

                //A=B*Q+R
                int GCD = ((Math.max(num1, num2) / Math.min(num1,num2)) );
                System.out.println("GCD is: " + GCD);
                System.out.println();
            }catch(Exception e){
                System.out.println("ERR: User did not enter value_type: int");
            }
        }

    }
}
