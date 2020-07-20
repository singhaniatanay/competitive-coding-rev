package arrays_strings;

import java.util.Arrays;
import java.util.Scanner;

public class d8_as_sorted_squares {
    public static int[] sortedSquares(int[] A) {
        // write your code here.
        for(int i=0;i<A.length;i++){
            A[i] = A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
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

        int[] result = sortedSquares(arr);
        display(result);

    }
    // function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

}
