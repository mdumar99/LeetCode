class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        char[][] arr = new char[numRows][s.length()/2+1];
        int x=0, y=0;
        boolean latch = false;
        for(int i=0; i<s.length(); i++){
            arr[x][y] = s.charAt(i);
            if(latch == false){
                if(x+1<numRows){
                    x++;
                }else{
                    if(x-1!=0) latch = true;
                    x--;
                    y++;
                    continue;
            }   
        }
            if(latch==true){
                if (x-1!=0){
                    x--;
                    y++;
                }else{
                    x--;
                    y++;
                    latch = false;
                }
            }
        }
        
        String res = "";
        
        for(int i=0; i<numRows; i++){
            for(int j=0; j<s.length()/2+1; j++){
                if(arr[i][j]!='\0'){
                    res = res + arr[i][j];
                }
            }
        }
        
        return res;
    }
}