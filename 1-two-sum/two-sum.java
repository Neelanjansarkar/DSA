class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store numbers and their corresponding indices
        Map<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement is already in the map, we found the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (per problem constraints, this won't happen)
        return new int[] {};
    }
}
