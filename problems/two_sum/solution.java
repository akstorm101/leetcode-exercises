class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a HashMap K-V
        Map<Integer, Integer> map = new HashMap<>();
        // loop for all elements
        for(int i = 0; i < nums.length; i++){
            // create target
            int complementIdx = target - nums[i];
            // check if we have a pair
            if(map.containsKey(nums[i])){
                // we have found a pair
                return new int[] {map.get(nums[i]),i};
            }
            // Add the complement of the curr element to the map
            map.put(complementIdx, i);

        }
        // if no pair found
        throw new IllegalArgumentException("No two sum found");
    }
}