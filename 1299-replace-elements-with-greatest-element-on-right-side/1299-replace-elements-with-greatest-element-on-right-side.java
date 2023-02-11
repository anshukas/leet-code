class Solution {
    public int[] replaceElements(int[] arr) {
        // initial max = -1
        // reverse itrate 
        // new max = max(oldmax , arr[i])
        int rightMax = -1;
        for(int i= arr.length-1; i>=0; i--){
            int newMax = Math.max(rightMax, arr[i]);
            arr[i] = rightMax;
            rightMax = newMax;
        }
        return arr;
    }
}