class Solution {
    public void rotate(int[] arr, int k) 
    {
        if(k>arr.length)
        {
            k=k%arr.length;
            System.out.println("k is "+k);
        }

        int nums []=new int [arr.length];

        for(int i=0;i<k;i++)
        {
            nums[i]=arr[arr.length-k+i];
        }

        int j=0;
        for(int i=k ;i<arr.length;i++)
        {
            nums[i]=arr[j];
            j++;
        }

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=nums[i];
        }

    }
}