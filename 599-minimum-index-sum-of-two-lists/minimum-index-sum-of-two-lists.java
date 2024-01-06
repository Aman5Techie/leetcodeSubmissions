class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        if(list1.length>list2.length){
            return find(getMap(list1),list2);
        }

        return find(getMap(list2),list1);    
    }

    public HashMap<String,Integer> getMap(String[] list){
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0;i<list.length;i++){
            map.put(list[i],i);
        }
        return map;
    }

    public String[] find(HashMap<String,Integer> map , String[] list ){
        List<Integer> same = new ArrayList<Integer>();
        int index_sum = Integer.MAX_VALUE;
        for(int i = 0;i<list.length;i++){
            if(map.containsKey(list[i])){
               int val =  map.get(list[i])+i;
                if(val<index_sum){
                    index_sum = val;
                    same = new ArrayList<Integer>();
                    same.add(i);
                }else if(val == index_sum){
                    same.add(i);
                }
            }
        }
        String[] resturant = new String[same.size()];
        for(int i = 0;i<same.size();i++){
            resturant[i] = list[same.get(i)];
        }
        return resturant;
        
    }
    
}