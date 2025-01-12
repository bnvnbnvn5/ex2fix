package com.employee;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DijkstraTest {
    @Test
    void testConstructor() {
        Dijkstra dijkstra = new Dijkstra(); // Gọi constructor mặc định
        assertNotNull(dijkstra); // Đảm bảo đối tượng không null
    }

    @Test
    void testSimpleGraph() {
        int[][] graph = {
                {0, 1, 4, 0, 0},
                {1, 0, 4, 2, 7},
                {4, 4, 0, 3, 5},
                {0, 2, 3, 0, 4},
                {0, 7, 5, 4, 0}
        };
        int[] expected = {0, 1, 4, 3, 7};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testDisconnectedGraph() {
        int[][] graph = {
                {0, 1, 0},
                {1, 0, 0},
                {0, 0, 0}
        };
        int[] expected = {0, 1, Integer.MAX_VALUE};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testSingleNodeGraph() {
        int[][] graph = {
                {0}
        };
        int[] expected = {0};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testNegativeWeights() {
        int[][] graph = {
                {0, -1, 4},
                {-1, 0, 2},
                {4, 2, 0}
        };
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Dijkstra.shortestPath(graph, 0));
        assertEquals("Negative weights are not supported", exception.getMessage());
    }

    @Test
    void testGraphWithNoEdges() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[] expected = {0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testUnreachableNodes() {
        int[][] graph = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        int[] expected = {0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testLargeWeights() {
        int[][] graph = {
                {0, 1_000_000, 0},
                {1_000_000, 0, 2_000_000},
                {0, 2_000_000, 0}
        };
        int[] expected = {0, 1_000_000, 3_000_000};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testAllNodesVisited() {
        int[][] graph = {
                {0, 10, 20},
                {10, 0, 30},
                {20, 30, 0}
        };
        int[] expected = {0, 10, 20};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    // Các trường hợp kiểm thử bổ sung
    @Test
    void testNodeAlreadyVisited() {
        int[][] graph = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        int[] expected = {0, 1, 2};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

    @Test
    void testGraphWithDisconnectedNodes() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 1},
                {0, 1, 0}
        };
        int[] expected = {0, Integer.MAX_VALUE, Integer.MAX_VALUE};
        assertArrayEquals(expected, Dijkstra.shortestPath(graph, 0));
    }

}