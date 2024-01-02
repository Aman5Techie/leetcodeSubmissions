class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
         List<List<Integer>> answer = new ArrayList<List<Integer>>();
        // List<Integer> index = new ArrayList<Integer>();
        HashMap<Integer,Boolean> index_used = new HashMap<Integer,Boolean>();
        int check_all = 0;
        int index = 0;
        while(check_all!=nums.length){
            HashMap<Integer,Boolean> numbers = new HashMap<Integer,Boolean>();
            List<Integer> list_of_number = new ArrayList<Integer>();
            for(int i = 0;i<nums.length;i++){
                if(numbers.containsKey(nums[i])){

                }else if(!index_used.containsKey(i)){
                    numbers.put(nums[i],true);
                    list_of_number.add(nums[i]);
                    index_used.put(i,true);
                    check_all++;
                }
            }
            answer.add(list_of_number);
        }



            return answer;
    }
}