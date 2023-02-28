class Solution {
    public int[] twoSum(int[] nums, int target) {
        // brute force
        // Map to create track of prev diff
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            // 9-2=7
            // 9-7=2
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}