class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List <Integer> l = new ArrayList<>(map.values());
        Collections.sort(l);
        System.out.println(l);
        int size = map.size();
        for(int n : l){
            if(n <= k){
                size --;
                k-=n;
            }
            else{
                break;
            }
        }
        return size;
    }
}