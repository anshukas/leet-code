class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. if s!=t then it should not be anagram.
        if(s.length() != t.length())
            return false;
        
        // count each char keep in map
        Map<Character,Integer> countCharMap = new HashMap<>();
        for(char c: s.toCharArray()){
            countCharMap.put(c,countCharMap.getOrDefault(c,0)+1);
        }
        // itrate t and remove if count 1 or dec the count of char and check map.isEmpty. If yes it is anagram.
        for(char c: t.toCharArray()){
            if(countCharMap.containsKey(c))
                if(countCharMap.get(c) == 1)
                    countCharMap.remove(c);
                else{
                    countCharMap.put(c,countCharMap.get(c) -1);
                }
        }
        return countCharMap.isEmpty();
    }
}