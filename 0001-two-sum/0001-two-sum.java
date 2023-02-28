class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force
        for(int i=0; i< nums.length -1; i++){
            int firstNum = nums[i];
            for(int j=i+1; j < nums.length; j++){
                int secNum = nums[j];
                int sum = firstNum + secNum;
                if(sum == target)
                    return new int[] {i,j};
            }
        }
        return new int[0];
    }
}