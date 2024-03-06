class Solution {
    public String reverseVowels(String s) {
        List<Character>chr=new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' ||a=='A' ||a=='E' ||a=='I' ||a=='O' ||a=='U')
            {
                chr.add(a);
            }
        }
        StringBuilder sb=new StringBuilder();
        int j=chr.size()-1;
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' ||a=='A' ||a=='E' ||a=='I' ||a=='O' ||a=='U')
            {
                 sb.append(chr.get(j));
                j--;
            }else{
                sb.append(a);
            }
        }
        return sb.toString();
    }
}