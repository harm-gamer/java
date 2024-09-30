//   747. Largest Number At Least Twice of Others


// You are given an integer array nums where the largest integer is unique.

// Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
public class latgestNumbertwice {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == largest) {
                continue;
            } else if (2 * nums[i] > largest) {
                return -1;
            }
        }

        return index;
    }
}
