class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false; 
     
        Stack<Character> open = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case ')':
                    if(!open.isEmpty() && open.peek()=='('){
                        open.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if(!open.isEmpty() && open.peek()=='['){
                        open.pop();
                    }else{
                        return false;
                    }
                    break;
                case '}':
                    if(!open.isEmpty() && open.peek()=='{'){
                        open.pop();
                    }else{
                        return false;
                    }
                    break;
                default :
                    open.push(c);
            }
         
        }

        if(open.isEmpty()){
            return true;
        }
        return false;
    }
}