package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class representation {
    static class Graph{
        int v;
        ArrayList<LinkedList<Integer>> list;
        Graph(int v){
            this.v = v;
            list = new ArrayList<>();
            for(int i=0;i<v;i++) list.add(new LinkedList<Integer>());
        }
        void addEdge(int src,int dest){
            LinkedList<Integer> s = list.get(src);
            LinkedList<Integer> d = list.get(dest);
            s.add(dest);
            d.add(src);
        }
        void printGraph(){
            for(int i=0;i<v;i++){
                System.out.print("Adjacency list of "+i+" : ");
                for(Integer curr:list.get(i)){
                    System.out.print(curr+", ");
                }
                System.out.println();
            }
        }
        void BFS(int root){
            boolean[] visited = new boolean[list.size()];
            Queue<Integer> q = new LinkedList<>();
            visited[root] = true;
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Integer curr = q.remove();
                if(curr==null){
                    if(!q.isEmpty()) {
                        q.add(null);

                    }
                    System.out.println();
                    continue;
                }
                System.out.print(curr + " ");
                LinkedList<Integer> children = list.get(curr);
                for(Integer i:children){
                    if(!visited[i]){
                        visited[i] = true;
                        q.add(i);
                    }
                }
            }
        }
        void DFS(int root){
            boolean[] visited = new boolean[v];
            DFSutil(root,visited);
        }
        void DFSutil(int root,boolean[] visited){
            visited[root] = true;
            System.out.println(root);
            for(Integer i:list.get(root)){
                if(!visited[i]){
                    DFSutil(i,visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(4,1);
        graph.addEdge(4,3);
        graph.addEdge(3,1);
        graph.addEdge(3,2);
        graph.addEdge(1,2);
        graph.printGraph();
        graph.BFS(0);
        graph.BFS(3);
        System.out.println("--------");
        graph.DFS(0);
        System.out.println("--------");
        graph.DFS(2);
    }

}
