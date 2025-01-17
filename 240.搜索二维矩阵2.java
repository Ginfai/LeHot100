class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        //列的数量
        int m=matrix[0].length;
        //行的数量
        int n=matrix.length;
        //起始数据
        int row=0;
        int col=m-1;
        while(row<n && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] agrs){
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        Solution s=new Solution();
        boolean found=s.searchMatrix(matrix,target);
        System.out.print(found);
    }
}