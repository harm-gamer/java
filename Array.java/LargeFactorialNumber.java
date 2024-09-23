
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
public class LargeFactorialNumber {
    
    public static ArrayList<Integer> factorial(int N) {
        // code here
        BigInteger factorial = BigInteger.ONE;
        for(int i=2;i<=N;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        String factorialstr = factorial.toString();
        
        ArrayList<Integer> digits = new ArrayList<>();
        
        for(char c : factorialstr.toCharArray()){
            digits.add(Character.getNumericValue(c));

        }
        return digits;
    }

}
