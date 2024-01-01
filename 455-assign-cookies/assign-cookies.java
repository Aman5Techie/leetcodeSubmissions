class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int child_point = 0;
        for(int i = 0;i<s.length;i++){
            if( ans != g.length && s[i] >= g[child_point]){
                child_point += 1;
                ans++;
            }
            
        }
        return ans;
    }
}