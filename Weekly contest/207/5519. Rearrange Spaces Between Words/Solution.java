import java.util.ArrayDeque;
class Solution {
    public String reorderSpaces(String text) {
        int blank = 0;
        String ans = "";
        Queue temp = new ArrayDeque();
        Queue all = new ArrayDeque();
        String word = "";
        for(int i = 0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                if(!temp.isEmpty()){
                    while(!temp.isEmpty()){
                        word += (char)temp.poll();
                    }
                    all.add(word);
                    word = "";
                }
                blank++;
            }
            else{
                temp.add(text.charAt(i));
            }
        }
        if(!temp.isEmpty()){
            while(!temp.isEmpty()){
                word += (char)temp.poll();
            }
            all.add(word);
        }
        int size = all.size()-1;
        if(size == 0){
            ans += all.poll();
            for(int s = 0;s<blank;s++){
                    ans += " ";
            }
            return ans;
        }
        // System.out.printf("%d & %d",blank,size);
        if(blank % size == 0){
            blank = blank / size;
            while(all.size() >1){
                ans += all.poll();
                for(int z = 0;z<blank;z++){
                    ans += " ";
                }
            }
            ans += all.poll();
        }
        else{
            int r = blank%size;
            blank = blank / size;
            while(all.size() >1){
                System.out.printf("%s",all.peek());
                ans += all.poll();
                for(int z = 0;z<blank;z++){
                    ans += " ";
                }
            }
            ans += all.poll();
            for(int k = 0;k<r;k++){
                ans += " ";
            }
        }
        return ans;
    }
}