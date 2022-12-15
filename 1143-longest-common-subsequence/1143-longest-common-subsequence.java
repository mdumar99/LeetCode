class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length();
        int y = text2.length();
        int[][] arr = new int [x+1][y+1];
        for(int i=1; i<=x; i++){
            for(int j=1; j<=y; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1]+1;
                }else{
                    arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
                }
            }
        }
        
        return arr[x][y];
    }
}