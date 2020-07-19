package hashmaps1;

import java.util.HashMap;
import java.util.Scanner;

public class d4_rats_in_jungle {
    public static int numRats(int[] answers) {
        // Write your code here
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:answers){
            if(i==0){
                ans +=1;
                continue;
            }
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                if(map.get(i)==i){
                    map.remove(i);
                }
            }else {
                ans += i+1;
                map.put(i,0);
            }
        }
        return ans;
    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answers = new int[sc.nextInt()];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = sc.nextInt();
        }
        System.out.println(numRats(answers));
    }
}
