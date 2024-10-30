import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
       int[] v = new int[n+1];
        Arrays.fill(v,-1);
        for(int i=0;i<nums.length;i++){
            v[nums[i]] = nums[i];
        }
        for(int i=0;i<v.length;i++){
            if(v[i] == -1){
                return i;
            }
        }
        return -1;
    }
    public int  missingNumber2(int[] nums){
        int xor = nums.length;
        for(int i=0;i<nums.length;i++){
            xor= xor ^ i;
            xor = xor ^ nums[i];
        }

        return xor;
    }
    public static void main(String[] args){
        
    }
}