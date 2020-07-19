package stacks_n_queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class d2_snq_rotation_of_cards {
    public static void cardRotation(int N) {

        // Write your code here
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i <=N ; i++) {
            q.add(i);
        }
        int num = 1;
        while (!q.isEmpty()){
            for (int i = 0; i <num ; i++) {
                q.add(q.remove());
            }
            map.put(q.remove(),num++);
        }
        for (int i = 1; i <=N ; i++) {
            System.out.print(map.get(i)+" ");
        }
    }

    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        cardRotation(N);
    }

}
