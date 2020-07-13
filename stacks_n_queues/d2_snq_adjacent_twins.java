package stacks_n_queues;

import java.util.Scanner;
import java.util.Stack;

public class d2_snq_adjacent_twins {
    public static void removeAdjTwins(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char i:arr){
            if(st.empty()){
                st.push(i);
                continue;
            }
            char curr = st.pop();
            if(i==curr){
                continue;
            }
            st.push(curr);
            st.push(i);
        }
        String res = "";
        while (!st.isEmpty()){
            char curr = st.pop();
            res = curr + res;
        }
        System.out.println(res);
    }











    //Dont make changes here
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        removeAdjTwins(s);
    }
}
