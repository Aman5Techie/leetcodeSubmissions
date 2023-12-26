class Solution {
    public int check(int[] nums, int val){
        int hrs = 0;
        for(int i = 0;i<nums.length;i++){
            hrs += Math.ceil((double)nums[i]/(double)val);
        }
        return hrs;
        
    }

    public int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            max= Math.max(max,nums[i]);
        }
        return max;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = max(piles);
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