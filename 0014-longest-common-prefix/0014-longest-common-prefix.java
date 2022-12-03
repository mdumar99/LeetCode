class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String st = strs[0];
        int len = st.length();
        if(len==0) return "";
        int x = 0;
        int y = len;
        while(true){
            String substr = st.substring(x,y);
            boolean lcp = isLCP(substr, strs, y);
            if(lcp) break;
            y--;
            if(y<0) return "";
        }
        return st.substring(x,y);

    }


    public static boolean isLCP(String st, String[] strs, int end){
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<st.length()) return false;
            String subs  = strs[i].substring(0,end);
            if(!(subs.equals(st))){
                return false;
            }
        }
        return true;
    }
}