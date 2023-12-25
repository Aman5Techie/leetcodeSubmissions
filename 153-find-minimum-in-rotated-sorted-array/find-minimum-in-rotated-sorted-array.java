class Solution {
    public int highestindex(int[] nums, int low, int high){
        int current_high = nums[0];
        int index = 0;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] > current_high){
                current_high = nums[mid];
                index = mid;
                low = mid+1;
            }else if(nums[mid] == current_high){
                low = mid+1;
            }else{
                high = mid-1;
            }
        } 
        return nums[index+1];

    }
    public int findMin(int[] nums) {

        if(nums[0] < nums[nums.length-1] || nums.length == 1){
            return nums[0];
        }

        return highestindex(nums,0,nums.length-1);
        
    }
}