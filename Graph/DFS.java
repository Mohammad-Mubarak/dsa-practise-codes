import java.util.*;

class Solution {
    public static void dfs(int currVertex, ArrayList<Integer>[] adjList, boolean visited[]) {
        visited[currVertex] = true; // 0
        System.out.print(currVertex + " ");

        // Evaluating the neighbours of the currVertex
        for (int i = 0; i < adjList[currVertex].size(); i++) {// 1,2
            int nbr = adjList[currVertex].get(i); // 1
            if (!visited[nbr])
                dfs(nbr, adjList, visited); // all the deepest levels from 1
        }
    }


    
    public static void DFSTraversal(List<List<Integer>> edges, int n) {
        // Create Adjacency List, n is the number of vertices
        // Create an array of size n

        ArrayList<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.size(); i++) {
            int u = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            adjList[u].add(v);
            adjList[v].add(u);
        }

        // Adjacency List got created
        for (int i = 0; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
        }


        boolean visited[] = new boolean[n];
        dfs(0, adjList, visited);
    }
}

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 3
        int e = sc.nextInt();// 4
        List<List<Integer>> ed = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            List<Integer> l = new ArrayList<>();
            l.add(sc.nextInt());
            l.add(sc.nextInt());
            ed.add(l);
        }

        Solution ob = new Solution();
        ob.DFSTraversal(ed, n);// 3
    }
}