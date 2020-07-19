package arrays_strings;

import java.util.Scanner;

public class d7_as_magic_squares_in_a_grid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] Input = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Input[i][j] = scn.nextInt();
            }
        }
        System.out.print(numMagicSquaresInside(Input));
    }

    // -----------------------------------------------------
    // This is a functional problem. Do not make changes to main
    // This function takes as input an array and integer k.
    // It should print required output.
    public static int numMagicSquaresInside(int[][] grid) {
        // Write your code here
        int count = 0;

        for(int i=0;i<=grid.length-3;i++){
            for (int j = 0; j <=grid[0].length-3 ; j++) {
               count += isMagicSq(grid,i,j)?1:0;
            }
        }
        return count;
    }

    private static boolean isMagicSq(int[][] grid, int i, int j) {
        if(grid[i+1][j+1]!=5){
            return false;
        }
        int rowa = grid[i][j] + grid[i][j+1] + grid[i][j+2];
        int rowb = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
        int rowc = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];

        int cola = grid[i][j] + grid[i+1][j] + grid[i+2][j];
        int colb = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
        int colc = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];
        int diaga = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
        int diagb = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];


        if(rowa!=15 || rowb!=15 || rowc!=15 || cola!=15 || colb!=15 || colc!=15){
            return false;
        }
        return diaga == 15 && diagb == 15;
    }
}
