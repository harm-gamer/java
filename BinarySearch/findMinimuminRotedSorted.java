public class findMinimuminRotedSorted {
    public int findMin(int[] nums) {
        int si = 0,ei = nums.length-1;


        while(si < ei){

            int mid = si + (ei-si)/2;

            if(nums[mid] < nums[ei]){
                ei = mid;
            }else{
                si = mid +1;
            }
        }
        return nums[si];
    }
}
