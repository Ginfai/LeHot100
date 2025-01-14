import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1; // 上下边界
        int left = 0, right = matrix[0].length - 1; // 左右边界

        while (top <= bottom && left <= right) {
            // 从左到右遍历上边界
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // 上边界下移

            // 从上到下遍历右边界
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // 右边界左移

            // 如果还有行未遍历，从右到左遍历下边界
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // 下边界上移
            }

            // 如果还有列未遍历，从下到上遍历左边界
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // 左边界右移
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println("螺旋顺序遍历结果: " + result);
    }
}