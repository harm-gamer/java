public class RotatedHalfPyramid{
    public static void main(String[] args){
        int n  =10;
        // strars
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
         
         // half pyramid with numbers

         for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
         }
    }
}