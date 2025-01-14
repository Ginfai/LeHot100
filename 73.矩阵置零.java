class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean firstRowZero=false;
        boolean firstColumnZero=false;
        //判断第一行是否有为0的元素
        for(int i=0 ; i < n; i++){
            if(matrix[0][i] == 0){
                firstRowZero=true;
                break;
            }
        }
        //判断第一列是否有为0的元素
        for(int j=0;j<m;j++){
            if(matrix[j][0] ==0){
                firstColumnZero=true;
                break;
            }
        }
        //从第二行、第二列开始，将记录到的行列为0的元素
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        //将第一行、第一列中为0的元素取出，然后与其对应的行、列置为0
        //根据第一列将对应的行置为0
        for(int i=1;i<m;i++){
            if(matrix[i][0] == 0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }
        }
        //根据第一行将对应的列置为0
        for(int j=1;j<n;j++){
            if(matrix[0][j] == 0){
                for(int i=1;i<m;i++){
                    matrix[i][j] = 0;
                }
            }
        }
        //如果第一行或者第一列中有0，则其对应的行、列全置为0
        //先处理第一行
        if (firstRowZero) {
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }   
        }
        //再处理第一列
        if (firstColumnZero) {
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
    }
    public static void main(String[] agrs){
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        Solution s=new Solution();
        s.setZeroes(matrix);
        for(int[] row : matrix){
            for(int v : row){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}