package dsa.saturday;
public class nodes {
    public static void main(String[] args) {
        int n=3; 
        System.out.println("output is is "  + numTrees(n));
        
    }
    static int numTrees(int n) {
        int[] node = new int[n + 1];
        node[0] = 1;
        node[1] = 1;
        for (int nodes = 2; nodes <= n; nodes++) {
            node[nodes] = 0;
            for (int root = 1; root <= nodes; root++) {
                node[nodes] += node[root - 1] * node[nodes - root];
            }
        }
        return node[n];
    }
    
}
