class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)  return 0;
        int[] arr = new int[nums.length+1];
        arr[0] = 0;
        arr[1] = nums[0];
        
        for(int i=1; i<nums.length; i++){
            int val = nums[i];
            arr[i+1] = Math.max(arr[i], arr[i-1] + val);
        }
        
        return arr[nums.length];
    }
}