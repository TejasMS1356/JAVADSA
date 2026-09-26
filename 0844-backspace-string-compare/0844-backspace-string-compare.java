class Solution {
    public boolean backspaceCompare(String s, String t) {
        String go=check(s);
        String no=check(t);
        if(go.equals(no)){
            return true;
        }

        return false;
    }
    public String check(String u){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<u.length();i++){
            char ch=u.charAt(i);
            if(ch!='#'){
                st.push(ch);
            }
            else if(ch=='#' && !st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder str = new StringBuilder();

for(char chi : st) {
    str.append(chi);
}

String result = str.toString();
return result;

    }
}