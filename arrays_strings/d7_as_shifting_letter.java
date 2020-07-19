package arrays_strings;

import java.util.Scanner;

public class d7_as_shifting_letter {
    public static String shiftingLetters(String S, int[] shifts) {
        // write your code here.
        int shift=0;
        String ans = "";
        for(int i=shifts.length-1;i>=0;i--){
            shift+=(shifts[i]%26);
            ans = ((char)((((S.charAt(i)-'a')+(shift%26))%26) +'a')) + ans;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int N = sc.nextInt();

        int[] shifts = new int[N];

        for (int i = 0; i < N; i++) {
            shifts[i] = sc.nextInt();
        }

        System.out.println(shiftingLetters(S, shifts));
    }
}
