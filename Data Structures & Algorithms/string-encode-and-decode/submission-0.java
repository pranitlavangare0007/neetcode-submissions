class Solution {

    public String encode(List<String> strs) {
 StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
List<String> strings = new ArrayList<>();

        int i=0;
        while (i<str.length()) {

            int sep=str.indexOf("#",i);
            int len=Integer.parseInt(str.substring(i,sep));
            i =sep+1;
            String decoded = str.substring(i,i+len);
            strings.add(decoded);
            i=i+len;
            
        }
        return strings  ;
    }
}
