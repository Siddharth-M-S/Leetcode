class Solution {
    public String restoreString(String s, int[] indices) {
        Character arr[]=new Character [indices.length];
        String res = "";
        for(int i=0;i<indices.length;i++)
        {
            arr[indices[i]]=s.charAt(i);
            
            

        }
        for(Character k : arr)
        {
            res+=(Character.toString(k));
        }
        return res;
        // System.out.print(arr[0]);
        // return "hi";
        
    }
}