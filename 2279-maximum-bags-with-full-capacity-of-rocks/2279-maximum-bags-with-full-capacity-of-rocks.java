class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int res = 0;
        int[] sp = new int[capacity.length];
        
        for(int i=0; i<capacity.length; i++){
            sp[i] = capacity[i] - rocks[i];
        }
        
        Arrays.sort(sp);
        
        for(int s : sp){
            if(additionalRocks < s) break;
            res++;
            additionalRocks -= s;
        }
        
        return res;
    }
}



