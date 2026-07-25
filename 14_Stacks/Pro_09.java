/*Reverse Array Using Stack
Difficulty: BasicAccuracy: 81.15%Submissions: 2K+Points: 1
Given an array arr[], reverse the array elements in-place by using a stack.

Examples :

Input: arr[] = [1, 2, 3, 4, 5]
Output: 5 4 3 2 1
Explanation: After the reverse, array will look like [5, 4, 3, 2, 1].
Input: arr[] = [1]
Output: 1
Explanation: After the reverse, array will look like [1].
Constraints:
1 ≤ arr.size() ≤ 105*/

import java.util.Stack;

public class Pro_09{
    public static void main(String[] args) {
    }
    public void reverseArray(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < arr.length;i++) st.push(arr[i]);
        int k = 0;
        while(!st.isEmpty()){
            arr[k++] = st.pop();
        }
    }
}