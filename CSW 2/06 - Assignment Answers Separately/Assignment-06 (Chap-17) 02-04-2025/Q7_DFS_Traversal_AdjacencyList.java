import java.util.*;
class Graph1 {
    private int V;
    private LinkedList<Integer>[] adj;
    public Graph1(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) adj[i] = new LinkedList<>();
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
        System.out.println();
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int neighbor : adj[v]) if (!visited[neighbor]) dfsUtil(neighbor, visited);
    }
}
public class Q7_DFS_Traversal_AdjacencyList{
    public static void main(String[] args) {
        Graph1 g = new Graph1(5);
        g.addEdge(0, 1); g.addEdge(0, 2);
        g.addEdge(1, 3); g.addEdge(1, 4);
        System.out.println("DFS Traversal from node 0:");
        g.DFS(0);
    }
}