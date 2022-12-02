class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area = 0;
        int start = 0; int end = height.length - 1;
        while(start!=end && start<end ){
            if(height[start]<height[end]){
                area = height[start] * (end-start);
                start++;
            }else if(height[start]>height[end]){
                area = height[end] * (end-start);
                end--;
            }else{
                area = height[end] * (end-start);
                end--;
                start++;
            }

            if(area>maxArea){
                maxArea = area;
            }
        }

        return maxArea;
    }
}