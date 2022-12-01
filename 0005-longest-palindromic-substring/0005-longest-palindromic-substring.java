class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int len = s.length();
        int lpStart = 0;
        int lpLength = 1;
        boolean [][] arr = new boolean [len][len];
        for(int i=0; i<len; i++){
            arr[i][i] = true;
        }

        for(int i=len-1; i>=0; i--){
            for(int dist=1; dist<len-i; dist++){
                int j = dist + i;
                arr[i][j] = (dist==1) ? s.charAt(i) == s.charAt(j) : (s.charAt(i) == s.charAt(j)) && arr[i+1][j-1];
                if(arr[i][j] && j-i+1 > lpLength){
                    lpLength = j-i+1;
                    lpStart = i;
                    
                }
            }
        }

        
        return s.substring(lpStart, lpStart+lpLength);

    }
}