class Solution {
    public int uniqueMorseRepresentations(String[] words) {//97
        String[]  codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        // Set<String> set = new HashSet<String>();
        HashMap<String,Boolean> set = new   HashMap<String,Boolean>();
        for(String word : words){
            String code = "";
            for(int i = 0 ;i<word.length();i++){
                code += codes[(word.charAt(i) - 0)-97];
            }
            if(!set.containsKey(code)){

            set.put(code,true);
            }
        }
     
        return set.size();
}
}