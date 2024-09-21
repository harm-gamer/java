public class HappyNumber{
    public String isHappy(int n) {
 while(n!=1 && !seen.contains(n)){
           
            seen.add(n);
            n= getNext(n);
                
        }
        return n==1;
    }
    public int getNext(int n){
         int totalsum =0;
         while(n!=0){
            int ld = n%10;
            totalsum += Math.pow(ld,2);
            n /= 10;
        }
        return totalsum;
    }
}
    
