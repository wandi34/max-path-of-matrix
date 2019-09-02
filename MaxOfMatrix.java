public class MaxOfMatrix {

  public static void main(String[] args) {
    System.out.println(maxPathR(testData));
  }

  public static int maxPathR(int[][] a) {
    int best = 0;
    for (int row = 0; row < a.length; row++) {
      best = Math.max(best, recurse(a, row, 0));
    }
    return best;
  }

  private static int recurse(int[][] a, int row, int col) {
    int n = a.length;
    int best = 0;
    for (int r = row - 1; r <= row + 1; r++) {
      if (r < 0) continue;
      if (col == n-1) return a[r][col];
      if (r >= n) break;
      best = Math.max(best, a[row][col] + recurse(a, r, col + 1));
    }
    if (col == 0) {
    	System.out.println(best);
    }
    return best;
  }

  private static int[][] testData =
      {
          {2, 2, 4, 1},
          {1, 3, 1, 5},
          {5, 0, 2, 3},
          {0, 6, 1, 2}
      };
}





