class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
   
     int i=nums1.size()-n;
     while(i!=nums1.size())
     {
         for(int j=0;j<nums2.size();j++)
         {
             nums1[i]=nums2[j];
             i++;
         }
     }
     sort(nums1.begin(),nums1.end()); 
    }    
};
