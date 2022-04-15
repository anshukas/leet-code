class Solution {
    // 9-2=7(keep inside map & index), check if next element in map. 
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                int index = map.get(nums[i]);
                return new int[]{index,i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[0];
    }
}