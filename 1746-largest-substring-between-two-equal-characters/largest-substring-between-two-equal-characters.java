class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character,Integer> check = new HashMap<Character,Integer>();
        HashMap<Character,List<Integer>> double_map = new HashMap<Character,List<Integer>>();
        for(int i = 0;i<s.length();i++){
            if(check.containsKey(s.charAt(i))){
                List<Integer> x = new ArrayList<Integer>();
                if(double_map.containsKey(s.charAt(i))){
                     x.add(check.get(s.charAt(i)));
                     x.add(i);
                     double_map.replace(s.charAt(i) ,x );
                }else{
                    x.add(check.get(s.charAt(i)));
                    x.add(i);
                    double_map.put(s.charAt(i) ,x);
                }

            }else{
                check.put(s.charAt(i),i);
            }
        }
        if(double_map.isEmpty()){
            return -1;
        }
        int max_diff = 0;
        for(List<Integer> x : double_map.values()){
            max_diff = Math.max(max_diff, (x.get(1) - x.get(0)) -1);
        }
        
        return max_diff;
    }
}