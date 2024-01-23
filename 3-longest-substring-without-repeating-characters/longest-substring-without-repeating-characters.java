class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end =0;
        Set<Character> set = new HashSet<Character>();
            // (set.add(s.charAt(start)));
            int max = 0;
            while(end < s.length())
            {
                char y = s.charAt(end);
                while(set.contains(y))
                {
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(y);
              
                int size = end-start+1;
                if(size > max)
                {
                    max=size;
                }
                  end+=1;

            }
            return max;
       
    }
}