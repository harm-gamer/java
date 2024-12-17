package Google.Easy;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
     public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int count = 0;
        for(int i : nums){
            
            if(!set.contains(i-1)){
                int dummy = 1;
                int num = i+1;
                
                while(set.contains(num)){
                    dummy++;
                    num++;
                }
                count = Math.max(dummy,count);
            }
            
        }
        
        return count;
    }
}
