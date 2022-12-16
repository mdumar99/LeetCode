class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())  return false;
        Map<Character, Integer> c1 = new HashMap<>();
        Map<Character, Integer> c2 = new HashMap<>();
        for(char c: word1.toCharArray()){
            c1.put(c, c1.getOrDefault(c,0)+1);
        }
        for(char c: word2.toCharArray()){
            c2.put(c, c2.getOrDefault(c,0)+1);
        }
        
        if(!c1.keySet().equals(c2.keySet())){
            return false;
        }
        
        Integer[] s1 = c1.values().toArray(new Integer[0]);
        Integer[] s2 = c2.values().toArray(new Integer[0]);
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.equals(s1,s2);
    }
}




