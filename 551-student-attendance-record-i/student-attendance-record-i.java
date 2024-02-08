class Solution {
    public boolean checkRecord(String s) {
        int a =0;
        if(s.length()==2){
        if(s.charAt(s.length()-1)=='A' )
        {
            a++;
        }
        if(s.charAt(s.length()-2)=='A')
        {
            a++;
        }
        }
        if((a>=2)) return false;
        for(int i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)=='L')
            {
                if(s.charAt(i+1)=='L')
                {
                if(s.charAt(i+2)=='L')
                {
                    return false;
                }
                }
            }
            else if(s.charAt(i)=='A')
            {
                a++;
            }
        }
        
         if((a>=2)) return false;
        return true;
    }
}