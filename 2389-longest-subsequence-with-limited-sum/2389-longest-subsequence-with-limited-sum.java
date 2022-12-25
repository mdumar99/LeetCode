class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
       
        Arrays.sort(nums);
        int len = nums.length;
        int[] pre = new int[len];
        pre[0] = nums[0];
        
        for(int i=1; i<len; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        
        int m = queries.length;
        
        int[] res = new int[m];
        
        for(int i=0; i<m; i++){
            int q = queries[i];
            int left = 0, right = nums.length - 1;
            while(left<=right){
                int mid = left + (right-left) / 2;
                if(pre[mid]<=q){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
            
            res[i] = right + 1;
        }
        return res;
    }
}


