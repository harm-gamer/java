public class TrappingWater {
    public static int trap(int[] height) {
        int lMax =0;
         int RMax =0;
         int total =0;
         int l=0;
         int r = height.length -1;
         while(l<r){
             if(height[l] <= height[r]){
                 if(lMax > height[l]){
                     total += lMax - height[l];
                 }else{
                     
                     lMax = height[l];
                     l=l+1;
                 }
             }else{
                 if(RMax > height[r]){
                    total += RMax -height[r];
                 }else{
                   RMax = height[r];
                     r = r-1;
                 }
             }
         }
         return total;
     }
     public static void main(String[] args){
        int array[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int total = trap(array);
        System.out.print(total);
     }
}
