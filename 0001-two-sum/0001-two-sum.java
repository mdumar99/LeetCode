class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] s = {-1,-1};
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum==target){
                    s[0] = i;
                    s[1] = j;
                    return s;
                }
            }
        }
        return s;
    }
}