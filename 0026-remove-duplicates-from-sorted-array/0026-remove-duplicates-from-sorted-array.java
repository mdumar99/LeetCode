class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int first = 0;
        int dup = 1;

        while(dup<nums.length){
            if(nums[first]==nums[dup]){
                nums[dup] = 101;
            }else{
                first = dup;
            }
            dup++;
        }

        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i]==101){
                break;
            }
        }
        dup = i+1;
        while(dup<nums.length){
            if(nums[dup]<101){
                nums[i] = nums[dup];
                nums[dup] = 101;
                i++;
                dup++;
                continue;
            }
            dup++;
        }

        return i;

    }
}