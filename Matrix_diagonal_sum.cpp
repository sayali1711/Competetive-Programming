class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0;
        for(int i=0;i<mat.size();i++)
        {
            for(int j=0;j<mat[0].size();j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j];
                }
                
            }
        }
        for(int j=0;j<mat.size();j++)
        {
            int k=mat[0].size()-1-j;
            if(j!=k)
            {
                sum+=mat[j][k];
            }
                
            
        }
    return sum;
    }
};
