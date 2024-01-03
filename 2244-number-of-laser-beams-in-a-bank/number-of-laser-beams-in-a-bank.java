class Solution {
    public int numberOfBeams(String[] bank) {
        int previous = 0;
        int total = 0;
        for(String s : bank){
            int numbers = one(s);
            if(numbers==0){
                continue;
            }
            total += previous*numbers;
            previous = numbers;
        }
        return total;

    }

    public int one(String s){
        int one = 0;
        for(char c : s.toCharArray()){
            one += c -'0';
        }
        return one;
    }
  
}
