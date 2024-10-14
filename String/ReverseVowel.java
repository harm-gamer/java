package String;
// Reverse Vowel in String
public class ReverseVowel {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        
        int st = 0,e=arr.length-1;
        
        while(st<e){
            if(isVowel(arr[st]) && isVowel(arr[e])){
                char temp = arr[st];
                arr[st] = arr[e];
                arr[e] = temp;
                st++;
                e--;
            }else{
                if(isVowel(arr[st])){
                    e--;
                }else{
                    st++;
                }
            }
            
           
        }
         return new String(arr);
    }
    public boolean isVowel(char c){
        if( c == 'a' || c=='e' || c=='i' || c=='o' || c == 'u' ||
          c == 'A' || c=='E' || c== 'I' || c == 'O' || c == 'U'){
            return true;
        }
        
        return false;
    }
}
