class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum = 0;
        // Total sum
        for (int i=0; i<nums.length; i++) {
            total_sum += nums[i];
        }
        // check left_sum
        int left_sum = 0;
        for (int i=0; i < nums.length; i++ ) {
            if (i != 0) left_sum += nums[i-1];
            if (total_sum - left_sum - nums[i] == left_sum) {
                return i
            }
        }
        return -1;
    }
}

total_sum = 28;
[1 , 7, 3, 6, 5, 6]

left_sum = 11;  
[1 ,7 , 3, 6, 5, 6];

28 - 11 = 17 - 6 = 11 == 11

total_sum - left_sum - num[i] == left_sum
