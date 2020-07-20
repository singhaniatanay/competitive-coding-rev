package arrays_strings;

import java.util.Scanner;

public class d7_as_max_consecutive_ones_v3 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] A= new int[n];
        for(int i=0;i<n;i++){
            A[i]=scn.nextInt();
        }
        int k= scn.nextInt();
        System.out.print(longestOnes(A, k));
    }
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input an array and integer k
    // It should return the required output

    public static int longestOnes(int[] nums, int k) {
        //write code here
        int st = 0;
        int end = 0;
        int len = 0;
        int max_len = 0;
        int flipped = 0;
        while (end<nums.length){
            if(nums[end]==1){
                len++;
                end++;
            }else if(nums[end]==0){
                if(flipped>=k){
                    if(nums[st]==0){
                        flipped--;
                    }
                    st++;
                    len--;
                }else {
                    flipped++;
                    len++;
                    end++;
                }
            }
            max_len = Math.max(len,max_len);

        }
        return max_len;
    }

}
