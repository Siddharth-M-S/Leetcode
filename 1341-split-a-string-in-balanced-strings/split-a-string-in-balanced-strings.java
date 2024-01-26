class Solution {

    
        public int balancedStringSplit(String s) {
            int count =0;
            for(int i=0;i<s.length();i++)
            {
                int R=0;
                int L=0;
                    if(s.charAt(i)=='R')
                    {
                        R++;
                for(int j = i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='L')
                    {
                        L++;
                        if(R==L)
                        {
                            count++;
                            i=j;
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        R++;
                    }
                    
                }
                     }
                     else if(s.charAt(i)=='L')
                    {
                        L++;
                for(int j = i+1;j<s.length();j++)
                {
                    if(s.charAt(j)=='R')
                    {
                        R++;
                        if(R==L)
                        {
                            count++;
                            i=j;
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                    else{
                        L++;
                    }
                    
                }
                     }
            }
        return count;       
    }
}