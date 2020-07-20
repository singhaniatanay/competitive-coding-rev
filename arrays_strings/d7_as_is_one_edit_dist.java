package arrays_strings;

import java.util.Scanner;

public class d7_as_is_one_edit_dist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (isOneEditDistance(s, t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean isOneEditDistance(String s, String t) {
        for (int i = 0; i < Math.min(s.length(),t.length()); i++) {
            if(s.charAt(i)!=t.charAt(i)){
                if(s.length()==t.length()){
                    return s.substring(i+1).equals(t.substring(i+1));
                }
                if(s.length()>t.length()){
                    return s.substring(i+1).equals(t.substring(i));
                }
                else{
                    return s.substring(i).equals(t.substring(i+1));
                }
            }
        }
        return Math.abs(s.length()-t.length())==1;
    }
}
