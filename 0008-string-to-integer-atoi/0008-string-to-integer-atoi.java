class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        long number=0;
        int num;
        long temp;
        boolean neg = false;
        boolean numdetect = false;
        for(int i=0; i<len; i++){
            if(!Character.isDigit(s.charAt(i))){
                if(numdetect == true) break;
                if(s.charAt(i)=='-'){
                    if(i+1<len && Character.isDigit(s.charAt(i+1))){
                        neg = true;
                    }else{
                        return 0;
                    }
                }else if(s.charAt(i)==' '){
                    continue;
                }else if(s.charAt(i)=='+'){
                    if(i+1<len && Character.isDigit(s.charAt(i+1))){
                        neg = false;
                    }else{
                        return 0;
                    }
                    
                }else{
                    return 0;
                }
            }else{
                numdetect = true;
                int a=Character.getNumericValue(s.charAt(i));
                number = (i+1<len && Character.isDigit(s.charAt(i+1))) ? ((number + a) * 10) : (number + a);
                
                if(neg){
                    temp = 0 - number;
                }else{
                    temp = number;
                }
                
                if(temp<-2147483648){
                    num = -2147483648;
                    return num;
                }else if(temp>2147483647){
                    num = 2147483647;
                    return num;
                }    
            }
        }
        
        if(neg){
            num = 0 - (int)number;
        }else{
            num = (int)number;
        }
        
        return num;
    }
}