class Solution {
    int ans = 0;
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int zeroCount = 0;
        int m = grid[0].length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0){
                    zeroCount++;
                }
            }
        }
        for(int q = 0;q<n;q++){
            for(int w = 0;w<m;w++){
                if(grid[q][w] == 1){
                    dfs(grid,q,w,0,zeroCount);
                }
            }
        }
        return ans;
    }
    public void dfs(int[][] grid,int x,int y,int count,int max){
        if(grid[x][y] == 2 && count == max){
            ans++;
        }
        int pre = grid[x][y];
        if(pre == 0){
            count++;
        }
        grid[x][y] = -1;
        for(int i = 0;i<4;i++){
            int nx = x;
            int ny = y;
            if(i == 0){
                nx += 1;
                if(nx == grid.length || grid[nx][ny] == -1){
                    continue;
                }
            }
            else if(i == 1){
                nx -= 1;
                if(nx == -1 || grid[nx][ny] == -1){
                    continue;
                }
            }
            else if(i == 2){
                ny += 1;
                if(ny == grid[0].length || grid[nx][ny] == -1){
                    continue;
                }
            }
            else{
                ny -= 1;
                if(ny == -1 || grid[nx][ny] == -1){
                    continue;
                }
            }
            dfs(grid,nx,ny,count,max);
        }
        grid[x][y] = pre;
    }
}
