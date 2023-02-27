class Solution {
    public boolean isAnagram(String s, String t) {
        // to check anagram we can sort both string and then compare.
        // O(nlogn) | O(1)
        // code
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        
        return Arrays.equals(sArr, tArr);
    }
}