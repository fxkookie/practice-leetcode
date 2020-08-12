class Solution {
    List<Integer> cache1;
    List<Integer> cache2;
    int turn = 0;
    public List<Integer> getRow(int rowIndex) {
        cache1 = new ArrayList<Integer>();
        cache2 = new ArrayList<Integer>();
        for(int j = 0;j<rowIndex+1;j++){
            pascal(j);
        }
        if(turn == 0){
            return cache2;
        }
        else{
            return cache1;
        }
    }
    public void pascal(int k){
        if(turn == 0){
            if(k == 0){
                cache1.add(1);
            }
            else{
                for(int i = 0;i<cache2.size()+1;i++){
                    if(i == 0 || i == cache2.size()){
                        cache1.add(1);
                    }
                    else{
                        cache1.add( (int)cache2.get(i-1) + (int)cache2.get(i) );
                    }
                }
            }
            cache2.clear();
            turn = 1;
        }
        else{
            for(int i = 0;i<cache1.size()+1;i++){
                if(i == 0 || i == cache1.size()){
                    cache2.add(1);
                }
                else{
                    cache2.add( (int)cache1.get(i-1) + (int)cache1.get(i) );
                }
            }
            cache1.clear();
            turn = 0;
        }
    }
}
