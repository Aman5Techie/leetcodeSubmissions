class Solution {
    public boolean check(int[] arr, int m, int k, int val){
        int current = 0;
        int maked = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=val){
                current++;
            }else{
                current = 0;
            }

            if(current==k){
                maked++;
                current = 0;
            }
            if(maked == m){
                return true;
            }
        }
        if(maked == m){
                return true;
        }
        return false;

    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low =Integer.MAX_VALUE;
        int high =  Integer.MIN_VALUE;
        System.out.print(bloomDay.length);
        double val = (double)m*k;
        if(val>bloomDay.length){
            return -1;
        }
        for(int i : bloomDay){
            low = Math.min(low,i);
            high = Math.max(high,i);

        }

        int minimum_days = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+(high-low)/2);
            boolean checked_value = check(bloomDay,m,k,mid);
            if(checked_value){
                minimum_days = Math.min(minimum_days,mid);
                high = mid-1;
            }else{
                low = mid+1;

            }
        }

        return minimum_days;
    }
}