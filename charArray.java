//Solved 28/10/2020 Author Liam Aspell
class charArray {
    public static void reverseArray(char[] s) {
        
        
        
        char[] r = new char [s.length];
        int x = s.length;
        int y = s.length;
        for(int i = 0; i < x ; i++){
            r[i] = s[y - 1];
            y--;
           
        }

        for(int i = 0; i < x; i++){
            s[i] = r[i];
        }
    }



    public static void main(String[] args){
        //char [] s = new char[5];
        char [] s = {'a','b','c','d','e'};

        reverseArray(s);
        
    }
}