class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        String rulKey= ruleKey;
        String rulValue= ruleValue;
        for(int i =0;i<items.size();i++)
        {
            if(rulKey.equals("type")){
            if(items.get(i).get(0).equals(rulValue))
             count++;
            }
             else if(rulKey.equals("color"))
             {
            if(items.get(i).get(1).equals(rulValue)) count++;

             }
            else if(rulKey.equals("name"))
            if(items.get(i).get(2).equals(rulValue)) count++;
        }
        return count;
    }
}