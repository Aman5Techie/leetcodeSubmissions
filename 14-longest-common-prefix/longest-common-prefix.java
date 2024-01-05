class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean check = true;
        if(strs.length == 1){
            return strs[0];
        }
        int intial_length = 11000;
        String smallest = "";
        for(String s : strs){
            if(s.length()<intial_length){
                intial_length = s.length();
                smallest = s;
            }

            if(s.equals("")){
                return s;
            }
        }
        // boolean check = true;
        int last=0;

        for(int index = 0;index<intial_length;index++){
             char current_char = smallest.charAt(index);
            for(int i = 0;i<strs.length;i++){
                if(strs[i].charAt(index)!=current_char){
                    check = false;
                    break;
                }
            }

            if(check){
                last++;
            }else{
                break;
            }
        }
            
            
        
        return smallest.substring(0,last);
        
        
    }
}