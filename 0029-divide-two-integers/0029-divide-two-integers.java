class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        if(dividend == 0) return 0;
        if(dividend == divisor) return 1;
        long upper = dividend;
        long lower = divisor;

        boolean upperNeg = false;
        boolean lowerNeg = false;

        if(dividend<0){
            upper = Math.abs(upper);
            upperNeg = true;
        }
        if(divisor<0){
            lower = Math.abs(lower);
            lowerNeg =  true;
        }

        long result = 0;

        while(upper>=lower){
           int shift = 0;
           while(upper >= (lower << shift)){
               shift++;
           }
           result += (1<<shift-1);
           upper -= lower << (shift-1);
        }

        if((upperNeg && lowerNeg) || (!upperNeg && !lowerNeg)){
            if(result <= Math.pow(2,31)-1){
                return (int)result;
            }else{
                return (int)(Math.pow(2,31)-1);
            }
        }else{
            result = 0 - result;
            if(result >= Math.pow(-2,31)){
                return (int)result;
            }else{
                return (int)Math.pow(-2,31);
            }
        }
   }
}