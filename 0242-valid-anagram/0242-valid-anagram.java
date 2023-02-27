class Solution {
    public boolean isAnagram(String s, String t) {
        // we can do better.
        // Here we can use map to keep track of char from s string.
        // then from t string we lookup and remove from map
        // if map is empty then anagram.
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        // itrate t and looup in map
        for(char c: t.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count == 1)
                    map.remove(c);
                else
                    map.put(c, map.get(c)-1);
            }
        }
        return map.isEmpty();
    }
}