package Problems;

public class IsPrimeNumber {
    private static boolean isPrime(int num){
        boolean prime = true;
        if(num % 2 == 0 || num % Math.sqrt(num) == 0 && num != 0){
            prime = false;
        }
        return prime;
    }
    public static void main(String[] args){
        System.out.println(isPrime(25));
        System.out.println(isPrime(4));
        System.out.println(isPrime(15));
    }
}
