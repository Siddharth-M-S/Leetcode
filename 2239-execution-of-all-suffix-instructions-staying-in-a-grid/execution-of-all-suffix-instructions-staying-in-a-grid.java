class Solution {
    public static int count(String s,int[] arr,int n)
    {
        System.out.println(s+" "+n+" "+arr[0]+" "+arr[1]);
        int count=0;
        for(int i =0;i<s.length();i++)
        {

            if(s.charAt(i)=='L')
            {
            
                    arr[1]=arr[1]-1;
                

            }
         else   if(s.charAt(i)=='R')
            {
           
                    arr[1]+=1;
                 
                
            }
            else if(s.charAt(i)=='U')
            {
               
                    arr[0]-=1;
                
            }
           else if(s.charAt(i)=='D')
            {
                
                    arr[0]+=1;
               
            }
            if(arr[0]>=0 && arr[0]<n && arr[1]>=0 && arr[1]<n)
            {
                count++;
            }
            else break;
        }
        return count;
    }
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int h[]=new int[2];
        
        int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            h[0]=startPos[0];
        h[1]=startPos[1];
            String k = s.substring(i);
            arr[i]=count(k,h,n);
            System.out.println(arr[i]);
        }
        return arr;

    }
}