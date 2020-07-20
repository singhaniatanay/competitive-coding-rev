package arrays_strings;

import java.util.Scanner;

public class d7_max_consecutive_ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        // write your code here.
        int st = 0;
        int end = 0;
        int len = 0;
        int max_len = 0;
        boolean flipped = false;
        while (end<nums.length){
            if(nums[end]==1){
                len++;
                end++;
            }else if(nums[end]==0){
                if(flipped){
                    if(nums[st]==0){
                        flipped = false;
                    }
                    st++;
                    len--;
                }else {
                    flipped = true;
                    len++;
                    end++;
                }
            }
            max_len = Math.max(len,max_len);

        }
        return max_len;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for length of first array.
        int N = sc.nextInt();

        int[] arr1 = new int[N];

        // Input for array1 elements.
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(arr1);

        System.out.println(result);

    }

    // Function to display an array.
    public static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
