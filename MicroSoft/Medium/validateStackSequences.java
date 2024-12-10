package MicroSoft.Medium;
import java.util.*;

public class validateStackSequences{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int n = pushed.length;
        int j=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&& popped[j] == s.peek()){
                s.pop();
                j++;
            }
            s.push(pushed[i]);
        } 
         while(!s.isEmpty()&& popped[j] == s.peek()){
                s.pop();
                j++;
            }
        return s.isEmpty() && j==n;
    }
}