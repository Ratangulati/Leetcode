/* Ques: Given an array of integers nums, return the number of good pairs. A pair (i, j) is called good if nums[i] == nums[j] and i < j. */


class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[102];

        for (int num : nums) {
        count[num]++;
        }

        int totalCount = 0;

        for (int i : count) {
          totalCount += ((i) * (i-1))/2;
        }

        return totalCount;
        
    }
}
