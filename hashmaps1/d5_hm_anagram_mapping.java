package hashmaps1;

import java.util.HashMap;
import java.util.Scanner;

public class d5_hm_anagram_mapping {
    public static int[] anagramMappings(int[] A, int[] B) {
        //Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<B.length;i++){
            map.put(B[i],i);
        }
        int[] ans = new int[A.length];
        for (int i = 0; i <A.length ; i++) {
            ans[i] = map.get(A[i]);
        }
        return ans;
    }

    //Don''t make any changes here
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = s.nextInt();
        }
        int[] res = anagramMappings(a, b);
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }

    }

}
