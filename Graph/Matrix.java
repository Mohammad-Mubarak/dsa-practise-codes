import java.util.*;;
public class Matrix {
  public static void main(String[] args) {
    Graph g = new Graph(6, 6);
    g.addEdge(1, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(2, 1);
    g.addEdge(3, 1);
    g.addEdge(3, 2);
    g.addEdge(3, 4);
    g.addEdge(3, 5);
    g.addEdge(4, 1);
    g.addEdge(4, 3);
    g.addEdge(4, 5);
    g.addEdge(5, 3);
    g.addEdge(5, 4);
    // g.print();
    boolean[] vertices = new boolean[6];
    for (int i = 0; i < vertices.length; i++) {
      vertices[i] = false;
    }
    // g.bfs(0, vertices);
    g.bfs(0, vertices);

  }
}

class Graph {
  int[][] mat; // matrix to stroe edge nd vertexs

  public Graph(int r, int c) {
    mat = new int[r][c];
  }

  public void addEdge(int u, int v) {
    mat[u][v] = 1;
    mat[v][u] = 1;
  }

  public void print() {
    for (int i = 1; i < mat.length; i++) {
      for (int j = 1; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Adjancey matrix graph traversal BFS

  public void Dfs(int start, boolean[] visited) {
    if (!visited[start]) {
      visited[start] = true;
      System.out.print(start + " ");

      int[] connected = mat[start];
      for (int i = 0; i < connected.length; i++) {
        if (connected[i] == 1 && !visited[i]) {
            bfs(i, visited);
        }
      }
    }

  }

  public void bfs(int start, boolean[] visited) {
    Queue<Integer> queue = new LinkedList<>();
    visited[start] = true;
    queue.add(start);

    while (!queue.isEmpty()) {
      int curr = queue.poll();
      System.out.print(curr + " ");

      int[] connected = mat[curr];
      for (int i = 0; i < connected.length; i++) {
        if (connected[i] == 1 && !visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }









}