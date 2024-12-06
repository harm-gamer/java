package MicroSoft.Easy;

import java.util.*;

public class GenerateParenthesis {
    public void helper(List<String> ans,int Ocount,int Ccount,String str,int n){
        if(Ocount == n && Ccount == n){
            ans.add(str);
        }
        else{
        if(Ocount>Ccount){
            helper(ans,Ocount,Ccount+1,str+")",n);
        }
            if(Ocount<n){
                helper(ans,Ocount+1,Ccount,str+"(",n);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
        int openCount = 0;
        int closeCount = 0;
        String str = "";
        helper(ans,openCount,closeCount,str,n);
        return ans;
    }
}
