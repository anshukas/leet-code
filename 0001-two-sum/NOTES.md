```
// brute force Algo
class Solution {
public int[] twoSum(int[] nums, int target) {
// brute force Algo
for(int i=0; i < nums.length - 1; i++) {
int firstNumber = nums[i];
for(int j = i+1; j< nums.length; j++) {
int secondNumber = nums[j];
int currentSum = firstNumber + secondNumber;
if(currentSum == target) {
return new int[] {i, j};
}
}
}
return new int[0];
}
}
​
```
class Solution {
// 9-2=7(keep inside map & index), check if next element in map.
public int[] twoSum(int[] nums, int target) {
Map<Integer, Integer> map = new HashMap<>();
for (int i =0; i< nums.length; i++){
if(map.containsKey(nums[i])){