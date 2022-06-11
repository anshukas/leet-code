https://www.youtube.com/watch?v=io3N5YTFbxM&ab_channel=GameofCoders
Two pointer apporach:
``class Solution {
public void duplicateZeros(int[] arr) {
int totalZero = 0;
// count total numbers of zeros in array.
for (int i=0; i< arr.length; i++){
if(arr[i] == 0)
totalZero++;
}
int i = arr.length -1;  // arayLastIndex
int j = arr.length + totalZero -1;  // arrayNewLastIndex
while (i < j) {
insert(arr, i, j--);
if(arr[i]==0){
insert(arr, i, j--);
}
i--;
}
}
public void insert(int[] arr, int i, int j){
if( j < arr.length){ // when j should be inbound to array.
arr[j] = arr[i];
}
}
}