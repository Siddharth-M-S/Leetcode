class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int j =0;
        if(words.size()!= s.length()) return false;
        for(int i=0;i<words.size();i++)
        {
            String   k = (words.get(i));
            // System.out.println(k);
            // for(int j=0;j<s.length();j++)
            // {
                if(k.charAt(0)!=s.charAt(j))
                {
                    System.out.print(k.charAt(0));
                    return false;
                }
            j++;
            // }
        }
        return true;
    }
}