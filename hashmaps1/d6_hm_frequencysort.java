package hashmaps1;

import java.util.*;

public class d6_hm_frequencysort {

    public static String frequencySort(String s) {
        //Write your code here
        PriorityQueue<charfreq> pq = new PriorityQueue<>(Collections.reverseOrder(new Comparator<charfreq>() {
            @Override
            public int compare(charfreq o1, charfreq o2) {
                if(o1.freq==o2.freq)
                    return o2.ch - o1.ch;
                return o1.freq - o2.freq;
            }
        }));
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            pq.add(new charfreq(map.get(ch),ch));
        }
        String ans = "";
        while (!pq.isEmpty()){
            charfreq curr = pq.remove();
            for(int i=0;i<curr.freq;i++){
                ans+=curr.ch;
            }
        }
        return ans;

    }

    //Dont make changes here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(frequencySort(sc.next()));
    }

}
class charfreq{
    int freq;
    char ch;

    public charfreq(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}

