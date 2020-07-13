package stacks_n_queues;

import java.util.Scanner;
import java.util.Stack;

public class d2_snq_playing_the_game {
    public static int calculatePoints(String[] ops) {
        // Write ypur code here only
        Stack<Integer> scores = new Stack<>();
        for(String i : ops){
            if(i.equals("+")){
                int a = scores.pop();
                int b = scores.pop();
                scores.push(b);
                scores.push(a);
                scores.push(a+b);
            }else if(i.equals("D")){
                int a = scores.pop();
                scores.push(a);
                scores.push(2*a);
            }else if(i.equals("C")){
                scores.pop();
            }else{
                int sc = Integer.parseInt(i);
                scores.push(sc);
            }
        }
        int ans = 0;
        while (!scores.isEmpty()){
            ans+=scores.pop();
        }
        return ans;
    }





    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] S=new String[n];
        for(int i=0;i<n;i++){
            S[i]=sc.next();
        }
        System.out.println(calculatePoints(S));
    }

}
