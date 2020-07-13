package stacks_n_queues;

import java.util.Scanner;
import java.util.Stack;

public class d2_snq_pair_wise_consecutive {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        // Write your code here
        Stack<Integer> temp = new Stack<>();
        if(st.size()%2!=0){
            temp.push(st.pop());
        }
        boolean ans = true;
        while (!st.isEmpty()){
            int a = st.pop();
            int b = st.pop();
            temp.push(a);
            temp.push(b);
            if(a-b==-1 || a-b==1){
                continue;
            }
            ans = false;
            break;
        }
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }
        return ans;

    }













    // Dont make changes here
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println(pairWiseConsecutive(st));

    }
}
