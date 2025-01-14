import java.util.List;
class Solution {
    public static void rotate(int[][] matrix) {
        int n=matrix.length;
        //1.转置操作
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //2.行的翻转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
        rotate(matrix1);
        for(int[] row : matrix1){
            for(int dex : row){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}