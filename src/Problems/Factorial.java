package Problems;

public class Factorial {
    private static int findFactorial(int num){
        int factorial = num;

        for(int i = num - 1;i > 0;i--){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args){
        System.out.println(findFactorial(5));
    }
}
