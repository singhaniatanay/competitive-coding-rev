package stacks_n_queues;

import java.util.Scanner;
import java.util.Stack;

public class d2_snq_print_bracket_pos {
    public static void printBracketsPos(String s){
        // Write your code here
        Stack<Integer> st = new Stack<>();
        char[] arr = s.toCharArray();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            char curr = arr[i];
            if(curr=='('){
                st.push(++count);
                System.out.print(st.peek()+" ");
            }else if(curr==')'){
                System.out.print(st.peek()+" ");
                st.pop();
            }
        }
    }







    //Dont make changes here
    public static void main (String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.next();
        printBracketsPos(s);

    }
}
