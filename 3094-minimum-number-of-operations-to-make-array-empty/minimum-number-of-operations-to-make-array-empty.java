class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> count_value = new HashMap<Integer,Integer>();
        for(int i : nums){
            if(count_value.containsKey(i)){
                count_value.replace(i,count_value.get(i) +1);
            }else{
                count_value.put(i,1);
            }
        }
        int total_operation = 0;
        for(int i : count_value.values()){
            if(i==1){
                return -1;
            }
            if(i%3==0){
                total_operation += i/3;
            }else{
                total_operation += operations(i);

            }

        }
        return total_operation;
    }
    public int operations(int n){
        int operation = 0;
        while(n%3!=0){
            n = n-2;
            operation++;
        }
        operation += n/3;
        return operation;
    }
}
