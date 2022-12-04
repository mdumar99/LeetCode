class Solution {
    public int minimumAverageDifference(int[] nums) {
        if(nums.length == 1) return 0;
        int len = nums.length;
        long leftSum = nums[0];
        long rightSum = 0;
        for(int i=1; i<len; i++){
            rightSum += nums[i];
        }

        int leftDiv = 1;
        int rightDiv = len - 1;

        long minAvg = Math.abs((leftSum/leftDiv)-(rightSum/rightDiv));
        int minInd = 0;

        for(int i=1; i<len; i++){
            leftSum += nums[i];
            rightSum -= nums[i];
            leftDiv++;
            rightDiv--;
            long avg = (rightDiv==0) ? Math.abs (leftSum/leftDiv) : Math.abs((leftSum/leftDiv)-(rightSum/rightDiv));
            if(avg<minAvg){
                minAvg = avg;
                minInd = i;
            }
        }

        return minInd;
    }
}