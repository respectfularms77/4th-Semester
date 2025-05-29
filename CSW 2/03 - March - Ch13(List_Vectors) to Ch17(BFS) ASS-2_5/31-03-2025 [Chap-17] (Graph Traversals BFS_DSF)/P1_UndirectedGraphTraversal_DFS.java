import java.util.*;
public class P1_UndirectedGraphTraversal_DFS {
	private int vertices;								//Number of Vertices
	private LinkedList<Integer> adjList[];				//Adjacency List
	public P1_UndirectedGraphTraversal_DFS(int v){		//Constructor
		vertices =v;
		adjList = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	void addEdge(int v ,int w) {
		adjList[v].add(w);						//Add w to v's list
		adjList[w].add(v);						//Since the Graph is undirected
	}
	
	//DFS Traversal
	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v+ " ");
		for(int neighbour: adjList[v]) {
			if(!visited[neighbour]) {
				DFSUtil(neighbour,visited); 
			}
		}
	}
	void DFS(int startVertex) {
		boolean visited[] = new boolean[vertices];
		DFSUtil(startVertex, visited);
	}
	public static void main(String[] args) {
		System.out.println("Program-1 (Graph Traversal on DFS): Depth First Search Traversal for undirected graph");
		P1_UndirectedGraphTraversal_DFS g = new P1_UndirectedGraphTraversal_DFS(6);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,5);
		System.out.println("\nDepth First Traversal starting from vertex 0: ");
		g.DFS(0);
	}
}