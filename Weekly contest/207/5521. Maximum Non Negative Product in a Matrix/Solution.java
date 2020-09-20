import java.lang.Math;
class Solution {
    List<List<Character>> ans = new ArrayList<List<Character>>();
    public int maxProductPath(int[][] grid) {
        int size = grid.length;
        int size2 = grid[0].length;
        int global = -2;
        String walk = "";
        for(int i = 0;i<size-1;i++){
            walk += "R";
        }
        for(int k = 0;k<size2-1;k++){
            walk += "D";
        }
        round(walk.toCharArray(),0);
        for(int q = 0;q<ans.size();q++){
            int local = pass((List<Character>)ans.get(q),grid);
            if(local > global){
                global = local;
            }
        }
        if(global == -1){
            return -1;
        }
        else{
            return global %(1000000007);
        }
    }
    
    public void round(char[] n,int start){
        List<Character> temp = new ArrayList<Character>();
        if(start == n.length){
            for(int j = 0;j<n.length;j++){
                temp.add(n[j]);
            }
            ans.add(temp);
            return;
        }
        for(int i = start;i<n.length;i++){
            swap(n,i,start);
            round(n,start+1);
            swap(n,i,start);
        }
    }
    public void swap(char[] x,int a,int b){
        char temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
    public int pass(List<Character> path,int[][] grid){
        int x = 0;
        int y = 0;
        int val = grid[0][0];
        for(int a = 0;a<path.size();a++){
            if(path.get(a) == 'R'){
                // System.out.printf("%d ",grid[x+1][y]);
                if(grid[x+1][y] == 0){
                    return 0;
                }
                val *= grid[x+1][y];
                x++;
            }
            else{
                if(grid[x][y+1] == 0){
                    return 0;
                }
                val *= grid[x][y+1];
                y++;
            }
        }
        // System.out.printf("%d",val);
        if(val < 0){
            return -1;
        }
        else{
            return val;
        }
    }
}