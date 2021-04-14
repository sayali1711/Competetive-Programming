//Given an m x n matrix, return all elements of the matrix in spiral order.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int b=m-1,t=0,l=0,r=n-1;
        int dir=0;
        List<Integer> ans = new ArrayList<>();
        while(t<=b && l<=r)
        {
            if(dir==0)
            {
                for(int i=l;i<=r;i++)
                {
                   ans.add(matrix[t][i]) ;
                }
                dir=1;
                t++;
            }
            else if(dir==1)
            {
                for(int i=t;i<=b;i++)
                {
                    ans.add(matrix[i][r]);
                }
                dir=2;
                r--;
            }
            else if(dir==2)
            {
                for(int i=r;i>=l;i--)
                {
                    ans.add(matrix[b][i]);
                }
                dir=3;
                b--;
            }
            else if(dir==3)
            {
                for(int i=b;i>=t;i--)
                {
                    ans.add(matrix[i][l]);
                }
                dir=0;
                l++;
                
            }
        
        }
        return ans;
        
    }
}
