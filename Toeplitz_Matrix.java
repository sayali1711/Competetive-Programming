class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int flag=1;
        for(int i=0;i<m-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(matrix[i][j]==matrix[i+1][j+1])
                {
                    flag=1;
                }
                else
                {
                    flag=0;
                    return false;
                }
            }
        }
        if(flag==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
