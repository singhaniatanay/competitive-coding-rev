package dp;

import java.util.Scanner;

public class max_profit_2d_DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        memo = new int[n][n];
        calls = 0;
        System.out.println("Max Profit that can be generated is : "+ maxProfit(arr,0,n-1,1));
        System.out.print("Num of calls : "+calls);
    }
    public static int calls = 0;
    public static int[][] memo;
    public static int maxProfit(int[] arr, int st, int end, int yr) {
        calls++;
        if(st>end) return 0;
        if(memo[st][end]!=0) return memo[st][end];

        int ans = arr[st] *yr + maxProfit(arr,st+1,end,yr+1);
        ans = Math.max(ans,arr[end]*yr + maxProfit(arr,st,end-1,yr+1));
        memo[st][end] = ans;
        return ans;
    }
}
