class Solution {
    public int majorityElement(int[] nums) {
        int count =0,max=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j = i;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                k=nums[i];

            }
            count=0;
        }
        return k;
    }
}