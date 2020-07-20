package arrays_strings;

import java.util.Arrays;
import java.util.Scanner;

public class d8_as_sort_array_by_parity {
    public static int[] sortArrayByParity(int[] a) {
        // write your code here.
        int k=0;
        int l=a.length-1;
        int[] res  = new int[a.length];
        for(int i:a){
            if(i%2==0){
                res[k++] = i;
            }else{
                res[l--] = i;
            }
        }
        return res;

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

        int[] result = sortArrayByParity(arr);
        int[] sortedResult = sortResultEvenOdd(result);
        display(sortedResult);

    }

    // utility function, don''t change the code of it.
    private static int[] sortResultEvenOdd(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            if (arr[i] % 2 != 0) {
                Arrays.sort(arr, 0, i);
                Arrays.sort(arr, i, arr.length);
                return arr;
            }
            i++;
        }

        Arrays.sort(arr);
        return arr;

    }

    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
