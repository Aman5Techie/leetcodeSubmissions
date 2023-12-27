class Solution {
    public int allowed_weight(int[] arr,int givensum){
        int currentday= 0;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            // if(sum + arr[i] > givensum){
            //     currentday++;
            //     sum = arr[i];
            // }else{
            //     sum += arr[i];

            // }
          
            sum += arr[i];
           if(sum==givensum){
               currentday++;
               sum = 0;
           }else if(sum>givensum){
               currentday++;
               sum = 0;
               sum += arr[i];
           }
         
        }
        if(sum != 0){
            currentday++;
        }
        return currentday;
    }
    public int shipWithinDays(int[] weights, int days) {
        if(weights.length == days){
            int max = 0;
           for(int i : weights){
           max = Math.max(i,max);
            }
            return max;
        }
         int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i : weights){
            high += i;
            low = Math.max(low,i);
        }

       
        int answer = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low) + (high-low)/2;
            int value = allowed_weight(weights,mid);
            if(value<=days){
                answer = Math.min(answer,mid);
                high  = mid -1;
            }else{
                low = mid+1;
            }
        }

        return  answer;
        
    }
}