package Amazon.Medium;
import java.util.*;
public class GroprAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String> >  map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(map.get(s) !=null){
                List<String> a=  map.get(s);
                a.add(str);
                map.put(s,a);
            }else{
                List<String> a = new ArrayList<>();
                a.add(str);
                map.put(s,a);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String> > x : map.entrySet()){
            ans.add(x.getValue());
        }
        return ans;
    }
}
