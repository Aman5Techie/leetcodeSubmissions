class Solution {
    public int get_divisor(int[] nums, int divisor){
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] % divisor == 0){
                ans += (nums[i]/divisor);
            }else{
            ans += ((nums[i]/divisor) + 1);
            }
        }
        return ans;
    }

     public int Max(int[] nums){
         int max = 0;
         for(int i : nums){
             max = Math.max(i,max);
         }
         return max;
     }
    
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Max(nums);
        int ans = Integer.MAX_VALUE ;

        while(low<=high){
            int mid = low+((high-low)/2);
            int divided_val = get_divisor(nums,mid);
            if(divided_val<=threshold){
                ans = Math.min(ans,mid);
                high = mid -1;
            }else{
                low = mid+1;
            }

        }
        
        return ans;
    }
}