class Solution {
    public int rangeBitwiseAnd(int left, int right) {
          int rightShiftCnt = 0;
          while(left != right){
              left = left >> 1;
              System.out.println(left);
              right = right >> 1;
              System.out.println(right);
              rightShiftCnt++;
          }
          int commonPref = (right << rightShiftCnt);
          return commonPref;
    }
}