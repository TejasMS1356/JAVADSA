bool isValid(char* s) {
     int top=-1;
        char sym;
        int stack[strlen(s)];
        for(int i=0;i<strlen(s);i++){
            sym=s[i];

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
        return top==-1;
}
        
    
