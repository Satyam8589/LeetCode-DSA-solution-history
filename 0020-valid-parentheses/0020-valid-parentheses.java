class Solution {
    public boolean isValid(String s) {
        
        if (s.isEmpty()) {
            return true;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (st.isEmpty()) {
                    return false;
                }
                char peekEle = st.peek();

                if (peekEle == '(' && ch == ')' ||
                    peekEle == '{' && ch == '}' ||
                    peekEle == '[' && ch == ']' ) {
                        st.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}