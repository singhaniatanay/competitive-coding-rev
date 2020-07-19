package stacks_n_queues;

import java.util.Scanner;

public class d3_snq_largest_rect_in_matrix {

    public static int maxrect(int arr[][]){
        // Write your code here only
        return 0;
    }
    //Dont make changes
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] A=new int[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                A[i][j]=sc.nextInt();
        System.out.println( maxrect(A));

    }
}
