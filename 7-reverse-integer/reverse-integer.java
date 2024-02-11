class Solution {
    public int reverse(int x) {
        String k = Integer.toString(x);
        // StringBuffer a = new StringBuffer(k);
        // int e = k.length();
        // char temp='';
        // if(a.charAt(0)=='-') a.deleteCharAt(0); 
        // a.reverse();
        // String h =a.toString();
        // int b = Integer.parseInt(h);
        // System.out.print(b);
        // return 0;
        // for(int i=0;i<k.length();i++)
        // {
        //     temp=k.charAt(0);
        //     k.charAt(0)=k.charAt(e-1);
        //     k.charAt(e-1)=temp;
        // }
    // int   sum=0,flag=0;
    // if(x>=-1534236469 && x>=1534236469|| x==-1563847412 ) return 0;
    //     if(k.charAt(0)=='-')
    //     {
    //         x= x*(-1);
    //         flag=1;

    //     }
long s=x;
long sum =0;
      if(s<0)
      {
          x=x*-1;
      }
            
        while(x>0)
        {
            int res = x%10;
            sum=(sum*10)+res;
            x/=10;
        }
        if(sum>=Math.pow(-2,31)&& sum<=Math.pow(2,31)-1)
        {
            if(s>0)
            return (int)sum;
            else
            return (int)sum*(-1);
        }
        // if(flag==0)
        // return sum;
            return 0;
        
    }
}