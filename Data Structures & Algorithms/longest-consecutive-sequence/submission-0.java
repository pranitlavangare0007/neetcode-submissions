class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,Boolean> map = new HashMap<>();

        for(int n:nums){
            map.put(n,Boolean.FALSE);
        }

        int longest=0;

        for(int n:nums){
            int currLen=1;

            int nextNum=n+1;

            while(map.containsKey(nextNum) && !map.get(nextNum)){
                currLen++;
                map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }

            int prevNum=n-1;
            while(map.containsKey(prevNum) && !map.get(prevNum)){
                currLen++;
                map.put(prevNum,Boolean.TRUE);
                prevNum--;
            }

            longest=Math.max(longest,currLen);


        }
        return longest;
    }
}
