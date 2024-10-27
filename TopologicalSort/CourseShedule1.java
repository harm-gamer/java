package TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseShedule1 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

       List<List<Integer>> graph = new ArrayList<>(numCourses);
        
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        
        
        int[] inDegree = new int[numCourses];
        
        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int preCourse = prerequisite[1];
             inDegree[course]++;
              graph.get(preCourse).add(course);
        }
        
        Queue<Integer> q = new LinkedList<>();
        
         for(int i=0;i<inDegree.length;i++){
             if(inDegree[i] == 0){
                 q.add(i);
             }
         }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        while(!q.isEmpty()){
            int curr = q.remove();
            res.add(curr);
                
                for(int dependencies : graph.get(curr)){
                    inDegree[dependencies]--;
                    if(inDegree[dependencies] == 0){
                        q.add(dependencies);
                    }
                }
        }
        
        if(res.size() == numCourses){
           
            return true;
        }else{
            return false;
        }
        
    }
}
