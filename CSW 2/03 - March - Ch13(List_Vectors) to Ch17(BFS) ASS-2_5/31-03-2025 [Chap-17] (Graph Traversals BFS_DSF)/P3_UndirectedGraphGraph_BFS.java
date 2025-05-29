import java.util.*;
public class P3_UndirectedGraphGraph_BFS {
    private int vertices;                         // Number of vertices
    private LinkedList<Integer>[] adjList;        // Adjacency List

    // Constructor
    P3_UndirectedGraphGraph_BFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();      // Initialize each adjacency list
        }
    }

    // Add edge to the graph (Undirected Graph)
    void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }

    // BFS Traversal
    void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();  // Using Queue for BFS

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");

            // Traverse all adjacent vertices of v
            for (int neighbor : adjList[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Breadth-First Search (BFS) Traversal for an Undirected Graph:");
        
        P3_UndirectedGraphGraph_BFS g = new P3_UndirectedGraphGraph_BFS(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.println("\nBFS Traversal starting from vertex 0:");
        g.BFS(0);
    }
}
