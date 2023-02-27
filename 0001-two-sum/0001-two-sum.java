class Solution {
    public int[] twoSum(int[] nums, int target) {
        //nums = [2,7,11,15], target = 9
        // diff = 9-2=7
        // map: {2,0}
        // i=1
            //9-7=2
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}