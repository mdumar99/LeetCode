class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length+nums2.length];

        for(int i=0; i<nums1.length; i++){
            mergedArr[i] = nums1[i];
        }
        int j = 0;
        for(int i=nums1.length; i<mergedArr.length; i++){
            mergedArr[i] = nums2[j];
            j++;
        }

        for(int i=1; i<mergedArr.length; i++){
            int k = mergedArr[i];
            int m = i-1;
            while((m>-1)&&(mergedArr[m]>k)){
                mergedArr[m+1] = mergedArr[m];
                m--;
            }
            mergedArr[m+1] = k;
        }

        int L = 0;
        int U = mergedArr.length - 1;

        while(U>=L){
            U--;
            L++;
        }
        U++;
        L--;

        if(U==L){
            return (double)mergedArr[U];
        }else{
            double res = ((double)mergedArr[U] + (double)mergedArr[L]) / 2.0;
            return res;
        }
    }
}