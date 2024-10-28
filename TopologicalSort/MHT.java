package TopologicalSort;
import java.util.*;


public class MHT {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 0) return new ArrayList<>();
       if(n==1){
           return Collections.singletonList(0);
       }
        
      
          List<Set<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        graph.add(new HashSet<>());
    }
        
        for(int[] edge : edges){
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        List<Integer> leaves = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(graph.get(i).size() == 1){
                leaves.add(i);
            }
        }
        
        
        while(n>2){
            n-= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for(int leaf : leaves){
                
                int neighbour = graph.get(leaf).iterator().next();
                graph.get(neighbour).remove(leaf);
                if(graph.get(neighbour).size() == 1){
                    newLeaves.add(neighbour);
                }
            }
            
            leaves = newLeaves;
        }
        
        return leaves;
    }
}
