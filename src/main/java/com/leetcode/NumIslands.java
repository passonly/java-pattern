package com.leetcode;

public class NumIslands {
  public static void main(String[] args) {

    char arr[][] = {{'1','0','1','1'},{'1','1','0','0'},{'1','0','0','1'}};
    int i = numIslands(arr);
    System.out.println(i);

  }

  static void dfs(char[][] grid, int r, int c) {
    int nr = grid.length;
    int nc = grid[0].length;
    // 判断 base case
    if (!inArea(grid, r, c)) {
      return;
    }

    if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
      return;
    }

    grid[r][c] = '0';
    dfs(grid, r - 1, c);
    dfs(grid, r + 1, c);
    dfs(grid, r, c - 1);
    dfs(grid, r, c + 1);
  }

  public static int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int nr = grid.length;
    int nc = grid[0].length;
    int num_islands = 0;
    for (int r = 0; r < nr; r++) {
      System.out.println(grid[r]);
      for (int c = 0; c < nc; c++) {
        if (grid[r][c] == '1') {
          dfs(grid, r, c);
          num_islands++;
        }
      }
    }

    return num_islands;
  }
  // 判断坐标 (r, c) 是否在网格中
  static boolean  inArea(char[][] grid, int r, int c) {
    return 0 <= r && r < grid.length
        && 0 <= c && c < grid[0].length;
  }


}
