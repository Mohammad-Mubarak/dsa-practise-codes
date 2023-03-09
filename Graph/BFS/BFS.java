package BFS;

import java.util.*;
import java.io.*;
 
class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;
 
    Graph(int v) {
        this.vertices = v;
        adjList = new ArrayList[v];
        for (int i = 0; i < v; i++) adjList[i] = new ArrayList<Integer>();
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }
 

    
    void BFS(int x) {
		boolean visited[]=new boolean[vertices]; // to stroe visited vertex
		Queue<Integer> q =new LinkedList<>();
		q.offer(x);
		visited[x]=true;
		while(!q.isEmpty()){
			x=q.poll();    // empty or not 
			System.out.print(x+" ");

            
			for(int i=0;i<adjList[x].size();i++){
				int val = adjList[x].get(i);
				if(!visited[val]){
					q.offer(val);
					visited[val]=true;
				}
			}
		}		
    }
}


public class BFS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}
