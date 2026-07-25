/*Middle of Stack
Solved
Difficulty: EasyAccuracy: 62.08%Submissions: 3K+Points: 2
Given a stack st[] of size n, find the middle element of the stack

Note: In case of even elements, return the middle at the bottom.

Examples:

Input: st[] = [1, 2, 3, 4, 5]
Output: 3
Explanation: The middle elements is 3.
Input: st[] = [1, 2, 3, 4]
Output: 2
Explanation: The two middle elements are 2 and 3. Since we need the middle element closer to the bottom, the answer is 2.
Constraints:
1 ≤ st.size() ≤ 105 */

import java.util.Stack;

public class Pro_13{
    public static void main(String[] args) {
    }
    public int stackMiddle(Stack<Integer> st) {
        int n = st.size();
        for(int i = 1;i <= n/2;i++) st.pop();
        if(st.empty()) return -1;
        return st.peek();
    }
}