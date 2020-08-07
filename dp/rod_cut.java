package dp;

import java.util.Scanner;

public class rod_cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            prices[i] = sc.nextInt();
        }
        dp = new int[n+1];
        System.out.print("Max profit generated : "+maxProfit_Rod_Cut(prices,n));
    }
    public static int[] dp;

    private static int maxProfit_Rod_Cut(int[] prices, int n) {
        if(n==0) return 0;
        if(dp[n]!=0) return dp[n];
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = Math.max(ans,prices[i] + maxProfit_Rod_Cut(prices,n-i));
        }
        dp[n] = ans;
        return ans;

    }
}
