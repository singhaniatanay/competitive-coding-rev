package dp;

import java.util.Scanner;

public class edit_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println("Edit Distance : "+ editdist(s,t));
    }

    private static int editdist(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=1;i<=n;i++) dp[i][0] = 1+dp[i-1][0];
        for(int j=1;j<=m;j++) dp[0][j] = 1+dp[0][j-1];
        for(int i = 1;i<=n;i++){
            for (int j = 1; j <=m ; j++) {
                dp[i][j] = (s.charAt(i-1)==t.charAt(j-1)?0:1) + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
            }
        }
        return dp[n][m];
    }
}
