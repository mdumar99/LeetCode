class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int maxCount = 0;
        int count = 1;
        int subStringStart = 0;

        for(int i=1; i<s.length(); i++){
            
            for(int k=i-1; k>=subStringStart; k--){
                if(s.charAt(i)==s.charAt(k)){
                    subStringStart = k+1;
                    if(count>maxCount){
                        maxCount = count;
                    }
                    count = i - subStringStart;
                    break;
                }
            }
            count++;
        }

        if(count>maxCount){
            return count;
        }

        return maxCount;
    }
}