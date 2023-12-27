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
         double val = (double)m*k;
        if(val>bloomDay.length){
            return -1;
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int i : bloomDay){
            set.add(i);
        }
        TreeSet sort_tree = new TreeSet(set);
        List<Integer> arr = new ArrayList<>(sort_tree);

        int minimum_days = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.size() -1;
        while(low<=high){
            int mid = (low+((high-low)/2));
            int value = arr.get(mid);
            boolean checked_value = check(bloomDay,m,k,value);
            if(checked_value){
                minimum_days = Math.min(minimum_days,value);
                high = mid-1;
            }else{
                low = mid+1;

            }
        }
        // if()

        return minimum_days;
    }
}