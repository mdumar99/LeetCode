class Solution {
    public int reverse(int x) {
        long revInt = 0;
        int stInt = (x<0) ? -x : x;
        
        while(stInt!=0){  
            int rem = stInt % 10;
            stInt = stInt/10;
            revInt = (stInt==0) ? (revInt+rem) : (revInt + rem)* 10;
        }
        
        if((revInt<-2147483648)||(revInt>2147483647)) return 0;
        
        if(x<0){
            return 0-(int)revInt;
        }
        
        return (int)revInt;
    }
}