package algo_03_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * GFG Reference: https://www.geeksforgeeks.org/dsa/dijkstras-shortest-path-algorithm-greedy-algo-7/
 * Solution on GFG: https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
 * ============================================================================
 * PROBLEM STATEMENT: DIJKSTRA'S ALGORITHM
 * ============================================================================
 * 
 * Dijkstra's algorithm finds the shortest path (minimum total edge weight)
 * from a starting node (source) to all other nodes in a weighted graph.
 * 
 * Key Condition:
 *   All edge weights MUST be non-negative (>= 0).
 * 
 * ----------------------------------------------------------------------------
 * INPUT & OUTPUT EXAMPLE:
 * ----------------------------------------------------------------------------
 * Graph:
 *         (0) --4--> (1)
 *          |        / |
 *          8       2  5
 *          v      v   v
 *         (2) --5--> (3)
 * 
 * Input:
 *   - V = 4 (number of vertices: 0, 1, 2, 3)
 *   - src = 0
 *   - edges = [
 *       {0, 1, 4}, // edge from node 0 to node 1 with weight 4
 *       {0, 2, 8}, // edge from node 0 to node 2 with weight 8
 *       {1, 2, 2}, // edge from node 1 to node 2 with weight 2
 *       {1, 3, 5}, // edge from node 1 to node 3 with weight 5
 *       {2, 3, 5}  // edge from node 2 to node 3 with weight 5
 *     ]
 * 
 * Output:
 *   - dist = [0, 4, 6, 9]
 *     * dist to node 0 = 0
 *     * dist to node 1 = 4
 *     * dist to node 2 = 6  (path 0 -> 1 -> 2 is 4 + 2 = 6, better than direct edge of 8)
 *     * dist to node 3 = 9  (path 0 -> 1 -> 3 is 4 + 5 = 9)
 * 
 * ----------------------------------------------------------------------------
 * COMPLEXITY:
 * ----------------------------------------------------------------------------
 * Time Complexity:  O((V + E) * log V) using a Min-Heap (PriorityQueue)
 * Space Complexity: O(V + E) to store the graph and distances
 * ============================================================================
 */
public class DijkstraAlgorithm {

    /**
     * Computes the shortest distance from the source vertex to all vertices.
     * 
     * @param V     Total number of vertices (labeled 0 to V - 1)
     * @param edges Array of directed edges where edge[i] = {fromNode, toNode, weight}
     * @param src   The starting/source vertex
     * @return An array where dist[node] is the shortest distance from src to that node
     */
    public static int[] dijkstra(int V, int[][] edges, int src) {
        // Step 1: Build the adjacency list.
        // adj.get(currentNode) contains a list of [neighborNode, edgeWeight] pairs
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int fromNode = edge[0];
            int toNode = edge[1];
            int weight = edge[2];
            adj.get(fromNode).add(new int[]{toNode, weight});
        }

        // Step 2: Initialize all distances to infinity, source distance to 0
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        // Step 3: Min-heap storing pairs of {node, currentDistance}, ordered by distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.offer(new int[]{src, 0});

        // Step 4: Process vertices in order of increasing distance
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            // If we have already found a shorter path to currentNode, skip this outdated entry
            if (currentDist > dist[currentNode]) {
                continue;
            }

            // Step 5: Explore and relax all outgoing edges from currentNode
            for (int[] edge : adj.get(currentNode)) {
                int neighborNode = edge[0];
                int edgeWeight = edge[1];

                // Relaxation check:
                // Is reaching neighborNode through currentNode shorter than the best-known path so far?
                int newDist = dist[currentNode] + edgeWeight;
                if (dist[currentNode] != Integer.MAX_VALUE && newDist < dist[neighborNode]) {
                    dist[neighborNode] = newDist;
                    pq.offer(new int[]{neighborNode, newDist});
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 4;
        int src = 0;
        int[][] edges = {
            {0, 1, 4},
            {0, 2, 8},
            {1, 2, 2},
            {1, 3, 5},
            {2, 3, 5}
        };

        int[] shortestDistances = dijkstra(V, edges, src);

        // Print shortest distance to each node
        System.out.println("Shortest distances from source node " + src + ":");
        for (int node = 0; node < V; node++) {
            if (shortestDistances[node] == Integer.MAX_VALUE) {
                System.out.println("Node " + node + " : INF (Unreachable)");
            } else {
                System.out.println("Node " + node + " : " + shortestDistances[node]);
            }
        }
    }
}