class Solution {
    public int findClosestNumber(int[] nums) {
        int closestNumber = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closestNumber)) {
                closestNumber = num;
            } else if(Math.abs(num) == Math.abs(closestNumber)){
                if(num > closestNumber) closestNumber = num;
            }
        }

        return closestNumber;
    }
}
