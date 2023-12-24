class Solution {
    public int mysolution1(String s){
        int minimum_operation = 0;
        int count_10 = 0;
        int count_01 = 0;
        int count_11 = 0;
        int count_00 = 0;
        // if(s.equals("101101111")){
        //     return 4;
        // }
        for(int i = 0;i<s.length()-1;i+=2){
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
                count_01++;
            }else if(s.charAt(i) == '1' && s.charAt(i+1) == '0'){
                count_10++;
            }
            else if(s.charAt(i) == '0' && s.charAt(i+1) == '0'){
                count_00++;
            }
            else if(s.charAt(i) == '1' && s.charAt(i+1) == '1'){
                count_11++;
            }
        }

        if(count_10+count_01 == 0){
            return s.length()/2;
        }

        if(count_10*2 == s.length() || count_10*2 == s.length()){
            return 0;
        }


        if(count_10>count_01){
            for(int i = 0;i<s.length();i++){
                if(i%2==0){ 
                    if(s.charAt(i) != '1'){
                        minimum_operation++;
                    }
                }else{
                    if(s.charAt(i) != '0'){
                        minimum_operation++;
                    } 
                }
            }

        }else if(count_10<count_01){
             for(int i = 0;i<s.length();i++){
                if(i%2==0){ 
                    if(s.charAt(i) != '0'){
                        minimum_operation++;
                    }
                }else{
                    if(s.charAt(i) != '1'){
                        minimum_operation++;
                    } 
                }
            }
        }else{
            if(count_11>count_00){
                 for(int i = 0;i<s.length();i++){
                if(i%2==0){ 
                    if(s.charAt(i) != '1'){
                        minimum_operation++;
                    }
                }else{
                    if(s.charAt(i) != '0'){
                        minimum_operation++;
                    } 
                }
            }

            }else{
                for(int i = 0;i<s.length();i++){
                if(i%2==0){ 
                    if(s.charAt(i) != '0'){
                        minimum_operation++;
                    }
                }else{
                    if(s.charAt(i) != '1'){
                        minimum_operation++;
                    } 
                }
            }

            }
        }
      
       
        return minimum_operation;
    }
    public int minOperations(String s) {
        int min_operation_01 = 0;
        int min_operation_10 = 0;
        for(int i = 0;i<s.length();i++){
            if(i%2 == 0){
                if(s.charAt(i) != '0'){
                    min_operation_01++;
                }
                if(s.charAt(i) != '1'){
                    min_operation_10++;
                }
                
            }else{
                if(s.charAt(i) != '1'){
                    min_operation_01++;
                }
                if(s.charAt(i) != '0'){
                    min_operation_10++;
                }
            }
        }

        return min_operation_10>min_operation_01?min_operation_01:min_operation_10;
        
        
    }
}