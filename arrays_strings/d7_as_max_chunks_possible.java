package arrays_strings;

import java.util.Scanner;

public class d7_as_max_chunks_possible {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println(maxChunksToSorted(a));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written
    // This function takes as input an array
    // It should return required output

    public static int maxChunksToSorted(int[] arr) {
        // Write your code here
        int ans = arr.length;
        int[] min = new int[arr.length];
        int[] max = new int[arr.length];
        int maxx = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        for(int i=0;i<arr.length; i++){
            max[i] = Math.max(maxx,arr[i]);
            maxx = max[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            min[i] = Math.min(minn,arr[i]);
            minn = min[i];
        }
        for (int i = 0; i <arr.length-1 ; i++) {
            int left = max[i];
            int right = min[i+1];
            if(left>right){
                ans--;
            }
        }
        return ans;
    }
}
