package hashmaps1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class d4_hm_help_pepman {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String inp = sc.next();
        System.out.print(evenORodd(inp)?"EVEN":"ODD");
    }

    public static boolean evenORodd(String inp) {
        HashMap<Character,Integer> fmap = new HashMap<>();
        for (int i = 0; i < inp.length(); i++) {
            char curr = inp.charAt(i);
            fmap.put(curr,fmap.getOrDefault(curr,0)+1);
        }
        int even = 0;
        int odd = 0;
        for(char c:fmap.keySet()){
            if(c%2==0 && fmap.get(c)%2==0){
                even++;
            }
            else if(c%2!=0 && fmap.get(c)%2!=0){
                odd++;
            }
        }
        return (even+odd)%2==0;
    }

}
