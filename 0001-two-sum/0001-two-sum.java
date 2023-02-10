class Solution {
    public int[] twoSum(int[] nums, int target) {
        // basically, 9-2 = 7, map keep number and index
        Map<Integer, Integer> preNum = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(preNum.containsKey(diff)){
                return new int[]{ preNum.get(diff), i};
            }
            preNum.put(nums[i],i);
        }
        return new int[] {};
        }
}