class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(', ')');
         map.put('{', '}');
          map.put('[', ']');

         

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '{' || ch =='['){
                stack.push(ch);
            }else {
               
                if(!stack.isEmpty() && map.get(stack.peek()) == ch){
                    stack.pop();
                }else{
                    return false;
                }

                
            }

        }
        return stack.isEmpty();
    }
}
