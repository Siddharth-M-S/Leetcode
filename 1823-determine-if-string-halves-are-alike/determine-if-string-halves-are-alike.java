class Solution {
    public static int vowel(String k)
    {
        int count =0;
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i)=='a'|| k.charAt(i)=='e' ||  k.charAt(i)=='o' || k.charAt(i)=='u' || k.charAt(i)=='i' || k.charAt(i)=='A' || k.charAt(i)=='E' || k.charAt(i)=='I' || k.charAt(i)=='O' || k.charAt(i)=='U')
            {
                count++;
            }
            
        }
        return count;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int l = n/2;
        String g = s.substring(0,l);
        String g1 = s.substring(l,n);
        System.out.print(g+" "+g1);
        int s1 = vowel(g);
        int s2 = vowel(g1);
        if(s1==s2)
        return true;
        else
        return false;
    }
}