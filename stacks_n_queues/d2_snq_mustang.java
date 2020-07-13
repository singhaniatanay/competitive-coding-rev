package stacks_n_queues;

import java.util.Scanner;

public class d2_snq_mustang {

    public static int mustangTour(int[] petrol,int[] dist){
        // Write your code here
        for (int i = 0; i <petrol.length ; i++) {
            if(isTourPossible(i,petrol,dist))
                return i;
        }
        return -1;
    }

    private static boolean isTourPossible(int i, int[] petrol, int[] dist) {
        int tank =0;
        int ini = i;
        do{
            tank+=petrol[i];
            tank-=dist[i];
            if(tank<0){
               return false;
            }
            i++;
            if(i==petrol.length){
                i=0;
            }
        }while (i!=ini);
        return true;
    }


    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] petrol=new int[n];int[] dist=new int[n];
        for(int i=0;i<n;i++)petrol[i]=sc.nextInt();
        for(int i=0;i<n;i++)dist[i]=sc.nextInt();
        System.out.println(mustangTour(petrol,dist));
    }


}
