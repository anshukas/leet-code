class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        // count each char in s and keep in map
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        
        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count ==1) 
                    map.remove(c);
                else{
                    map.put(c,map.get(c)-1);
                }
            }
        }
        return map.isEmpty();
    }
}