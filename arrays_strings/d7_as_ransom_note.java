package arrays_strings;

import java.util.HashMap;
import java.util.Scanner;

public class d7_as_ransom_note {
    public static boolean canConstruct(String rans, String magazine) {
        //Write your code here
        HashMap<Character,Integer> ransom = new HashMap<>();
        HashMap<Character,Integer> mag = new HashMap<>();
        for(char c:rans.toCharArray())
            ransom.put(c,ransom.getOrDefault(c,0)+1);
        for(char c:magazine.toCharArray())
            mag.put(c,mag.getOrDefault(c,0)+1);

        for(char c:ransom.keySet()){
            if (!mag.containsKey(c) || mag.get(c) - ransom.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
    //Don''t make any changes here
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();
        System.out.print(canConstruct(s, t));

    }
}
