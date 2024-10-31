package Amazon.Medium;
import java.util.*;
public class FindKclosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for(int integer : arr){
            if(k>0){
                minheap.offer(integer);
                k--;
            }else if(Math.abs(minheap.peek() - x) > Math.abs(integer -x)){
                minheap.poll();
                minheap.offer(integer);
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        while(!minheap.isEmpty()){
            ans.add(minheap.poll());
            
        }
        
        return ans;
    }
}
