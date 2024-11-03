package Amazon.Medium;

public class MaximumNumberofSwapstoMakeAlternative {
    public int minSwaps(String s) {
        int  count0 =0,count1 =0,max0 = 0,max1 = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='0'){
                count0++;
                
            }
            else{
                count1++;
            }
        }
        if(Math.abs(count0 - count1) > 1){
            return -1;
        }
        for(int i=0;i<s.length();i+=2){
            if(s.charAt(i) !='0'){
                max0++;
            }else{
                max1++;
            }
        }
        return count0 == count1 ?  Math.min(max0,max1) : count0 > count1 ? max0 : max1; 
    }
}
