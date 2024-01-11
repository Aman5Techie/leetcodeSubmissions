class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        for(int i = 0;i<=haystack.length()-needle.length();i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                String substring = haystack.substring(i,needle.length()+i);
                if(needle.equals(substring)){
                    return i;
                }
            }
           
        }
        return -1;
    }
}