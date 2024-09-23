// print row in a pascal triangle
import java.util.*;
public class PascalTriangle2 {

    public static List<Integer> getrow(int n){
         List<Integer> li = new ArrayList<>();
            li.add(1);
            for(int i=1;i<n;i++){
                for(int j=i-1;j>0;j--){
                    li.set(j,li.get(j)+li.get(j-1));
                }
            }
        return li;
    }
}