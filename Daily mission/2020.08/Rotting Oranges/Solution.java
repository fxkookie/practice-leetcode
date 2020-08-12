class Solution {
    int[][] map;
    int[][] next;
    int row;
    int col;
    public int orangesRotting(int[][] grid) {
        map = grid;
        row = map.length;
        col = map[0].length;
        int count = 0;
        next = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                next[i][j] = map[i][j];
            }
        }
        while(true){
            if(!round()){
                break;
            }
            System.out.printf("\n ++");
            count++;
        }
        if(check() == 1){
            return -1;
        }
        else{
            return count;
        }
    }
    public void copy(){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                map[i][j] = next[i][j];
            }
        }
    }
    public boolean round(){
        boolean pollution = false;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(map[i][j] == 2){
                    boolean res = decay(i,j);
                    if(pollution == false && res == true){
                        pollution = true;
                    }
                }
            }
        }
        copy();
        return pollution;
    }
    public int check(){
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(map[i][j] == 1){
                    return 1;
                }
            }
        }
        return 0;
    }
    public boolean decay(int x,int y){
        boolean pollution = false;
        if(x-1>=0){
            if(map[x-1][y] == 1){
                pollution = true;
                next[x-1][y] = 2;
            }
        }
        if(x+1<row){
            if(map[x+1][y] == 1){
                pollution = true;
                next[x+1][y] = 2;
            }
        }
        if(y-1>=0){
            if(map[x][y-1] == 1){
                pollution = true;
                next[x][y-1] = 2;
            }
        }
        if(y+1<col){
            if(map[x][y+1] == 1){
                pollution = true;
                next[x][y+1] = 2;
            }
        }
        return pollution;
    }
}
