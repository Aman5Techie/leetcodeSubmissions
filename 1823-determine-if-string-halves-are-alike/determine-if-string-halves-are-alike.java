class Solution {
    public int vowels(String s){
        s = s.toLowerCase();
        int vowel = 0;
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low) == 'a' ||s.charAt(low) == 'e' ||s.charAt(low) == 'i' ||s.charAt(low) == 'o' ||s.charAt(low) == 'u'){
                vowel++;
            }
            if(s.charAt(high) == 'a' ||s.charAt(high) == 'e' ||s.charAt(high) == 'i' ||s.charAt(high) == 'o' ||s.charAt(high) == 'u' ){
                vowel++;
            }

            low++;
            high--;

        }
        if(s.length()%2!=0){
            high = s.length()/2;
            if(s.charAt(high) == 'a' ||s.charAt(high) == 'e' ||s.charAt(high) == 'i' ||s.charAt(high) == 'o' ||s.charAt(high) == 'u' ){
                vowel++;
            }


        }

        return vowel;
        
        
    }
    public boolean halvesAreAlike(String s) {
       if(vowels(s.substring(0,s.length()/2))== vowels(s.substring(s.length()/2,s.length()))){
           return true;
       }
       return false;
    }

    
}