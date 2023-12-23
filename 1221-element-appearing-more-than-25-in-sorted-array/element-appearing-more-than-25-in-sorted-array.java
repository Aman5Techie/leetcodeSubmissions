class Solution {
    public int findSpecialInteger(int[] nums) {
        // int answer = 0;
        // int more_than = (nums.length*25)/100;
        // HashMap<Integer,Integer> occurence = new HashMap<Integer,Integer>();
        // for(int i = 0;i<nums.length;i++){
        //     if(occurence.containsKey(nums[i])){
        //         occurence.replace(nums[i],occurence.get(nums[i])+1);

        //          if(Integer.valueOf((int)occurence.get(nums[i]))>=more_than+1){
        //            return nums[i];
        //        }  


        //     }else{
        //         occurence.put(nums[i],1);
        //          if(Integer.valueOf((int)occurence.get(nums[i]))>=more_than+1){
        //            return nums[i];
        //        }  
                
        //     }
        // }

        
        // return answer;

        int answer  = 0;
        int desired_length = nums.length/4;
        int first = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length;i++){
            if(first == nums[i]){
                count++;
            }else{
                if(count>desired_length){
                    return first;
                }
                first = nums[i];
                count = 1;
            }
        }
        if(count>desired_length){
                    return first;
        }
        return -1;
        // return count;
        
    }
}