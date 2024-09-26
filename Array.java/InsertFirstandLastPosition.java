// insert First and Last Postion in Sorted Array
public class InsertFirstandLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        
        ans[0] = searchNumber(target,nums,true);
        ans[1] = searchNumber(target,nums,false);
        
        return ans;
    }
    public int searchNumber(int target,int nums[],boolean isAvailable){
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        
        while(start <= end){
            int mid = start +(end-start)/2;
            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                ans = mid;
                if(isAvailable){
                    end = mid-1;
                    
                }else{
                   start = mid+1;
                }
            }
        }
        return ans;
    }    
}
