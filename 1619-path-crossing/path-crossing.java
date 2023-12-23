class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        List<List<Integer>> coordinate = new ArrayList<>();
        List<Integer> current_cor = new ArrayList<>();
        current_cor.add(0);
        current_cor.add(0);
        coordinate.add(current_cor);
        

        for(int i =0 ;i<path.length();i++){
            if(path.charAt(i) == 'N'){
                x++;
                
            }else if(path.charAt(i) == 'S'){
                x--;
               
            }else if(path.charAt(i) == 'E'){
                y++;
                
            }else if(path.charAt(i) == 'W'){
                y--;

            }
            current_cor = new ArrayList<>();
            current_cor.add(x);
            current_cor.add(y);
            if(coordinate.contains(current_cor)){
                
                return true;
            }else{
            coordinate.add(current_cor);

            }
        }
        
        return false;
    }
}