class Solution {
    public String makeGood(String s) {
        
        if(s.length()==0){
            return "";
        }
        if(s.length()==1){
            return s;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
     if(!st.isEmpty() && Math.abs(st.peek() - ch) == 32) {
    st.pop();
} else {
    st.push(ch);
}
        }
StringBuilder str = new StringBuilder();

for(char ch : st) {
    str.append(ch);
}

String result = str.toString();

        return result;

    }
}