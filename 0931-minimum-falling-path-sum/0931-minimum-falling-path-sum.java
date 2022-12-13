class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        if(n==1) return matrix[0][0];
        int [][] s = new int[n][n];
        for(int i=0; i<n; i++){
            s[0][i] = matrix[0][i];
        }
        for(int j=1; j<n; j++){
            for( int i=0; i<n; i++){
                if(i==0){
                    s[j][i] = Math.min(s[j-1][i], s[j-1][i+1]) + matrix[j][i];
                }else if(i==n-1){
                    s[j][i] = Math.min(s[j-1][i], s[j-1][i-1]) + matrix[j][i];
                }else{
                    s[j][i] = Math.min(Math.min(s[j-1][i], s[j-1][i+1]),s[j-1][i-1]) + matrix[j][i];
                }
            }
        }
        
        int res = s[n-1][0];
        for(int i=1; i<n; i++){
            if(s[n-1][i]<res){
                res = s[n-1][i];
            }
        }
        return res;
    }
}