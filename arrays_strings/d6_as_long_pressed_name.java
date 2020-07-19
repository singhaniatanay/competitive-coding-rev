package arrays_strings;

import java.util.Scanner;

public class d6_as_long_pressed_name {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        String typed = scn.next();
        System.out.println(isLongPressedName(name, typed));

    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input 2 strings
    // It should return boolean output.
    public static boolean isLongPressedName(String name, String typed) {
        // Write your code here
        if(name.length()>typed.length())
            return true;

        int i=0;
        int j=0;
        while (j<typed.length()){
            char currB = typed.charAt(j);
            char currA = '/';
            if(i<name.length()) {
                currA = name.charAt(i);
            }else{
                currA = typed.charAt(j-1);
            }
            if (currA == currB) {
                i++;
                j++;
            }else if(currB==typed.charAt(j-1)){
                j++;
            }else{
                return false;
            }
        }
        return i >= name.length();

    }
}
