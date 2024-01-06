class Solution {
    public int uniqueMorseRepresentations(String[] words) {//97
        String[]  codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        for(String word : words){
            String code = "";
            for(int i = 0 ;i<word.length();i++){
                code += codes[(word.charAt(i) - 0)-97];
            }
            set.add(code);
        }
     
        return set.size();
}
}