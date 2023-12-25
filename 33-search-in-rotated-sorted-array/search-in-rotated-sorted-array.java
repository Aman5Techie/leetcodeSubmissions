class Solution {
    public static int binarysearch(int[] nums, int low, int high, int target){
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static int index_highest(int[] nums, int low, int high){
        int index = 0;
        int current_high = nums[0];
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]>current_high){
                index = mid;
                current_high = nums[mid];
                low = mid+1;
            }else if(nums[mid] == current_high){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return index;
    }


    public int search(int[] nums, int target) {
        int higest = index_highest(nums,0,nums.length-1);
        if(higest+1 == nums.length){
            return binarysearch(nums,0,nums.length-1,target);
        }
        return Math.max(binarysearch(nums,0,higest,target), binarysearch(nums,higest+1,nums.length-1,target));
        // 
    }
}