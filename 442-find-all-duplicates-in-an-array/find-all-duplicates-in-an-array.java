class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int c = map.get(nums[i]);
                map.put(nums[i],++c);
            }
            else{
                map.put(nums[i],0);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Map.Entry m:map.entrySet())
        {
            if((int)(m.getValue())>0)
            {
                list.add((int)(m.getKey()));
            }
        }
        return list;
    }
}