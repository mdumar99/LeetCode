class Solution {
    public String frequencySort(String s) {
        int len = s.length();
        if(len<=1) return s;
        HashMap<Character,Integer> ht = new HashMap<>();
        
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            if(ht.containsKey(c)){
               int count = ht.get(c) + 1;
               ht.put(c,count);
            }else{
                ht.put(c,1);
            }
        }

        int htSize = ht.size();

        int[] freq = new int[htSize];
        char[] ch = new char[htSize];

        Set<Character> hts = ht.keySet();
        int i = 0;
        for(char key: hts){
            ch[i] = key;
            freq[i] = ht.get(key);
            i++;
        }

        for(int q= 1; q<htSize; q++){
            int k  = freq[q];
            char c = ch[q];
            int j = q-1;
            while((j>-1)&&freq[j]<k){
                freq[j+1] = freq[j];
                ch[j+1] = ch[j];
                j--;
            }
            freq[j+1] = k;
            ch[j+1] = c; 

        }

        String str = "";

        for(int q=0; q<htSize; q++){
            for(int j=0; j<freq[q]; j++){
                str = str + ch[q];
            }
        }

        return str;
        
    }
}