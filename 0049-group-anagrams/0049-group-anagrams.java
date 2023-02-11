class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // map: {key : list}, K is sorted and every time sort str from array
        // compare with Key and add in map's list.
        
        Map<String, List<String>> map = new HashMap<>();
        
        // itrate array
        for (String s: strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            if(!map.containsKey(key))
                map.put(key, new ArrayList<>());
            
            // add current string in map too.
            map.get(key).add(s);
            
        }
        return new ArrayList(map.values());
    }
}