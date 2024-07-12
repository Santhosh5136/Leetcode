class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], true);
        }
        for (int i = 0; i < nums.length; i++) {
            int below = nums[i] - diff;
            int above = nums[i] + diff;
            if (map.containsKey(below) && map.containsKey(above)) {
                count++;
            }
        }

        return count;

    }
}