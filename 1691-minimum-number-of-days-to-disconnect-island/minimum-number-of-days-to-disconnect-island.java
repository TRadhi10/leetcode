class Solution {
  public int minDays(int[][] grid) {
    if (isDisconnected(grid)) return 0;

    for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[0].length; ++j) {
        if (grid[i][j] == 1) {
          grid[i][j] = 0;
          if (isDisconnected(grid)) return 1;
          grid[i][j] = 1;
        }
      }
    }

    return 2;
  }

  private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

  private boolean isDisconnected(int[][] grid) {
    int islandCount = 0;
    boolean[][] visited = new boolean[grid.length][grid[0].length];

    for (int i = 0; i < grid.length; ++i) {
      for (int j = 0; j < grid[0].length; ++j) {
        if (grid[i][j] == 1 && !visited[i][j]) {
          if (++islandCount > 1) return true;
          dfs(grid, i, j, visited);
        }
      }
    }

    return islandCount != 1;
  }

  private void dfs(int[][] grid, int i, int j, boolean[][] visited) {
    visited[i][j] = true;
    for (int[] dir : directions) {
      int x = i + dir[0];
      int y = j + dir[1];
      if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 1 && !visited[x][y]) {
        dfs(grid, x, y, visited);
      }
    }
  }
}
