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
         
        // if()
          int left = 1;
        int right = 1000000001;
        if (m * k > bloomDay.length) {
            return -1;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            boolean possible = check( bloomDay, m, k,mid);
            if (possible) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left <= 1000000000) {
            return left;
        }
        return -1;


    }
}