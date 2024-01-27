class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=new char [indices.length];
        String res = "";
        for(int i=0;i<indices.length;i++)
        {
            arr[indices[i]]=s.charAt(i);
            
            

        }
        // for(Character k : arr)
        // {
        //     res+=(Character.toString(k));
        // }
        // return res;
        return new String(arr);
        // System.out.print(arr[0]);
        // return "hi";
        
    }
}