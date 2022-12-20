class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        boolean[] v = new boolean [rooms.size()];
        
        while(!st.isEmpty()){
            int room = st.pop();
            v[room] = true;
            for(int key : rooms.get(room)){
                if(!v[key]) st.push(key);
            }
        }
        
        for(boolean b: v){
            if(!b) return false;
        }
        
        return true;
    }
}


