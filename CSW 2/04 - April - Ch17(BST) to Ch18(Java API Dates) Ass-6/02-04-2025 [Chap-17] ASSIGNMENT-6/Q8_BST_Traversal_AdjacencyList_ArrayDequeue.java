import java.util.*;
class Graph2 {
    private int V;
    private List<Integer>[] adj;
    public Graph2(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++) adj[i] = new ArrayList<>();
    }
    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }
    public void displayAdjList() {
        for (int i = 0; i < V; i++) System.out.println(i + " -> " + adj[i]);
    }
    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int neighbor : adj[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}
public class Q8_BST_Traversal_AdjacencyList_ArrayDequeue{
    public static void main(String[] args) {
        Graph2 g = new Graph2(5);
        g.addEdge(0, 1); g.addEdge(0, 2);
        g.addEdge(1, 3); g.addEdge(1, 4);

        System.out.println("Adjacency List:");
        g.displayAdjList();

        System.out.println("\nBFS Traversal from node 0:");
        g.BFS(0);
    }
}