class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int n=arr.length;
        int count=0;
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            Max=Math.max(Max,count);
        }
        return Max;
    }
}