class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                if (!st.isEmpty()) {
                    res.append(c);
                }
                st.push(c);
            } else {
                st.pop();
                if (!st.isEmpty()) {
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}
                