class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i=0;i<sentences.length;i++)
        {
            // System.out.println(sentences[i]);
            // System.out.print(sentences[i].length());
            String arr[]= sentences[i].split("[ ]");
            int len = arr.length;
            if(len>max)
            {
                max=len;
            }
        }

    
        // int count =0;
        // for(int j =0;j<sentences[i].length();j++)
        // {
        //     if(sentences[i].charAt(j)==' ')
        //     {
        //         count++;
        //     }
            
        // }
        // int k = count+1;
        // if(k>max)
        // {
        //     max=k;
        // }
        // // System.out.print(count);

        return max;
        }

    }
