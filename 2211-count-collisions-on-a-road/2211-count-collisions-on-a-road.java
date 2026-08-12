class Solution {
    public int countCollisions(String directions) {

        int length = directions.length();
        int collide = 0;

        Stack<Character> st = new Stack<>();

        st.push(directions.charAt(0));

        for (int i = 1; i < length; i++) {

            char ch = directions.charAt(i);

            if (st.peek() == 'R' && ch == 'L') {

                while (!st.isEmpty() && st.peek() == 'R') {
                    st.pop();
                    collide++;
                }

                collide++;

                st.push('S');
            }

            else if (st.peek() == 'R' && ch == 'S') {

                while (!st.isEmpty() && st.peek() == 'R') {
                    st.pop();
                    collide++;
                }

                st.push('S');
            }

            else if (st.peek() == 'S' && ch == 'L') {

                collide++;
            }

            else {
                st.push(ch);
            }
        }

        return collide;
    }
}