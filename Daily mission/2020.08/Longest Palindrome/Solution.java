class Solution {
    public int longestPalindrome(String s) {
        int odd = 0;
        int even = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //put all Character into map
        while(!s.isEmpty()){
            char temp = s.charAt(0);
            s = s.substring(1,s.length());
            if(map.containsKey(temp)){
                map.replace(temp,(int)map.get(temp)+1);
            }
            else{
                map.put(temp,1);
            }
        }
        //count the times character repeat
        for(Map.Entry entry : map.entrySet()) {
            Character u = (Character)entry.getKey();
            Integer v = (Integer)entry.getValue();
            // System.out.printf("u:%c v:%d ",u,v);
            if(v%2 == 1){
                if(odd == 0){
                    odd = 1;
                }
                v -= 1;
            }
            v /= 2;
            even += v;
        }
        // System.out.printf("even:%d,odd:%d ",even,odd);
       return odd + 2*even;
    }
}
