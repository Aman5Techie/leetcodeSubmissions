class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i = 0;
        int current_max = 0;
        int total = 0;
        while(i<colors.length()-1){
            if(colors.charAt(i) == colors.charAt(i+1)){
                int new_max = Math.max(neededTime[i] , neededTime[i+1]);
                current_max = Math.max(current_max,new_max);
         
            }else{
                current_max = Math.max(current_max,neededTime[i]);
                total += current_max;
                current_max  = neededTime[i+1];
            }
            i++;
        }
        total += current_max ;
        int sum = 0;

        for(int time : neededTime){
            sum += time;
        }
        return sum -total;
    }
}