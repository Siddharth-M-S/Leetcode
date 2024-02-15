class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long ans =-1;
        long sum =0;
        // if(nums.length()<3) return -1;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]<sum)
            {
                ans=nums[i]+sum;
            }
            sum+=nums[i];
        }
        return ans;
    }
}