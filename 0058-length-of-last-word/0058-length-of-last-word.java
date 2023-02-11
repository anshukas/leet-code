class Solution {
    public int lengthOfLastWord(String s) {
        String[] strArr= s.split(" ");
        
        for(int i = strArr.length -1; i >= 0; i--){
            if(strArr[i].equals("") || strArr[i].equals(" "))
                continue;
            return strArr[i].trim().length();
        }
        return 0;
    }
}