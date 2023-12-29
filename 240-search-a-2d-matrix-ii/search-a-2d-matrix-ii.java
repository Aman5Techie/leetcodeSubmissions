class Solution {
    public boolean binarySearch(int[] matrix, int target){
        int low = 0;
        int high = matrix.length -1 ;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid]==target){
                return true;
            }else if(matrix[mid] > target){
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        int index= matrix.length -1;
        for(int i =0;i<matrix.length;i++){
            if(matrix[i][matrix[i].length-1] >= target){
                boolean row = binarySearch(matrix[i],target);
                if(row==true){
                    return true;
                }
            }

        }
        return false;

        
    }
}