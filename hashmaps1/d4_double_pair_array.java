package hashmaps1;

import java.util.*;

public class d4_double_pair_array {

    public static boolean canReorder(int[] A) {
        // Write your code here
        HashMap<Integer,Integer> fmap = new HashMap<>();
        for(int i:A){
            fmap.put(i,fmap.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> uniqueVals = new ArrayList<>(fmap.keySet());
        Collections.sort(uniqueVals);
        for(int key:uniqueVals){
            int val = fmap.get(key);
            if(val==0){
                continue;
            }
            if(key==0){
                if(val%2!=0){
                    return false;
                }
                fmap.put(key,0);
            }else{
                if(key<0){
                    if(fmap.containsKey(2*key)){
                        fmap.put(key*2,fmap.get(2*key)-1);
                        fmap.put(key,fmap.get(key)-1);
                    }
                }else{
                    if(key%2==0){
                        if(fmap.containsKey(key/2)){
                            fmap.put(key/2,fmap.get(key/2)-1);
                            fmap.put(key,fmap.get(key)-1);
                        }
                    }
                }
            }
        }

        for(int i:fmap.keySet()){
            if(fmap.get(i)>0){
                return false;
            }
        }
        return true;
    }



    // Dont make changes here
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
        System.out.println(canReorder(a));

    }

}
