//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.
class Solution {
    public int[][] generateMatrix(int n) {
       
        int b=n-1,t=0,l=0,r=n-1;
        int dir=0,cnt=1;
        int[][] ans = new int[n][n];
        while(t<=b && l<=r)
        {
            if(dir==0)
            {
                for(int i=l;i<=r;i++)
                {
                   ans[t][i]=cnt ;
                    cnt++;
                }
                dir=1;
                t++;
            }
            else if(dir==1)
            {
                for(int i=t;i<=b;i++)
                {
                    ans[i][r]=cnt++;
                }
                dir=2;
                r--;
            }
            else if(dir==2)
            {
                for(int i=r;i>=l;i--)
                {
                    ans[b][i]=cnt++;
                }
                dir=3;
                b--;
            }
            else if(dir==3)
            {
                for(int i=b;i>=t;i--)
                {
                    ans[i][l]=cnt++;
                }
                dir=0;
                l++;
                
            }
        
        }
        return ans;
        
    }
}
