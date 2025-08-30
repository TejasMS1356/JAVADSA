public class stb {
    public static void main(String[] args) {
        //string builder is used to modify the string ,we cannot modify string but we can create new one
        StringBuilder b= new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            // System.out.println(ch);
            b.append(ch);
           
    
         }
         System.out.println(b.toString());
    }
    
}
