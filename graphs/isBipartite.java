package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class isBipartite {

    public static boolean isBipartite(int[][] graph) {
            int v = graph.length;
            int[] visited = new int[v];
            for(int j=0;j<v;j++){
                Queue<Integer> q = new LinkedList<>();
                if(visited[j]!=0) continue;
                q.add(j);
                q.add(null);
                //grps = 1 and 2

                visited[j] = 1;
                while(!q.isEmpty()){
                    Integer curr = q.remove();
                    if(curr==null){
                        if(!q.isEmpty()) q.add(null);
                        continue;
                    }
                    for(int i:graph[curr]){
                        if(visited[i]==0){
                            q.add(i);
                            visited[i] = visited[curr]==1?2:1;
                        }else{
                            if(visited[i]==visited[curr]) return false;
                        }
                    }
                }
            }
            return true;
        }

}
