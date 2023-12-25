class Solution {
    public int findPeakElement(int[] nums) {
        int low = 1;
        int high = nums.length - 1-1;
        if(nums.length == 1){
            return 0;
        }
        if(nums.length ==2){
            return nums[0]>nums[1]?0:1;
        }
        while(low<=high){
            if(nums[low-1] < nums[low] && nums[low] > nums[low+1]){
                return low;
            }else{
                low += 1;

            }
            if(nums[high+1] < nums[high] && nums[high] > nums[high-1]){
                return high;
            }else{
                high -= 1;

            }
        }
        return nums[0] > nums[nums.length-1]?0:nums.length-1;
        
    }
}