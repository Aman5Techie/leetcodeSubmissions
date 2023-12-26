class Solution {
    public int check(int[] nums, int val){
        int hrs = 0;
        for(int i = 0;i<nums.length;i++){
            hrs += Math.ceil((double)nums[i]/(double)val);
        }
        return hrs;
        
    }

    public int minEatingSpeed(int[] piles, int h) {
      
        int high = 0;
        int numPiles = piles.length;
        long sumPiles = 0;
        for (int pile : piles) {
            high = Math.max(high,pile);
            sumPiles += pile;
        }
        int low = (int) ((sumPiles - 1) / h) + 1;
        int answer = 2000000000;

        while(low<=high){
            int mid = low+((high-low)/2);
            int hrs = check(piles,mid);

            if(hrs<=h){
                if(answer >mid ){
                    answer = mid;
                }
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return answer;
        
        
 

    }
}