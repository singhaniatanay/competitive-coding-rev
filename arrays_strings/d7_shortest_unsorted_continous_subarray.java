package arrays_strings;

import java.util.Scanner;

public class d7_shortest_unsorted_continous_subarray {
    public static int findUnsortedSubarray(int[] a) {
        // write your code here.
        int[] minarr = new int[a.length];
        int min = Integer.MAX_VALUE;
        int[] maxarr = new int[a.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <a.length ; i++) {
            max = Math.max(max,a[i]);
            maxarr[i] = max;
        }
        for (int i = a.length-1; i >=0 ; i--) {
            min = Math.min(min,a[i]);
            minarr[i] = min;
        }
        int st = -1;
        int end = -1;
        for (int i = 0; i <a.length ; i++) {
            if(minarr[i]!=maxarr[i]){
                st= i;
                break;
            }
        }
        for(int i = a.length-1;i>=0;i--){
            if(minarr[i]!=maxarr[i]){
                end= i;
                break;
            }
        }
        return st==-1&&end==-1?0:end-st+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of array.
        int length = sc.nextInt();

        int[] arr = new int[length];

        // Input for elements of array.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findUnsortedSubarray(arr));

    }
}
