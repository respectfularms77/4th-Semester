import java.util.*;

class Graph {
    private int V;
    private int[][] adjMatrix;
    private List<List<Integer>> adjList;

    public Graph(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
        adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) adjList.add(new ArrayList<>());
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = adjMatrix[v][u] = 1;
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void displayMatrix() {
        for (int[] row : adjMatrix) System.out.println(Arrays.toString(row));
    }

    public void displayList() {
        for (int i = 0; i < V; i++) System.out.println(i + " -> " + adjList.get(i));
    }
}

public class Q6_Adjacency_LIST_MATRIX{
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1); g.addEdge(0, 4);
        g.addEdge(1, 2); g.addEdge(1, 3); g.addEdge(1, 4);
        g.addEdge(2, 3); g.addEdge(3, 4);
        
        System.out.println("Adjacency Matrix:");
        g.displayMatrix();
        
        System.out.println("\nAdjacency List:");
        g.displayList();
    }
}