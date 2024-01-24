class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int k =0;
        for(int i =0;i<operations.length;i++)
        {
            if(operations[i].equals("X++"))
            {
                k++;
            }
            else if(operations[i].equals("X--"))
            {
                k--;
            }
            else if(operations[i].equals("++X"))
            {
                ++k;
            }
            else{
                --k;
            }
        }

return k;
    }
}