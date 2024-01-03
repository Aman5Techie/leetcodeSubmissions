class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> number_of_beams = new ArrayList<Integer>();
         int total_beams = 0;
         int current = 0;
        for(String lasers : bank){
            int one = 0;
            for(int i = 0;i<lasers.length();i++){
                if(lasers.charAt(i) == '1'){
                    one++;
                }
            }
            if(one!=0){
                total_beams += current*one;
                current = one;
            number_of_beams.add(one);
            }
        }
       
        // for(int i = 0;i<number_of_beams.size()-1;i++){
        //     total_beams += number_of_beams.get(i)*number_of_beams.get(i+1);
        // }
      
        return total_beams;
    }
}