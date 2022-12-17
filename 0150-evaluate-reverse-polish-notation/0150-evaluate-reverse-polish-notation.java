class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<tokens.length; i++){
            String ops = tokens[i];
            switch(ops){
                case "+":
                    st.push(st.pop()+st.pop());
                    break;
                case "-":
                    int num = st.pop();
                    st.push(st.pop()-num);
                    break;
                case "*":
                    st.push(st.pop()*st.pop());
                    break;
                case "/":
                    int n = st.pop();
                    st.push(st.pop()/n);
                    break;
                default:
                    st.push(Integer.parseInt(ops));
            }
        }
        
        return st.pop();
    }
}