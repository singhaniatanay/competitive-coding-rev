package GoldmanSachs;

import java.util.Scanner;

public class revWords {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            System.out.print("ANS : ");
            System.out.println(revString("pqr.mno"));
            System.out.print("DONE : ");
        }
    }
    public static String revString(String src){
        String[] arr = src.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append((i==0?"":"."));
        }
        return sb.toString();
    }
}
