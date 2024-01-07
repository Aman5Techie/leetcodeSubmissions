class Solution {
    public int titleToNumber(String columnTitle) {
        int answer = 0;
        int index = 1;
        answer += (columnTitle.charAt(columnTitle.length()-1) - 'A')+ 1;
        for(int i = columnTitle.length()-2;i>=0;i--){
            answer += Math.pow(26,index)*((columnTitle.charAt(i) - 'A')+ 1);
            index++;
        }   

        return answer;
    }
}