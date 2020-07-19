package hashmaps1;

import java.util.HashSet;
import java.util.Scanner;

public class d4_hm_incomplete_array {
    public static int incomplete(int[] arr) {
        // write your code here
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            set.add(i);
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        int ans = 0;
        for (int i = min; i <=max; i++) {
            if(!set.contains(i)){
                ans++;
            }
        }
        return ans;
    }

    // -----------------------------------------------------

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(incomplete(arr));
    }
}
