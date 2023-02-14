class Solution {
    public boolean isPalindrome(String s) {
        // so here we need to first avoid space or no digit char
        // compare the string with reversed
        StringBuffer buffer = new StringBuffer();
        
        for (char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                buffer.append(Character.toLowerCase(ch));
            }
        }
        return buffer.toString().equals(buffer.reverse().toString());
    }
}