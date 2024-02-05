class Solution {
    public int firstUniqChar(String s) {
        
    Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
    // int c =0;
    for(int i =0;i<s.length();i++)
    {
        if(map.containsKey(s.charAt(i)))
        {
            // // c=map.get()
            
             int  c = map.get(s.charAt(i));
            c++;
            map.put(s.charAt(i),c);
        }
        else{
          map.put(s.charAt(i),0);
        }

    }
    for(Map.Entry m: map.entrySet())
    {
       if((int)m.getValue()==0)
       {
           return (s.indexOf((char)m.getKey()));
       }
    }
    return -1;
}
}