package Problems;

//rated 95% did use external help however was in a different programming language
//rate 50/100 on the difficulty scale

public class problem3 {
    /*
        Write a program that generates and prints the Fibonacci series up to a given number of terms.
        The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
        usually starting with 0 and 1.

        Your program should:

        Prompt the user to enter the number of terms they want in the Fibonacci series.
        Generate and print the Fibonacci series up to the specified number of terms.
     */
    public static void main(String[] args){

        int previousNum = 0;
        int currentNum = 1;
        int terms = 10;

        for(int i = 0;i<terms;i++){
            int nextNum = previousNum + currentNum;
            previousNum = currentNum;
            currentNum = nextNum;
            System.out.print(nextNum + ", ");
        }
    }
}
