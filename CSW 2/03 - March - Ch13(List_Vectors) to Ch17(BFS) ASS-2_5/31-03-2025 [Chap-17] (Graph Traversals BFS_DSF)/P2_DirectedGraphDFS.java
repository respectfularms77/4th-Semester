import java.util.*;
public class P2_DirectedGraphDFS {
    private int vertices;
    private LinkedList<Integer> adjList[];
    private Map<Character, Integer> vertexIndexMap; 
    private Map<Integer, Character> indexVertexMap; 
    P2_DirectedGraphDFS(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        vertexIndexMap = new HashMap<>();
        indexVertexMap = new HashMap<>();
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addVertex(char vertex) {
        int index = vertexIndexMap.size();
        vertexIndexMap.put(vertex, index);
        indexVertexMap.put(index, vertex);
    }

    void addEdge(char v, char w) {
        int fromIndex = vertexIndexMap.get(v);
        int toIndex = vertexIndexMap.get(w);
        adjList[fromIndex].add(toIndex);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(indexVertexMap.get(v) + " ");
        for (int neighbour : adjList[v]) {
            if (!visited[neighbour]) {
                DFSUtil(neighbour, visited);
            }
        }
    }

    void DFS(char startVertex) {
        boolean visited[] = new boolean[vertices];
        int startIndex = vertexIndexMap.get(startVertex);
        DFSUtil(startIndex, visited);
    }

    public static void main(String[] args) {
		System.out.println("Program-2 (Graph Traversal on DFS) : Depth First Search traversal for ddirecetd graph");
    	P2_DirectedGraphDFS g = new P2_DirectedGraphDFS(5);
        g.addVertex('a');
        g.addVertex('b');
        g.addVertex('c');
        g.addVertex('d');
        g.addVertex('e');
        
        g.addEdge('a', 'b');
        g.addEdge('a', 'c');
        g.addEdge('b', 'd');
        g.addEdge('b', 'e');
        g.addEdge('d', 'a');
        g.addEdge('d', 'e');
        g.addEdge('d', 'd');

        System.out.println("\nDepth First Search Traversal starting from vertex a : ");
        g.DFS('a');
    }
}