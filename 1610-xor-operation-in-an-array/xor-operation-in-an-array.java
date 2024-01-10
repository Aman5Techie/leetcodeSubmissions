class Solution {
    public int xorOperation(int n, int start) {
        int num = 0;
        for(int i = 0;i<n;i++){
            num = num^start;
            start += 2;
        }
        return num;
    }
}