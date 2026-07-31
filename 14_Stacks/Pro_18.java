/*155. Min Stack
Medium
Topics
premium lock icon
Companies
Hint
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int value) pushes the element value onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.

 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin. */

import java.util.Stack;
class MinStack {
        Stack<Long> st;
        long min;
        public MinStack() {
            st = new Stack<>();
            min = Long.MAX_VALUE;
        }
        public void push(int val) {
            long value = val;
            if (st.isEmpty()) {
                min = value;
                st.push(value);
            } else if (value >= min) st.push(value);
            else {
                st.push(2 * value - min);
                min = value;
            }
        }
        public void pop() {
            if (st.isEmpty()) return;
            long top = st.peek();
            if (top < min) {
                min = 2 * min - top;
            }
            st.pop();
        }
        public int top() {
            long top = st.peek();
            if (top < min) {
                return (int) min;
            }
            return (int) top;
        }
        public int getMin() {
            return (int) min;
        }
    }
public class Pro_18{
    public static void main(String[] args) {
        MinStack stk = new MinStack();
        System.out.println(stk);
    }
}