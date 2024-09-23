import java.util.*;
class Solution {
    public int gcd(int dx,int dy){
        while(dy!=0){
            int temp = dy;
            dy = dx % dy;
             dx = temp;
        }
        return Math.abs(dx);
    }
    public int maxPoints(int[][] points) {
       if(points.length<2){
           return 1;
       }
      int maxcount = 0;
        for(int i=0;i<points.length;i++){
            HashMap<String,Integer> map = new HashMap<>();
            int duplicate = 1;
            for(int j=0;j<points.length;j++){
                if(i==j){
                    continue;
                }
                
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                
                if(dx==0 && dy==0){
                    duplicate++;
                    continue;
                }
                int gcd = gcd(dx,dy);
                
                dy /= gcd;
                dx /= gcd;
                
                if(dx<0){
                    dx = -dx;
                    dy = -dy;
                }else if(dx==0){
                    dy = Math.abs(dy);
                }
                
                String slope = dx + "/" + dy;
                map.put(slope, map.getOrDefault(slope,0)+1);
            }
            int currentMax = duplicate;
            for(int count : map.values()){
                currentMax = Math.max(currentMax,count+duplicate);
            }
            maxcount = Math.max(currentMax,maxcount);
        }
        return maxcount;
    }
}