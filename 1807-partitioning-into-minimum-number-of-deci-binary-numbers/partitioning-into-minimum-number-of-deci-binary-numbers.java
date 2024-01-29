class Solution {
    public int minPartitions(String n) {
        int max = -1;
        char[] c = n.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if( c[i]-'0'==9) return 9;
            
                max = Math.max(c[i]-'0',max);
        }
        return max;
    }
}