package HashMap;
// 1497. Check If Array Pairs Are Divisible by k
import java.util.HashMap;

public class PairDivisiblebyK {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> remainderFreq = new HashMap<>();
        
        
        for (int num : arr) {
            int remainder = num % k;
            
            
            if (remainder < 0) {
                remainder += k;
            }
            
            remainderFreq.put(remainder, remainderFreq.getOrDefault(remainder, 0) + 1);
        }

       
        for (int num : arr) {
            int remainder = num % k;
            
            if (remainder < 0) {
                remainder += k;
            }
            
            
            if (remainder == 0) {
                if (remainderFreq.get(remainder) % 2 != 0) {
                    return false;
                }
            }
            
            else {
                int complement = k - remainder;
                if (!remainderFreq.getOrDefault(complement, 0).equals(remainderFreq.get(remainder))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
