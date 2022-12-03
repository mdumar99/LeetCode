class Solution {
    public int removeElement(int[] nums, int val) {
        if(val>50) return nums.length;
        if(nums.length == 0) return 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                nums[i] = -1;
            }
        }

        int count = 0;
        while(nums[count]>=0){
            count++;
            if(count>=nums.length) return nums.length;
        }
        int numToSwap = count + 1;
        while(numToSwap<nums.length){
            if(nums[numToSwap]>=0){
                nums[count] = nums[numToSwap];
                nums[numToSwap] = -1;
                count++;
                numToSwap++;
                continue;
            }
            numToSwap++;
        }

        return count;
    }
}