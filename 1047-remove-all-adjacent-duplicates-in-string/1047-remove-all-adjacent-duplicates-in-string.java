class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char no=s.charAt(i);
            if(!st.isEmpty() && st.peek()==no){
                st.pop();

            }
            else {
                st.push(no);
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