class Solution {
    public int evalRPN(String[] token) {
        Deque<String> stack = new ArrayDeque<>() ;
        int n = token.length;
        for(int i=0;i<n;i++){
            String s = token[i];
            if(s .equals("+") || s.equals("-") || s .equals("*") || s.equals("/")){
                
                
                int b = Integer.valueOf(stack.pop());
                int a = Integer.valueOf(stack.pop());
                if(s.equals ("+")){
                    stack.push(Integer.toString(a+b));
                }
                else if(s .equals("-")){
                    stack.push(Integer.toString(a-b));
                }
                else if(s .equals("/")){
                    stack.push(Integer.toString(a/b));
                }
                else if(s.equals("*")){
                    stack.push(Integer.toString(a*b));
                }
                
            }
            else {
                stack.push(s);
            }
        }
        return Integer.valueOf(stack.pop());
    }
}