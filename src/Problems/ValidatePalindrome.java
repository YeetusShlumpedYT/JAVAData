package Problems;
public class ValidatePalindrome {
    private static boolean validatePalindrome(String text){

        String cleanedString = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanedString.equals(getReversedString(cleanedString));
    }
    private static String getReversedString(String textToReverse){

        StringBuilder reversedText = new StringBuilder();
        for(int i = textToReverse.length();i > 0;i--){
            reversedText.append(textToReverse.charAt(i -1));
        }
        return reversedText.toString();
    }
    public static void main(String[] args){
        System.out.println(validatePalindrome("A man, a plan, a canal: Panama"));
    }
}
