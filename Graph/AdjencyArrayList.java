import java.util.ArrayList;






/// apna college ka code adjency list bannae ka so never forget this code brp
public class AdjencyArrayList {
   

    public static void main(String[] args) {
        
           Graph g =new Graph(5);

           g.edges[0].add(new Edge(1, 0, 5));


          // vertices 1
           g.edges[1].add(new Edge(1, 0, 5));
           g.edges[1].add(new Edge(1, 2, 1));
           g.edges[1].add(new Edge(1, 3, 3));

    
           // vertices 2
           g.edges[2].add(new Edge(2, 1, 1));
           g.edges[2].add(new Edge(2, 3, 1));
           g.edges[2].add(new Edge(2, 4, 4));


            // vertices 3
           g.edges[3].add(new Edge(3, 1, 3));
           g.edges[3].add(new Edge(3, 2, 1));


           //vertices 4
           g.edges[4].add(new Edge(4, 2, 2));
           
           // printing 
            ArrayList<Edge> e = g.edges[2];
            for (int j = 0; j < e.size(); j++) {
                System.out.print(">>>"+ e.get(j).dst);
            }
           
         
    }


}

class Edge{
    int src, dst,weight;
    Edge(int src, int dst, int weight){
        this.src = src;
        this.dst = dst;
        this.weight = weight;
    }
}

class Graph{
    ArrayList<Edge>[] edges;
    public Graph(int n){
        edges = new ArrayList[n];
        for(int i = 0; i < n; i++){
            edges[i] = new ArrayList<Edge>();
        }
    }
}
