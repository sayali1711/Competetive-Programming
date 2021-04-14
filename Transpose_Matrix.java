/*Where,
r=number of rows
c=number of colums

when r!=c we have to create a new matrix of size [c][r] because,
if before transpose there are 2 rows and 3 columns after transpose there will be 3 rows and 2 columns

when r==c we can simply use swap logic to swap matrix[0][1] with matrix[1][0] and so on.

Note(when r==c):-while traversing consider only upper triangular matrix as already elements with lower triangular are swapped with the ones in upper triangular matrix 
to save time.*/


class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int temp;
        if(r==c)
        {
            for(int i=0;i<r-1;i++)
        {
            for(int j=i;j<c;j++)
            {
                if(i!=j)
                {
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
            return matrix;
        }
        else
        {
            int[][] ans= new int[c][r];
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    ans[j][i]=matrix[i][j];
                }
            }
       return ans;
        }
        
    }
}
