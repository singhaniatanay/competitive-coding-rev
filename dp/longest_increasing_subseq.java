package dp;

import java.util.Scanner;

public class longest_increasing_subseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("LIS : "+ lis(arr,n));
    }

    private static int lis(int[] arr, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<=arr[i]) {
                    int curlen = 1 + dp[j];
                    dp[i] = Math.max(curlen,dp[i]);

                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
