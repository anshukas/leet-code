class Solution {
    public boolean isAnagram(String s, String t) {
        // to check two string are anagram we can sort both string.
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        // sort
        Arrays.sort(str1);
        Arrays.sort(str2);
        
        return Arrays.equals(str1, str2);
    
    }
}