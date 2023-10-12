package Problems;
import java.util.*;
public class CountOccurrencesOfEachCharacter {
    private static Map<Character, Integer> countOccurrences(String input){
        Map<Character, Integer> counted = new HashMap<>();
        for(int i = 0;i<input.length();i++){
            char currentChar = input.charAt(i);
            int recurring = 0;
            for(int j = 0;j<input.length();j++){
                if(input.charAt(j) == input.charAt(i)){
                    recurring++;
                }
            }
            counted.put(currentChar, recurring);
        }
        return counted;
    }

    public static void main(String[] args){
        System.out.println(countOccurrences("big titties"));
    }
}
