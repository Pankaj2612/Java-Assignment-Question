
// Question 1 code starts here
import java.util.*;

class App {
    public static void Undirected_Unweighted() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        int[][] adjacencyMatrix = new int[vertices][vertices];

        System.out.println("Enter the edges:");
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the start vertex");
            int startVertex = scanner.nextInt();
            System.out.println("Enter the end vertex");
            int endVertex = scanner.nextInt();

            adjacencyMatrix[startVertex][endVertex] = 1;
            adjacencyMatrix[endVertex][startVertex] = 1;
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Undirected_weighted() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        int[][] adjacencyMatrix = new int[vertices][vertices];

        System.out.println("Enter the edges followed by their weight:");
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the start vertex");
            int startVertex = scanner.nextInt();
            System.out.println("Enter the end vertex");
            int endVertex = scanner.nextInt();
            System.out.println("Enter the Weight of the edge");
            int weight = scanner.nextInt();

            adjacencyMatrix[startVertex][endVertex] = weight;
            adjacencyMatrix[endVertex][startVertex] = weight;
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Directed_unweighted() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        int[][] adjacencyMatrix = new int[vertices][vertices];

        System.out.println("Enter the edges:");
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the start vertex");
            int startVertex = scanner.nextInt();
            System.out.println("Enter the end vertex");
            int endVertex = scanner.nextInt();

            adjacencyMatrix[startVertex][endVertex] = 1;
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Directed_weighted() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        int[][] adjacencyMatrix = new int[vertices][vertices];

