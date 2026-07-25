/*Array to Stack
Difficulty: BasicAccuracy: 72.42%Submissions: 36K+Points: 1
Given an integer array arr[], push the elements of the array into a stack and then print them while popping.
Note: No need to print extra line after printing the stack elements.

Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: 5 4 3 2 1
Explanation: Elements are pushed and then popped from the top of the stack in the order 5, 4, 3, 2, 1.
Input: arr = [1, 6, 43, 1, 2, 0, 5]
Output: 5 0 2 1 43 6 1

Constraints:

1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105 */

import java.util.Stack;

public class Pro_10{
    public static void main(String[] args) {
    }
    public static Stack<Integer> push(int arr[]) {
        
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < arr.length;i++){
            st.push(arr[i]);
        }
        return st;
    }

    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> s) {
        // code here
        while(!s.isEmpty()) System.out.print(s.pop() + " ");
    }
}