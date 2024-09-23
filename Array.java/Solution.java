public class Solution {
    public int searchInsert(int[] nums, int target) {
        int s =0;
        int end = nums.length-1;
        
        
        while(s <= end){
            int mid  = s + (end-s)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target <= nums[mid]){
                end = mid-1;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
} 
    

