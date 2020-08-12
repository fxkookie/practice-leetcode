class Solution {
    int[] arry;
    int aa,bb,cc = 0;
    int i,j,k = -2;
    int count = 0;
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        arry = arr;
        aa =a;
        bb = b;
        cc = c;
        choose();
        return count;
    }

    public void choose(){
        for(int x = 0;x<arry.length-2;x++){
            for(int y = 0;y<arry.length-1 ;y++){
                for(int z = 0;z<arry.length;z++){
                    if(y>x && z>y){
                        i = x;
                        j = y;
                        k = z;
                        if(check() == true){
                            count++;
                        }
                    }
                }
            }
        }
    }

    public boolean check(){
    if(Math.abs(arry[i] - arry[j]) <= aa ){
      if(Math.abs(arry[j] - arry[k]) <= bb){
        if(Math.abs(arry[i] - arry[k]) <= cc){
          return true;
        }
      }
    }
    return false;
  }
}
