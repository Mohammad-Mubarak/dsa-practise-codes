import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjencyList {
    public static void main(String[] args) {
        AdjencyListGraph graph = new AdjencyListGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.print();

        graph.breadthFirstsearch(0);
    }
}

class AdjencyListGraph {
    ArrayList<Integer>[] graph;

    public AdjencyListGraph(int n) {
        graph = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

    }

    public void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }


    public void print() {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + ">>>>> ");
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.print(graph[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public void breadthFirstsearch(int start){
          
        boolean visited[] =new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");

            for(int v:graph[u]){
                if(!visited[v]){
                    q.add(v);
                    visited[v] = true;
                }
            }
        }





    }
                
                       
}