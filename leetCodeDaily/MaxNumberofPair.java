package leetCodeDaily;

import java.util.HashMap;

public class MaxNumberofPair {
     public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
int operation=0;
        for(int num : nums){
            int complement = k - num;

            if(map.getOrDefault(complement ,0) > 0){
                operation++;
                map.put(complement,map.get(complement) -1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return operation;
    }
}
