package arrays_strings;

import java.util.Scanner;

public class d7_as_product_except_self {
    public static int[] productExceptSelf(int[] nums) {
        //Write your code here.
        int[] res = new int[nums.length];
        res[0]=1;
        for(int i = 1;i<nums.length;i++){
            res[i] = nums[i-1] * res[i-1];
        }
        int tmp = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            res[i] = tmp * res[i];
            tmp *= nums[i];
        }
        return res;
    }

    //Don''t make changes here.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] Input = new int[n];
        for (int i = 0; i < n; i++) {
            Input[i] = scn.nextInt();
        }
        int[] ans = productExceptSelf(Input);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
