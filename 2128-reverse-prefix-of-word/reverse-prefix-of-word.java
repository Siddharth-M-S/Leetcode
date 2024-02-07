class Solution {
    public String reversePrefix(String word, char ch) {
     int a = word.indexOf(ch);
     System.out.print(a);
     String k = word.substring(a+1) ;
     String v="";
     for(int i =a;i>=0;i--)
     {
         String g = Character.toString(word.charAt(i));
         v+=g;
     }  
     System.out.print(k);
     return v+k;
    }
}