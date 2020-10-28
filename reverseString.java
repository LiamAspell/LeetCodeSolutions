/*
In Progress 28/10/2020.

Your input
"Let's take LeetCode contest"
Output
"tsetnoc edoCteeL ekat s'teL"
Expected
"s'teL ekat edoCteeL tsetnoc"

*/


public class reverseString {

    public static String reverseWords(String s) {
        int x = s.length();
        int y = s.length();
        String r = new String("");
        
        for(int i = x; i > 0; i--){
            r += s.charAt(y -1);
            y--;
        }

        
        
        return r;
    }


    public static void main(String []args){
        String s = "Let's take LeetCode contest";
        reverseWords(s);
    }
}
