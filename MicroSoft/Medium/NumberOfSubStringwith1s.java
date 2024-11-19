package MicroSoft.Medium;

public class NumberOfSubStringwith1s {
    public int numSub(String s) {
        int mod = 1000000007;
        long ans =0;
        long count = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else{
                long add = (count*(count+1))/2;
                add = add%mod;
                ans = (add+ans)%mod;
                count =0;
            }
        }
        long add = count*(count+1)/2;
                add = add%mod;
                ans = (add+ans)%mod;
                count =0;
        
        return (int)ans;
    }
}