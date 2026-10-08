class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];
            if (s.equals("+")  || s.equals("-") || s.equals("*") || s.equals("/")) {

                int secOp;
                int firstOp;
                if (stack.size() >= 2) {
                    secOp = stack.pop();
                    firstOp = stack.pop();

                } else {
                    firstOp = stack.pop();
                    i++;
                    secOp = Integer.parseInt(tokens[i]);
                }

                switch (s) {
                    case "+":
                        stack.push(firstOp + secOp);
                        break;

                    case "-":
                        stack.push(firstOp - secOp);
                        break;
                    case "*":
                        stack.push(firstOp * secOp);
                        break;
                    case "/":
                        stack.push(firstOp / secOp);
                        break;
                    
                }
            }else{
               
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();
    }
}
