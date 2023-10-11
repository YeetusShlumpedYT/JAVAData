package chatGPTproblems;
import java.util.*;

public class anagram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text1 = input.nextLine();
        String text2 = input.nextLine();
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        if(isAnagram(text1, text2)){
            System.out.println(text1 + " and " + text2 +" are anagrams");
        }else{
            System.out.println(text1 + " and " + text2 +" are not anagrams");
        }
    }
    private static boolean isAnagram(String text1, String text2){
        if(text1.length() != text2.length()){
            return false;
        }
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}