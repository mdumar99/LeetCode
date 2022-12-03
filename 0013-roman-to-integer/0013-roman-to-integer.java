class Solution {
    public int romanToInt(String s) {
        int romanInt = 0;
        int i = s.length()-1;
        while(i>=0){
            char c = s.charAt(i);
            switch(c){
                case 'I':
                    romanInt += 1;
                    break;
                case 'V':
                    if((i-1>=0) && s.charAt(i-1)=='I'){
                        romanInt += 4;
                        i--;
                    }else{
                        romanInt += 5;
                    }
                    break;
                case 'X':
                    if((i-1>=0) && s.charAt(i-1)=='I'){
                        romanInt += 9;
                        i--;
                    }else{
                        romanInt += 10;
                    }
                    break;
                case 'L':
                    if((i-1>=0) && s.charAt(i-1)=='X'){
                        romanInt += 40;
                        i--;
                    }else{
                        romanInt += 50;
                    }
                    break;
                case 'C':
                    if((i-1>=0) && s.charAt(i-1)=='X'){
                        romanInt += 90;
                        i--;
                    }else{
                        romanInt += 100;
                    }
                    break;
                case 'D':
                    if((i-1>=0) && s.charAt(i-1)=='C'){
                        romanInt += 400;
                        i--;
                    }else{
                        romanInt += 500;
                    }
                    break;
                case 'M':
                    if((i-1>=0) && s.charAt(i-1)=='C'){
                        romanInt += 900;
                        i--;
                    }else{
                        romanInt += 1000;
                    }
                    break;
                default:
                    break;
            }
            i--;
        }
        return romanInt;
    }
}