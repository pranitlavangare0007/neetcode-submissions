class Solution {
    public int characterReplacement(String s, int k) {
         Map<Character,Integer> map = new HashMap<>();
        int maxLength=0;
        int windowSize=0;
        int replacementNeeded=0;
        int maxFreq=0;

        int l=0;

        for(int r=0;r<s.length();r++){

            map.put(s.charAt(r),map.getOrDefault(s.charAt(r), 0) +1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));
            windowSize = r - l + 1 ;
            replacementNeeded = windowSize - maxFreq;

            if(replacementNeeded > k){
                windowSize--;
                map.put(s.charAt(l), map.get(s.charAt(l))- 1);
                l++;
            }

            maxLength = Math.max(maxLength, windowSize);

        }
        return maxLength;
    }
}
