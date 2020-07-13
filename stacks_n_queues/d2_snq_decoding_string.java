package stacks_n_queues;

import java.util.Scanner;
import java.util.Stack;

public class d2_snq_decoding_string {
    public static String decode(String s) {
        //Write your code here
        Stack<Character> all = new Stack<>();
        Stack<Integer> number = new Stack<>();
        Stack<String> str = new Stack<>();
        boolean trigger = false;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr=='['){
                number.push(Integer.parseInt(getNS(all)));
                trigger=true;
                continue;
            }else if(curr==']'){
                str.push(getNS(all));
                trigger=false;
                continue;
            }else{
                all.push(curr);
            }
        }
        String ans = "";
        while (!number.isEmpty()){
            int num = number.pop();
            String strr = str.pop();
            ans = strr.repeat(num)+ans;
        }
        return ans;
    }

    private static String getNS(Stack<Character> all) {
        String res = "";
        while (!all.isEmpty()){
            res = all.pop() + res;
        }
        return res;
    }


    //Dont make any changes here
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(decode(s));
    }
}
