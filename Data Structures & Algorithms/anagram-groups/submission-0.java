class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] newStr = s.toCharArray();
            Arrays.sort(newStr);
            String sorted = new String(newStr);

            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }else{
                map.put(sorted, new ArrayList<>(Arrays.asList(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
