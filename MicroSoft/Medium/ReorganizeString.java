package MicroSoft.Medium;
import java.util.*;
public class ReorganizeString {
    
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a'] = freq[c-'a']+1;
        }
        
        var pq = new PriorityQueue<int[]>((a,b) -> Integer.compare(b[1],a[1]));
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.offer(new int[]{i+'a',freq[i]});
  G          }
        }
        
        StringBuilder str = new StringBuilder();
        int[] block = pq.poll();
        str.append((char)block[0]);
        block[1]--;
        
        while(!pq.isEmpty()){
            int[] next = pq.poll();
            str.append((char)next[0]);
            next[1]--;
            if(block[1]>0){
                pq.offer(block);
            }
            block=next;
        }
        
        if(block[1]>0){
            return "";
        }
        return str.toString();
    }
}
