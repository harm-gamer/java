import java.util.*;
public class invertedPattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int number  = sc.nextInt();
           
        for(int i=number;i>=1;i--){
            for(int j=1;j<=i;j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}