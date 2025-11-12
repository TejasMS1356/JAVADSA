class Solution {
    public boolean isValid(String s) {
        char[] stack=new char[s.length()];
        int top=-1;
        char sym;
        for(int i=0;i<s.length();i++){
            sym=s.charAt(i);

            if(sym=='(' || sym=='{' || sym=='['){
                stack[++top]=sym;
            }
            else{
           
                if (top == -1) return false; 
                char open = stack[top--];
                if ((sym == ')' && open != '(') ||
                    (sym == '}' && open != '{') ||
                    (sym == ']' && open != '[')) {
                    return false;
            }

        }
    
       
        
        
    }
         return top == -1;
}
}
