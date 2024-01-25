class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String k = Character.toString(x);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++)
        {
                if(words[i].contains(k))
                {
                    list.add(i);
                }
        }
        return list;  
         }
}