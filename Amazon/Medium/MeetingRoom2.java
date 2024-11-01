package Amazon.Medium;
import java.util.*;
 class MeetingRoom2 {
    public static int MinimumNuMber(int[][] arr){
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        int ans =0, count = 0;

        for(int[] a : arr){
            int start = a[0], end = a[1];
            tmap.put(start,tmap.getOrDefault(start,0 ) +1);
            tmap.put(end ,tmap.getOrDefault(end, 0)-1);
        }

        for(int integer : tmap.keySet()){
            count += tmap.get(integer);
            ans = Math.max(count,ans);
        }

        return ans;
    }
    public static void main(String[] args){
        int[][] arr = new int[3][2];
        arr[0][0] = 0;
        arr[0][1] = 30;
        arr[1][0] = 5;
        arr[1][1] = 10;
        arr[2][0] = 15;
        arr[2][1] = 20;

        System.out.print(MinimumNuMber(arr));
    }
}
