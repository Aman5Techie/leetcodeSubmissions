class Solution {
    public boolean makeEqual(String[] words) {
        int[] char_int = new int[26];
        for(String word : words){
            for(int i = 0 ;i<word.length();i++){
                int a = word.charAt(i);
                a = a-96-1;
                char_int[a] += 1;
            }
        }
        for(int i = 0;i<26;i++){
            if(char_int[i] % words.length != 0){
                return false;
            }
        }
        return true;
    }
}