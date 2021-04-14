/*we have to find the missing number from range[0,n]

To find out n, we can use nums.size() which will give us the number of elements in vector nums
eg:- suppose we have nums = [1,3,0,4,2]
firstly we will calculate sum1 which we will be the sum of numbers in vector nums. i.e 1+3+0+4+2=10 (so I have used accumulate function())
then we will calculate sum2 from 0 to n here n is 5(total number of elements) i.e
0+1+2+3+4+5=15 ( so I have used a*(a+1)/2 i.e sum of n numbers formula)
so missing number will be (sum2-sum1)=15-10=5
*/

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int a=nums.size();
        int sum1=accumulate(nums.begin(),nums.end(),0);
        int sum2=a*(a+1)/2;
        return sum2-sum1;
    }
};
