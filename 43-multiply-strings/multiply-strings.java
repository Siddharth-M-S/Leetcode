import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        
        // long k = Long.parseLong(num1);
        // long l = Long.parseLong(num2);
        BigInteger  kk = new BigInteger(num1);
        BigInteger  kkk = new BigInteger(num2);
       // String y = Long.toString(s);
       BigInteger result= kk.multiply(kkk);
              System.out.print(kk+" "+kkk);
       return result.toString();
        // return num1;
    }
}