import java.util.*;

public class P4_DirectedGraph_BFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;
    private Map<Character, Integer> vertexIndexMap; // Maps characters to indices
    private Map<Integer, Character> indexVertexMap; // Maps indices back to characters

    // Constructor
    P4_DirectedGraph_BFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        vertexIndexMap = new HashMap<>();
        indexVertexMap = new HashMap<>();
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>(); // Initialize adjacency lists
        }
    }

    // Add a vertex
    void addVertex(char vertex) {
        int index = vertexIndexMap.size();
        vertexIndexMap.put(vertex, index);
        indexVertexMap.put(index, vertex);
    }

    // Add a directed edge (from 'v' to 'w')
    void addEdge(char v, char w) {
        int fromIndex = vertexIndexMap.get(v);
        int toIndex = vertexIndexMap.get(w);
        adjList[fromIndex].add(toIndex);
    }

    // BFS Traversal
    void BFS(char startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        int startIndex = vertexIndexMap.get(startVertex);
        
        visited[startIndex] = true;
        queue.add(startIndex);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(indexVertexMap.get(v) + " ");

            for (int neighbor : adjList[v]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Breadth-First Search (BFS) Traversal for a Directed Graph:");

        P4_DirectedGraph_BFS g = new P4_DirectedGraph_BFS(5);
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');

        g.addEdge('A', 'B');
        g.addEdge('A', 'C');
        g.addEdge('B', 'D');
        g.addEdge('B', 'E');
        g.addEdge('D', 'A');
        g.addEdge('D', 'E');

        System.out.println("\nBFS Traversal starting from vertex A:");
        g.BFS('A');
    }
}
