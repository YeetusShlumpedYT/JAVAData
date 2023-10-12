package Problems;

public class ReversedString {
    public static String reversedString(String input){
        StringBuilder reversedInput = new StringBuilder("");

        for(int i = input.length() - 1;i >= 0;i--){
            reversedInput.append(input.charAt(i));
        }
        return reversedInput.toString();
    }
    public static void main(String[] args){
        String input = "Hello, World!";
        String reversed = reversedString(input);
        System.out.println(reversed);
    }
}
