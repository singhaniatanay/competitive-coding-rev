package dp;

import java.util.Scanner;

public class min_step_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Number of steps : "+ get_min_steps(n));
    }

    private static int get_min_steps(int n) {
        if(n==1) return 0;
        int[] dp = new int[n+1];
        dp[1] = 0;
        for(int i=2;i<=n;i++){
            int temp = Integer.MAX_VALUE;
            if(i-1>0) temp = Math.min(dp[i-1],temp);
            if(i%3==0 && i/3>0) temp = Math.min(dp[i/2],temp);
            if(i%2==0 && i/2>0) temp = Math.min(dp[i/3],temp);
            dp[i] = temp+1;
        }
        return dp[n];
//        int ans = Integer.MAX_VALUE;
//        if(n%3==0) ans = Math.min(get_min_steps(n/3),ans);
//        if(n%2==0) ans = Math.min(get_min_steps(n/2),ans);
//        ans = Math.min(get_min_steps(n-1),ans);
//        return ans+1;
    }
}
