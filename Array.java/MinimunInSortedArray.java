// minimun in Sorted Rotated Array

public class MinimunInSortedArray {
    public int findMin(int[] nums) {
        int ans =Integer.MAX_VALUE;int start = 0;
        int end = nums.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            
            if(nums[start] <= nums[mid]){
                ans = Math.min(nums[start],ans);
                start = mid+1;
            }else{
                end = mid -1;
                ans = Math.min(nums[mid],ans);
            }
        }
        return ans;
    }
}
