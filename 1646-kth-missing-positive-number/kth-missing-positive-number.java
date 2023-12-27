class Solution {
    public boolean binarysearch(int[] arr, int num){
        int low = 0;
        int high = arr.length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == num){
                return true;
            }
            else if(arr[mid] > num){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
        for(int i = 1;i<=2000;i++){
            if(!binarysearch(arr,i)){
                k--;
            }
            if(k==0){
                return i;
            }

        }
        return -1;
    }
}