        System.out.println("Enter the edges followed by their weight:");
        for (int i = 0; i < edges; i++) {
            System.out.println("Enter the start vertex");
            int startVertex = scanner.nextInt();
            System.out.println("Enter the end vertex");
            int endVertex = scanner.nextInt();
            System.out.println("Enter the Weight of the edge");
            int weight = scanner.nextInt();

            adjacencyMatrix[startVertex][endVertex] = weight;
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// Question 2 code starts here
class EdgeAd {
    int src, dest, weight;

    public EdgeAd(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class GraphAd {
    List<List<EdgeAd>> adjList = null;

    // Constructor
    GraphAd(int N) {
        adjList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            adjList.add(i, new ArrayList<>());
        }
    }

    // Add edge for undirected unweighted graph
    public void addEdgeUndirectedUnweighted(int src, int dest) {
        adjList.get(src).add(new EdgeAd(src, dest, 1)); // weight is 1
        adjList.get(dest).add(new EdgeAd(dest, src, 1)); // weight is 1
    }

    // Add edge for undirected weighted graph
    public void addEdgeUndirectedWeighted(int src, int dest, int weight) {
        adjList.get(src).add(new EdgeAd(src, dest, weight));
        adjList.get(dest).add(new EdgeAd(dest, src, weight));
    }

    // Add edge for directed unweighted graph
    public void addEdgeDirectedUnweighted(int src, int dest) {
        adjList.get(src).add(new EdgeAd(src, dest, 1)); // weight is 1
    }

    // Add edge for directed weighted graph
    public void addEdgeDirectedWeighted(int src, int dest, int weight) {
        adjList.get(src).add(new EdgeAd(src, dest, weight));
    }

    // Print graph
    public void printGraph() {
        int srcVertex = 0;
        int listSize = adjList.size();

        while (srcVertex < listSize) {
            for (EdgeAd edge : adjList.get(srcVertex)) {
                System.out.println("Vertex:" + srcVertex + " ==> " + edge.dest + " (weight: " + edge.weight + ")");
            }
            srcVertex++;
        }
    }
}

// Question 3 code starts here
class Edge2 {
    int dest;
    int weight;

    public Edge2(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph1 {
    private int V;
    private LinkedList<Integer> adj[];

    Graph1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
}

class Graph2 {
    private int V;
    private LinkedList<Edge2> adj[];

    Graph2(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w, int weight) {
        Edge2 edge = new Edge2(w, weight);
        adj[v].add(edge);
        edge = new Edge2(v, weight);
        adj[w].add(edge);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Edge2> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next().dest;
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];

        DFSUtil(v, visited);
    }
}

class Graph3 {
    private int V;
    private LinkedList<Integer> adj[];

    // Constructor
    Graph3(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
}

class Graph4 {
    private int V;
    private LinkedList<Edge2> adj[];

    Graph4(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w, int weight) {
        Edge2 edge = new Edge2(w, weight);
        adj[v].add(edge);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Edge2> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next().dest;
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
}

// Question 4 starts here

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void topologicalSortUtil(int v, boolean visited[], Stack stack) {
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        stack.push(new Integer[v]);
    }

    void topologicalSort() {
        Stack stack = new Stack();

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }
}

// question 5 starts here
class GraphBFS1 {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    GraphBFS1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

class GraphBFS2 {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    GraphBFS2(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s) {
        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

// Question 6 starts here

class GraphB1 {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency Lists

    // Constructor
    GraphB1(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v); // For undirected graph
    }

    // This function returns true if graph is Bipartite, else false
    boolean isBipartite(int src) {
        int colorArr[] = new int[V];
        for (int i = 0; i < V; ++i)
            colorArr[i] = -1;

        colorArr[src] = 1;

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(src);

        while (queue.size() != 0) {
            int u = queue.poll();

            for (int v : adj[u]) {
                if (colorArr[v] == -1) {
                    colorArr[v] = 1 - colorArr[u];
                    queue.add(v);
                } else if (colorArr[v] == colorArr[u])
                    return false;
            }
        }
        return true;
    }
}

public class Day1q {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("A: Exit");
            System.out.println("B: Adjacency matrix representation");
            System.out.println("C: Adjacency Linked list representation");
            System.out.println("D: DFS traversal");
            System.out.println("E: Topological Sorting");
            System.out.println("F: BFS Traversal");
            System.out.println("G: Check Bipartiteness");
            System.out.println("Please enter your choice");

            String choice = sc.nextLine();
            choice.toLowerCase();

            switch (choice) {
                case "a":
                    System.exit(0);

                case "b":
                    while (true) {

                        System.out.println("0: Exit");
                        System.out.println("1: Undirected and Unweighted");
                        System.out.println("2: Undirected and weighted");
                        System.out.println("3: Directed and Unweighted");
                        System.out.println("4: Directed and weighted");
                        System.out.println("Enter your choice: ");
                        int n = sc.nextInt();

                        switch (n) {

                            case 0:
                                System.exit(0);

                            case 1:
                                App a = new App();
                                a.Undirected_Unweighted();
                                break;

                            case 2:
                                App b = new App();
                                b.Undirected_weighted();
                                break;

                            case 3:
                                App c = new App();
                                c.Directed_unweighted();
                                break;

                            case 4:
                                App d = new App();
                                d.Directed_weighted();
                                break;
                            default:
                                throw new IllegalArgumentException("Unexpected value: " + n);
                        }
                    }
                    // break

                case "c":
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter number of vertices:");
                    int N = scanner.nextInt();

                    GraphAd graph = new GraphAd(N);

                    System.out.println("Enter number of edges:");
                    int E = scanner.nextInt();

                    System.out.println(
                            "Enter details of edges (source, destination, weight, isDirected(true/false), isWeighted(true/false)):");
                    for (int i = 0; i < E; i++) {
                        int source = scanner.nextInt();
                        int destination = scanner.nextInt();
                        int weight = scanner.nextInt();
                        boolean isDirected = scanner.nextBoolean();
                        boolean isWeighted = scanner.nextBoolean();

                        if (isDirected) {
                            if (isWeighted) {
                                graph.addEdgeDirectedWeighted(source, destination, weight);
                            } else {
                                graph.addEdgeDirectedUnweighted(source, destination);
                            }
                        } else {
                            if (isWeighted) {
                                graph.addEdgeUndirectedWeighted(source, destination, weight);
                            } else {
                                graph.addEdgeUndirectedUnweighted(source, destination);
                            }
                        }
                    }
                    graph.printGraph();
                    break;

                case "d":
                    while (true) {
                        System.out.println("0: Exit");
                        System.out.println("1: Undirected and Unweighted DFS");
                        System.out.println("2: Undirected and weighted DFS");
                        System.out.println("3: Directed and Unweighted DFS");
                        System.out.println("4: Directed and weighted DFS");
                        System.out.println("Enter your choice: ");
                        int n = sc.nextInt();

                        switch (n) {

                            case 0:
                                System.exit(0);

                            case 1:
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("Enter the number of vertices:");
                                int v1 = scanner1.nextInt();
                                Assignment1_2241016153.Graph1 g1 = new Assignment1_2241016153.Graph1(v1);

                                System.out.println("Enter the number of edges:");
                                int e1 = scanner1.nextInt();
                                for (int i = 0; i < e1; i++) {
                                    System.out.println(
                                            "Enter the source and destination vertex of edge " + (i + 1) + ":");
                                    int src1 = scanner1.nextInt();
                                    int dest1 = scanner1.nextInt();
                                    g1.addEdge(src1, dest1);
                                }

                                System.out.println("Enter the starting vertex for DFS:");
                                int startVertex1 = scanner1.nextInt();

                                System.out.println("Following is Depth First Traversal (starting from vertex "
                                        + startVertex1 + "):");

                                g1.DFS(startVertex1);
                                System.out.println();

                                break;

                            case 2:
                                Scanner scanner2 = new Scanner(System.in);
                                System.out.println("Enter the number of vertices:");
                                int v2 = scanner2.nextInt();
                                Assignment1_2241016153.Graph2 g2 = new Assignment1_2241016153.Graph2(v2);

                                System.out.println("Enter the number of edges:");
                                int e2 = scanner2.nextInt();
                                for (int i = 0; i < e2; i++) {
                                    System.out.println("Enter the source and destination vertex of edge " + (i + 1)
                                            + " along with its weight:");
                                    int src2 = scanner2.nextInt();
                                    int dest2 = scanner2.nextInt();
                                    int weight2 = scanner2.nextInt();
                                    g2.addEdge(src2, dest2, weight2);
                                }

                                System.out.println("Enter the starting vertex for DFS:");
                                int startVertex2 = scanner2.nextInt();

                                System.out.println("Following is Depth First Traversal (starting from vertex "
                                        + startVertex2 + "):");

                                g2.DFS(startVertex2);
                                System.out.println();

                                break;

                            case 3:
                                Scanner scanner3 = new Scanner(System.in);
                                System.out.println("Enter the number of vertices:");
                                int v3 = scanner3.nextInt();
                                Assignment1_2241016153.Graph3 g3 = new Assignment1_2241016153.Graph3(v3);

                                System.out.println("Enter the number of edges:");
                                int e3 = scanner3.nextInt();
                                for (int i = 0; i < e3; i++) {
                                    System.out.println(
                                            "Enter the source and destination vertex of edge " + (i + 1) + ":");
                                    int src3 = scanner3.nextInt();
                                    int dest3 = scanner3.nextInt();
                                    g3.addEdge(src3, dest3);
                                }

                                System.out.println("Enter the starting vertex for DFS:");
                                int startVertex3 = scanner3.nextInt();

                                System.out.println("Following is Depth First Traversal (starting from vertex "
                                        + startVertex3 + "):");

                                g3.DFS(startVertex3);
                                System.out.println();

                                break;

                            case 4:
                                Scanner scanner4 = new Scanner(System.in);
                                System.out.println("Enter the number of vertices:");
                                int v4 = scanner4.nextInt();
                                Assignment1_2241016153.Graph4 g4 = new Assignment1_2241016153.Graph4(v4);

                                System.out.println("Enter the number of edges:");
                                int e4 = scanner4.nextInt();
                                for (int i = 0; i < e4; i++) {
                                    System.out.println("Enter the source and destination vertex of edge " + (i + 1)
                                            + " along with its weight:");
                                    int src4 = scanner4.nextInt();
                                    int dest4 = scanner4.nextInt();
                                    int weight4 = scanner4.nextInt();
                                    g4.addEdge(src4, dest4, weight4);
                                }
                                System.out.println("Enter the starting vertex for DFS:");
                                int startVertex4 = scanner4.nextInt();

                                System.out.println("Following is Depth First Traversal (starting from vertex "
                                        + startVertex4 + "):");

                                g4.DFS(startVertex4);
                                System.out.println();

                                break;
                            default:
                                throw new IllegalArgumentException("Unexpected value: " + n);
                        }
                    }

                    // break;

                case "e":
                    System.out.println("Enter the number of vertices:");
                    int v = sc.nextInt();
                    Assignment1_2241016153.Graph g = new Assignment1_2241016153.Graph(v);

                    System.out.println("Enter the number of edges:");
                    int e = sc.nextInt();
                    for (int i = 0; i < e; i++) {
                        System.out.println("Enter the source and destination vertex of edge " + (i + 1) + ":");
                        int src = sc.nextInt();
                        int dest = sc.nextInt();
                        g.addEdge(src, dest);
                    }

                    System.out.println("Following is a Topological sort of the given graph:");
                    g.topologicalSort();

                    break;

                case "f":
                    while (true) {
                        System.out.println("0: Exit");
                        System.out.println("1: Undirected and Unweighted BFS");
                        System.out.println("2: Undirected and weighted BFS");
                        System.out.println("3: Directed and Unweighted BFS");
                        System.out.println("4: Directed and weighted BFS");
                        System.out.println("Enter your choice: ");
                        int n = sc.nextInt();

                        switch (n) {

                            case 0:
                                System.exit(0);

                            case 1:
                                Assignment1_2241016153.GraphBFS1 g2 = new Assignment1_2241016153.GraphBFS1(4);

                                g2.addEdge(0, 1);
                                g2.addEdge(0, 2);
                                g2.addEdge(1, 2);
                                g2.addEdge(2, 0);
                                g2.addEdge(2, 3);
                                g2.addEdge(3, 3);

                                System.out.println("Following is Breadth First Traversal " +
                                        "(starting from vertex 2)");

                                g2.BFS(2);
                                break;

                            case 2:
                                // As mentioned earlier, BFS does not consider weights. For a weighted graph, we
                                // usually use Dijkstra’s algorithm or the Bellman-Ford algorithm. However, if
                                // all weights are equal, we can still use BFS.
                                break;

                            case 3:
                                Assignment1_2241016153.GraphBFS2 g1 = new Assignment1_2241016153.GraphBFS2(4);

                                g1.addEdge(0, 1);
                                g1.addEdge(0, 2);
                                g1.addEdge(1, 2);
                                g1.addEdge(2, 0);
                                g1.addEdge(2, 3);
                                g1.addEdge(3, 3);

                                System.out.println("Following is Breadth First Traversal " +
                                        "(starting from vertex 2)");

                                g1.BFS(2);
                                break;

                            case 4:
                                // Similar to the undirected weighted graph, for a directed weighted graph, we
                                // usually use Dijkstra’s algorithm or the Bellman-Ford algorithm, as BFS does
                                // not consider weights. However, if all weights are equal, we can still use
                                // BFS.
                                break;
                            default:
                                throw new IllegalArgumentException("Unexpected value: " + n);
                        }
                    }
                    // break;

                case "g":
                    System.out.println("Enter the number of vertices:");
                    int V = sc.nextInt();
                    Assignment1_2241016153.GraphB1 g3 = new Assignment1_2241016153.GraphB1(V);

                    System.out.println("Enter the number of edges:");
                    int E2 = sc.nextInt();

                    System.out.println("Enter the edges:");
                    for (int i = 0; i < E2; i++) {
                        int u = sc.nextInt();
                        int v2 = sc.nextInt();
                        g3.addEdge(u, v2);
                    }

                    System.out.println("Enter the source vertex:");
                    int src = sc.nextInt();

                    if (g3.isBipartite(src))
                        System.out.println("Yes");
                    else
                        System.out.println("No");

                    break;

                default:
                    System.out.println("You've entered wrong choice");
            }
        }
    }
}
