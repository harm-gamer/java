// sum of Even number after Queries


// You are given an integer array nums and an array queries where queries[i] = [vali, indexi].

// For each query i, first, apply nums[indexi] = nums[indexi] + vali, then print the sum of the even values of nums.

// Return an integer array answer where answer[i] is the answer to the ith query.


public class EvenNumber {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
         for(int n:nums){
             if(n%2==0){
                 sum += n;
             }
         }
         
         int res[] = new int[nums.length];
         for(int i=0;i<nums.length;i++){
             int val = queries[i][0] ; int idx = queries[i][1]; int initial = nums[idx];
             if(initial%2==0) res[i] = (val + initial)%2==0 ?( sum+= val ):( sum -= initial);
             else res[i] = (val + initial) %2 ==0 ? (sum +=( val + initial)) : sum;
             nums[idx] += val;
         }
         return res;
     }
}
