class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(hlen < nlen) return -1;
        if(hlen == nlen){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return -1;
            }
        }

        for(int i=0; i<hlen-nlen+1; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int index = i;
                for(int j=0; j<nlen; j++){
                    if(needle.charAt(j)!=haystack.charAt(index)){
                        break;
                    }
                    index++;
                    if (j==nlen-1) return i;
                }
            }
        }

        return -1;
    }
}