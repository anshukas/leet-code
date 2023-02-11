```
//Java Brute Force
class Solution {
public int[] replaceElements(int[] arr) {
int[] ans = new int[arr.length];
ans[arr.length-1] = -1;
int max = Integer.MIN_VALUE;
for(int i = 0; i < arr.length; i++) {
for(int j = i + 1; j < arr.length; j++) {
if(arr[j] > max) {
max = arr[j];
}
if(j == arr.length - 1) {
ans[i] = max;
max = Integer.MIN_VALUE;
}
}
}
return ans;
}
}
```