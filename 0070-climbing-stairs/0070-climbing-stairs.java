class Solution {
    int[] arr = new int[46];
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }else if(arr[n]!=0){
            return arr[n];
        }else{
            arr[n] = climbStairs(n-1) + climbStairs(n-2);
            return arr[n];
        }
    }
}