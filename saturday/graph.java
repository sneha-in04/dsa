package dsa.saturday;
import java.util.*;
public class Graph {
    private int vertices;
    private LinkedList<Integer> adjList[];
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjList[i] = new LinkedList();
        }
    }
    void addEdge(int v, int w) {
        adjList[v].add(w);
        adjList[w].add(v);
    }
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    boolean isConnected() {
        boolean visited[] = new boolean[vertices];
        Arrays.fill(visited, false);
        DFSUtil(0, visited);
        for (int i = 0; i < vertices; i++) {
            if (!visited[i])
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        if (g.isConnected())
            System.out.println("Graph is connected");
        else
            System.out.println("Graph is not connected");
    }
}
