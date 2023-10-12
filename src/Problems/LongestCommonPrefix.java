package Problems;
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        for (int charIndex = 0; charIndex < strings[0].length(); charIndex++) {
            char currentChar = strings[0].charAt(charIndex);

            for (int i = 1; i < strings.length; i++) {
                if (charIndex >= strings[i].length() || strings[i].charAt(charIndex) != currentChar) {
                    return strings[0].substring(0, charIndex);
                }
            }
        }

        return strings[0];  // Return the entire string if it's the common prefix for all
    }

    public static void main(String[] args) {
        String result1 = longestCommonPrefix(new String[]{"flower", "flow", "flight", "flick", "flimsy"});
        String result2 = longestCommonPrefix(new String[]{"dog", "racecar", "car"});

        System.out.println(result1);  // Output: "fli"
        System.out.println(result2);  // Output: ""
    }
}
