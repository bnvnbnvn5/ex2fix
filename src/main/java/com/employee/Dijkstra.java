package com.employee;

import java.util.*;

public class Dijkstra {
    public static int[] shortestPath(int[][] graph, int startNode) {
        int n = graph.length;
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];

        // Kiểm tra đồ thị có trọng số âm
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] < 0) {
                    throw new IllegalArgumentException("Negative weights are not supported");
                }
            }
        }

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startNode] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{startNode, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];

            if (visited[node]) continue;
            visited[node] = true;

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (graph[node][neighbor] != 0 && !visited[neighbor]) {
                    int newDist = dist + graph[node][neighbor];
                    if (newDist < distances[neighbor]) {
                        distances[neighbor] = newDist;
                        pq.add(new int[]{neighbor, newDist});
                    }
                }
            }
        }

        return distances;
    }
}