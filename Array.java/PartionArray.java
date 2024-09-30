public class PartionArray {
    public int partition(int nums[]){
        int max = 0;
        for(int i=0;i<nums.length;i+=2){
           max += nums[i];
        }

        return max;
    }
}
