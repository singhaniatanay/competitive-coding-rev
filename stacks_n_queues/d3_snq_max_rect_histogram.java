package stacks_n_queues;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class d3_snq_max_rect_histogram {
    public static int maxRectArea(int[] ht) {
        //write your code here
        int[] right_width = right_nse(ht);
        int[] left_width = left_nse(ht);
        int area = 0;
        int max_area = 0;
        for (int i = 0; i <ht.length ; i++) {
            area = (right_width[i]+left_width[i]+1)*ht[i];
            if(area>max_area){
                max_area = area;
            }
        }
        return max_area;
    }
    public static int[] right_nse(int[] arr){
        Stack<Integer> indexes=  new Stack<>();
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!indexes.isEmpty() && arr[indexes.peek()]>arr[i]){
                int in = indexes.pop();
                res[in] = i-in-1;
            }
            indexes.push(i);

        }
        while (!indexes.isEmpty()){
            int in = indexes.pop();
            res[in] = arr.length - in-1;
        }
        return res;
    }
    public static int[] left_nse(int[] arr){
        Stack<Integer> indexes=  new Stack<>();
        int[] res = new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            while (!indexes.isEmpty() && arr[indexes.peek()]>arr[i]){
                int in = indexes.pop();
                res[in] = in-i-1;
            }
            indexes.push(i);

        }
        while (!indexes.isEmpty()){
            int in = indexes.pop();
            res[in] =in;
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int h=scn.nextInt();
        int height[]=new int[h];
        for(int i=0;i<h;i++){
            height[i]=scn.nextInt();
        }
        System.out.println(maxRectArea(height));
    }
}
