class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] uniqueArr = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if((arr[i]==arr[j]) && (i!=j)){
                    count++;
                }
            }
            uniqueArr[i] = count;
            if(i>0){
                for(int k=i-1; k>=0; k--){
                    if(uniqueArr[k]==uniqueArr[i]){
                        if(arr[k]!=arr[i]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }
}