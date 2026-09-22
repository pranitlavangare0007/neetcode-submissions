class Solution {
    public boolean isAnagram(String s, String t) {

        int[] f1 = new int[26]; 
        int[] f2 = new int[26]; 

        for(char ch :s.toCharArray()){
            f1[ch-'a']=f1[ch-'a']+1;
        }
        for(char ch :t.toCharArray()){
            f2[ch-'a']=f2[ch-'a']+1;
        }

        for(int i=0;i<f1.length;i++){
            if(f1[i] != f2[i]){
                return false;
            }
        }

        return true;

    }
}
