class Solution {
     public static boolean contains(int[] have , int[] needed){

        for(int i=0;i<needed.length;i++){
            if(have[i] < needed[i]){
                return false;
            }
        }
        return true;
    }
    
    public  String minWindow(String s, String t) {
      if(t.length() > s.length()) return "";
        int[] sFreq = new int[256];
        int[] tFreq = new int[256];

        for(char c : t.toCharArray()){
            tFreq[c]++;

        }
        int low =0;
        int res=Integer.MAX_VALUE;
        int start =0;

        for(int high =0;high < s.length();high++){
            sFreq[s.charAt(high)]++;
            while (contains(sFreq, tFreq)) {
                int len = high - low +1;

                if(res > len){
                    res = len;
                    start=low;
                }

                sFreq[s.charAt(low)]--;
                low++;
            }
        }
         if(res == Integer.MAX_VALUE) return "";
        return s.substring(start, start+ res);



       


    }
}
