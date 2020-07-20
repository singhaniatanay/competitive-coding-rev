package arrays_strings;

import java.util.Scanner;

public class d7_as_attacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        //Write your code here
        if (timeSeries.length == 0) {
            return 0;
        }
        if (duration == 0) {
            return 0;
        }
        int st = timeSeries[0];
        int end = st+duration;
        int time = 0;
        for(int cTime:timeSeries){
            if(end>cTime){
                end = cTime+duration;
            }else {
                time+= end-st;
                st = cTime;
                end = st + duration;
            }
        }
        time += end-st;
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] timeseries = new int[n];
        for (int i = 0; i < n; i++) {
            timeseries[i] = sc.nextInt();
        }
        System.out.println(findPoisonedDuration(timeseries, k));
    }

}
