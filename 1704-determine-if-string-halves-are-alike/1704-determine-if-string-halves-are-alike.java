class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int fhIndex = 0;
        int shIndex = len/2;

        int fhCount = 0;
        int shCount = 0;
        
        for(int i=0; i<len/2; i++){
            if(checkVowel(s.charAt(i))){
                fhCount++;
            }
        }

        for(int i=shIndex; i<s.length(); i++){
            if(checkVowel(s.charAt(i))){
                shCount++;
            }
        }

        if(fhCount==shCount){
            return true;
        }

        return false;
    }

    public boolean checkVowel(char c){
         char[] vowel = new char[]{'a','e','i','o','u'};
         char ch = Character.toLowerCase(c);
         for(int i=0; i<5; i++){
             if(vowel[i]==ch){
                 return false;
             }
         }
         return true;
    }
}