package Amazon.Medium;
import java.util.*;

public class GoodTimeToRob {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int size = security.length,cnt =0;
          List<Integer> ans = new ArrayList<>();
        if (size < 2 * time + 1) {
            return ans;  
        }
        int[] prefix = new int[size];
        int[] sufix = new int[size];
        
        for(int i=1;i<size;i++){
            if(security[i] <= security[i-1]){
                cnt++;
            }else{
                cnt =0;
            }
            prefix[i] = cnt;
        }
        for(int i=size-2;i>=0;i--){
            if(security[i]  <= security[i+1]){
                cnt++;
            }else{
                cnt =0;
            }
            sufix[i] = cnt;
        }
        
        
        for(int i=time;i<size-time;i++){
            if(prefix[i] >= time && sufix[i] >= time){
                ans.add(i);
            }
        }
        
        return ans;
    }
}
