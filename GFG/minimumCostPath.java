package GFG;


import java.util.Arrays;
import java.util.PriorityQueue;

public class minimumCostPath {

    static class Cell implements Comparable<Cell> {
        int x, y, cost;

        public Cell(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Cell other) {
            return this.cost - other.cost;
        }
    }

    private static final int[] row = {-1, 0, 1, 0}; // Up, Left, Down, Right movements
    private static final int[] col = {0, -1, 0, 1};

    public int minimumCostPath(int[][] grid) {
        int n = grid.length;

        // Distance array to store minimum cost to reach each cell
        int[][] dist = new int[n][n];

        // Initialize all distances to infinity
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        // Min-heap to store the cells by minimum cost
        PriorityQueue<Cell> pq = new PriorityQueue<>();

        // Start from the top-left cell
        dist[0][0] = grid[0][0];
        pq.add(new Cell(0, 0, grid[0][0]));

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();

            int x = curr.x;
            int y = curr.y;
            int currCost = curr.cost;

            // If we've reached the bottom-right cell, return the cost
            if (x == n - 1 && y == n - 1) {
                return currCost;
            }

            // Explore all 4 possible movements from the current cell
            for (int i = 0; i < 4; i++) {
                int newX = x + row[i];
                int newY = y + col[i];

                // Check if the new position is within bounds
                if (isValid(newX, newY, n)) {
                    int newCost = currCost + grid[newX][newY];

                    // If a shorter path to the neighbor is found
                    if (newCost < dist[newX][newY]) {
                        dist[newX][newY] = newCost;
                        pq.add(new Cell(newX, newY, newCost));
                    }
                }
            }
        }

        // In case we don't find a path (shouldn't happen in this problem)
        return -1;
    }

    private boolean isValid(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        minimumCostPath sol = new minimumCostPath();
        int[][] grid = {
                {9, 4, 9, 9},
                {6, 7, 6, 4},
                {8, 3, 3, 7},
                {7, 4, 9, 10}
        };
        System.out.println(sol.minimumCostPath(grid)); // Output: 43
    }
}
