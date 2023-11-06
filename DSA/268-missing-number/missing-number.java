class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int totalSum=(n*n+n)/2;
        for(int i=0;i<n;i++)
        {
           sum+=nums[i];
        }
        return totalSum-sum;
    }
}