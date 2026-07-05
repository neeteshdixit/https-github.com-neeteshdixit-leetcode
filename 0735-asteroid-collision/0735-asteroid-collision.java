class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int as : asteroids) {

            boolean destroyed = false;

            // Collision tabhi hogi jab
            // Stack Top -> Positive
            // Current -> Negative
            while (!st.isEmpty() && st.peek() > 0 && as < 0) {

                // Top asteroid bada hai
                if (Math.abs(st.peek()) > Math.abs(as)) {
                    destroyed = true;
                    break;
                }

                // Dono equal size ke hain
                else if (Math.abs(st.peek()) == Math.abs(as)) {
                    st.pop();
                    destroyed = true;
                    break;
                }

                // Current asteroid bada hai
                else {
                    st.pop();
                }
            }

            // Agar current asteroid destroy nahi hua
            if (!destroyed) {
                st.push(as);
            }
        }

        // Stack -> Array
        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}