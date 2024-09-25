import java.util.*;
public class reverse{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int number  = sc.nextInt();
           
         while(number>0){
            int ld = number%10;
            System.out.print(ld);
            number  /=10;
         }
    }
}