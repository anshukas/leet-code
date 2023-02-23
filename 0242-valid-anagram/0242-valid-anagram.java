class Solution {
    public boolean isAnagram(String s, String t) {
        // basically if both string are anagram then if we sroted it. it should be equal.
        if(s.length() != t.length())
            return false;
        
        // convert to charArray to use sorting.
        char[] sArry = s.toCharArray();
        char[] tArry = t.toCharArray();
        Arrays.sort(sArry);
        Arrays.sort(tArry);
        
        return Arrays.equals(sArry, tArry);
    }
    // Time complexity: O(nlogn)
    // Space complexity: O(1)
}