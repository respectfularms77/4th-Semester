import java.util.*;
public class P5_Choice_Based_Q_Graph {
    private List<Integer>[] adj;

    @SuppressWarnings("unchecked")
    P5_Choice_Based_Q_Graph(int v) {
        adj = new LinkedList[v];
        Arrays.setAll(adj, i -> new LinkedList<>());
    }

    void addEdge(int v, int w) {
        if (v >= 0 && v < adj.length && w >= 0 && w < adj.length) {
            adj[v].add(w);
            adj[w].add(v);
        } else {
            System.out.println("Invalid edge! Vertices should be between 0 and " + (adj.length - 1));
        }
    }

    void BFS(int s) {
        if (s < 0 || s >= adj.length) {
            System.out.println("Invalid start vertex for BFS!");
            return;
        }

        boolean[] vis = new boolean[adj.length];
        Queue<Integer> q = new LinkedList<>();
        vis[s] = true;
        q.add(s);

        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int n : adj[v]) {
                if (!vis[n]) { 
                    vis[n] = true;
                    q.add(n);
                }
            }
        }
        System.out.println();
    }

    void DFS(int s) {
        if (s < 0 || s >= adj.length) {
            System.out.println("Invalid start vertex for DFS!");
            return;
        }

        boolean[] vis = new boolean[adj.length];
        System.out.print("DFS: ");
        DFSUtil(s, vis);
        System.out.println();
    }

    private void DFSUtil(int v, boolean[] vis) {
        vis[v] = true;
        System.out.print(v + " ");
        for (int n : adj[v]) {
            if (!vis[n]) {
                DFSUtil(n, vis);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        P5_Choice_Based_Q_Graph g = new P5_Choice_Based_Q_Graph(vertices);

        while (true) {
            System.out.println("\n1) Add Edge  2) BFS  3) DFS  4) Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter two vertices: ");
                    int v = sc.nextInt(), w = sc.nextInt();
                    g.addEdge(v, w);
                }
                case 2 -> {
                    System.out.print("Start vertex for BFS: ");
                    g.BFS(sc.nextInt());
                }
                case 3 -> {
                    System.out.print("Start vertex for DFS: ");
                    g.DFS(sc.nextInt());
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}