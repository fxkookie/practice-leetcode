class Solution {
    public String largestTimeFromDigits(int[] a) {
        int pos1 = 2;
        String ans = "";
        while(true){
            if(pos1 == -1){
                return "";
            }
            if(search(a,pos1)){
                ans += pos1;
            }
            if(pos1 == 2){
                for(int i = 3;i>-1;i--){
                    if(search(a,i)){
                        ans += i;
                        i = -1;
                    }
                }
            }
            else{
                for(int i = 9;i>-1;i--){
                    if(search(a,i)){
                        ans += i;
                        i = -1;
                    }
                }
            }
            ans += ":";
            for(int s = 5;s>-1;s--){
                if(search(a,s)){
                    ans += s;
                    s = -1;
                }
            }
            for(int k = 0;k<4;k++){
                if(a[k]>-1){
                    ans += a[k];
                    a[k] *= -1;
                    k = 5;
                }
            }
            if(ans.length() == 5){
                return ans;
            }
            for(int z = 0;z<ans.length();z++){
                char t = ans.charAt(z);
                if(t != ':'){
                    putback(a,t-48);
                }
            }
            pos1--;
            ans = "";
        }
    }
    public boolean search(int[] x,int k){
        for(int i = 0;i<x.length;i++){
            if(x[i] == k){
                if(k == 0){
                    x[i] = -99;
                }
                else{
                    x[i] = k*-1;
                }
                return true;
            }
        }
        return false;
    }
    public void putback(int[] x,int k){
        if(k == 0){
            for(int i = 0;i<x.length;i++){
                if(x[i] == -99){
                    x[i] = 0;
                    return;
                }
            }
        }
        for(int i = 0;i<x.length;i++){
            if(x[i] == k*-1){
                x[i] = k;
            }
        }
    }
}
