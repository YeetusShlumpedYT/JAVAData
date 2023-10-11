package chatGPTproblems;

import java.util.*;

public class problem2 {
    /*
        Write a program that takes a positive integer as input and determines whether it is a prime number or not. A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.

        Your program should:

        Prompt the user to enter a positive integer.
        Check if the entered number is greater than 1.
        Determine if the number is prime or not.
        Display a message indicating whether the number is prime or not.
     */

    //Chat GPT gave a score of 95% rated at a difficulty of 40/100

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int num = scanner.nextInt();
            if(!(num > 0)){
                System.out.println("Please retry and enter a positive number");
                System.exit(0);
            }
            boolean isPrime = true;
            for(int i = 2;i<num;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num + " is a prime number.");
            }else{
                System.out.println(num + " is not a prime number.");
            }
        }catch(Exception e){
            System.out.println("Enter a number");
        }
    }
}
