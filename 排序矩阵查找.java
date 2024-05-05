class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for (int[] row : matrix) {
            for (int m : row) {
                if (m == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
