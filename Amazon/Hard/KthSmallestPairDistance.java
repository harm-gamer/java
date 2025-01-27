package Amazon.Hard;

import java.util.Arrays;

// Description

// The distance of a pair of integers a and b is defined as the absolute difference between a and b.
// Given an integer array nums and an integer k, return the kth smallest distance among all the pairs nums[i] and nums[j] where 0 <= i < j < nums.length.

public class KthSmallestPairDistance {
     public int smallestDistancePair(int[] nums, int k) {
     Arrays.sort(nums);
        
        int n = nums.length;
        int l =0;
        int r = nums[n-1] - nums[0];
        
        while(l<r){
            int cnt =0;
            int m = l + (r-l)/2;
            for(int i=0,j=0;i<n;i++){
                while(j<n && nums[j]-nums[i] <=m){
                    j++;
                }
                cnt += j-i-1;
            }
            if(cnt <k){
                l = m+1;
            }else{
                r = m;
            }
        }
        return l;
    }

    public static void main(String[] args){
        int[] nums = {1,6,1};
        int k=3;
    }
}
