class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0 || tokens==null){
            return -1;
        }
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<tokens.length;i++){
            if(tokens[i].equals("+")) {
                s.push(s.pop() + s.pop());
            }
            else if (tokens[i].equals("*")) {
                s.push(s.pop() * s.pop());
            }
            else if (tokens[i].equals("-")) {
                int e1 = s.pop();
                int e2 = s.pop();
                s.push(e2 - e1);
            }
            else if (tokens[i].equals("/")) {
                int e1 = s.pop();
                int e2 = s.pop();
                s.push(e2 / e1);
            }
            else {
                s.push(Integer.valueOf(tokens[i]));
            }
        }
        return s.pop();
        }
    }
