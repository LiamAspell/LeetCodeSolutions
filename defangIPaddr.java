/*

Time Submitted: 01/31/2021 00:03
Status: Accepted
Runtime: 7ms
Memory: 37.3MB
Language: Java

*/

class Solution {
    public String defangIPaddr(String address) {
        String y = "";
        for(int i = 0; i < address.length(); i++){
            char x = address.charAt(i);
            if('.' == x){
             System.out.println(x);  
                y+= "[.]";
            }
            else{
                y += x;
            }
          }      
        return y;
    }
}