import java.lang.Math;

class Solution {
    int n;
    int k;
    ArrayList ans = new ArrayList();
    public int[] numsSameConsecDiff(int a, int b) {
        n = a;
        k = b;
        if(n == 1){
            for(int s = 0;s<10;s++){
                ans.add(s);
            }
        }
        else{
            for(int i = 0;i<10;i++){
                search(0,i,i);
            }
        }
        int[] aa = new int[ans.size()];
        for(int j = 0;j<ans.size();j++){
            aa[j] = (int)ans.get(j);
        }
        // return ans.toArray(new int[ans.size()]);
        return aa;
    }
    public void search(int digit,int num,int head){
        if(digit == 0){
            search(1,num,num);
            return;
        }
        int candidate1 = head + k;
        int candidate2 = head -k;
        int temp;
        if(digit == n-1){
            if(candidate1 >0 && candidate1<10){
                temp = (int)(num + candidate1*Math.pow(10,digit));
                ans.add(temp);
            }
            if(candidate2 >0 && candidate2<10 && candidate1!=candidate2){
                temp = (int)(num + candidate2*Math.pow(10,digit));
                ans.add(temp);
            }
        }
        else{
            if(candidate1 >=0 && candidate1<10){
                temp = (int)(num + candidate1*Math.pow(10,digit));
                search(digit+1,temp,candidate1);
            }
            if(candidate2 >=0 && candidate2<10 && candidate1!=candidate2){
                temp = (int)(num + candidate2*Math.pow(10,digit));
                search(digit+1,temp,candidate2);
            }
        }
    }
}
