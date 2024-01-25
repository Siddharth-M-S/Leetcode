class Solution {
    public String interpret(String command) {
        String k="";
        for(int i =0;i<command.length();i++)
        {
            if(command.charAt(i)=='G')
            {
                k+="G";
            }
            else if(command.charAt(i)=='(')
            {
                i++;
                if(command.charAt(i)==')')
                k+="o";
                else
                k+="al";
            }
        
        }
        return k;
    }
}