class Solution {
    public int[] twoSum(int[] nums, int target) {
        // use map where we keep (diff,i)
        // if we find while itrating then create array and return index.
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int diff = target - nums[i];
            
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}