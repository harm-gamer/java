package leetCodeDaily;

public class MoveZeores {
   static public void moveZeroes(int[] nums) {
      
        int i =0;
  
        for(int j=0;j<nums.length;j++){
          if(nums[j]!=0){
              nums[i] = nums[j];
              i++;
          }
        }
  
        for(int j=i;j<nums.length;j++){
          nums[j] = 0;
        }
        
      }

      public static void main(String[] args){
        int nums[] ={ 1,0,3,0,5};
        moveZeroes(nums);
      }
}
