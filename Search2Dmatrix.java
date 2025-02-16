public class Search2Dmatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            int midElement = matrix[row][col];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                { 1,  3,  5,  7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target1 = 3;
        System.out.println("Target Found: " + searchMatrix(matrix1, target1));

    }
}
