class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x>=10&&x<10) return true;
        
        int stInt = x;
        int revInt = 0;
        
        while(stInt!=0){
            int rem = stInt % 10;
            stInt = stInt / 10;
            revInt = (stInt==0) ? (revInt + rem) : ((revInt + rem)*10 );
        }
        
        if(x == revInt){
            return true;
        }else{
            return false;
        }
    }
}