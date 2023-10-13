package Problems;

public class LongestCommonSubsequence {
    private static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args){
        System.out.println(longestCommonSubsequence("abcde", "ace"));  // should return 3
        System.out.println(longestCommonSubsequence("abc", "abc"));    // should return 3
        System.out.println(longestCommonSubsequence("abc", "def"));    // should return 0
        System.out.println(longestCommonSubsequence("AGGTAB", "GXTXAYB"));  // should return 4
    }
}
