class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int s1=s.length();
        int t2=t.length();
        if(s1<1)
            return true;

        int i=0;
        int j=0;

        while(i<t2)
        {
            if(s.charAt(j)==t.charAt(i))
            {
                j++;
            }
            i++;
            if(j==s1)
            return true;
        }
        return false;
    }
}