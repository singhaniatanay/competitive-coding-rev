package arrays_strings;

import java.util.Scanner;

public class d7_as_max_consecutive_ones_simple {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] nums= new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        System.out.print(findMaxConsecutiveOnes(nums));
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array
    // It should return the required output

    public static int findMaxConsecutiveOnes(int[] nums) {
        //write code here
        int st = 0;
        int end =0;
        int len = 0;
        int max_len = 0;
        while (end<nums.length){
            if(nums[end]==1){
                len++;
                end++;
            }else if(nums[end]==0){
                st = end;
                end++;
                len = 0;
            }
            max_len = Math.max(len,max_len);
        }
        return max_len;
    }

}
