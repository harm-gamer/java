package MicroSoft.Easy;

//Given a valid (IPv4) IP address, return a defanged version of that IP address.

//A defanged IP address replaces every period "." with "[.]".

public class DefangingIP {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<address.length();i++){
            if(address.charAt(i) =='.'){
                str.append("[.]");
            }else{
                str.append(address.charAt(i));
            }
        }
         return str.toString();   
    }
}
