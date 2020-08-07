package dp;
import java.util.*;
public class dp_class{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++ ) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The max Profit that can be generated is : "+ maxProfit(arr));
	}
	public static int maxProfit(int[] arr){
		int n = arr.length;
		int[][] dp = new int[n][n];
		int year = n;
		for (int i=0;i<n;i++){
			dp[i][i] = arr[i]*year;
		}
		year--;
		for(int len=2;len<=n;len++){
			int st=0;
			int end = n-len;
			while(st<=end){
				int endWindow = st+len-1;
				dp[st][endWindow] = Math.max(arr[st]*year + dp[st+1][endWindow],arr[endWindow]*year+dp[st][endWindow-1]);
				st++;
			}
			year--;
		}
		return dp[0][n-1];
	}
}