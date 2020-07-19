package arrays_strings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class d7_as_reveal_cards_in_a_deck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = deckRevealedIncreasing(arr);
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }

    private static int[] deckRevealedIncreasing(int[] arr) {
        Arrays.sort(arr);
        Queue<Integer> q = new LinkedList<>();
        int i,j;
        i=j=0;
        while(i<arr.length){
            q.add(i++);
        }
        int[] indexes = new int[arr.length];
        while (!q.isEmpty()){
            indexes[j++] = q.remove();
            if(!q.isEmpty()){
                q.add(q.remove());
            }
        }
        int[] ans=  new int[arr.length];
        i=0;
        for(int k:indexes){
            ans[k] = arr[i++];
        }
        return ans;
    }

}
