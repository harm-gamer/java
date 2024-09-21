public class LongestComminPrefix{
     public String longestCommonPrefix(String[] strs) {
        if(strs == null & strs.length==0){
            return " ";
        }
        
        String firstString = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(firstString) !=0){
                // trim from last index of firstString(prefix)
                firstString = firstString.substring(0,firstString.length()-1);
                    
                    if(firstString.isEmpty()){
                        return "";
                    }
            }
        }
        return firstString;
    }
   
}