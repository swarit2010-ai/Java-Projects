/* Interleave the First Half of the Queue with Second Half
Solved
Difficulty: MediumAccuracy: 62.41%Submissions: 32K+Points: 4Average Time: 20m
Given a queue q of even size, rearrange the queue by interleaving its first half with the second half.

Interleaving is the process of mixing two sequences by alternating their elements while preserving their relative order.
In other words, Interleaving means place the first element from the first half and then first element from the 2nd half and again second element from the first half and then second element from the 2nd half and so on.

Examples:

Input: q = [2, 4, 3, 1]
Output: [2, 3, 4, 1]
Explanation: We place the first element of the first half 2 and after that place the first element of second half 3 and after that repeat the same process one more time so the resulting queue will be [2, 3, 4, 1]
Input: q = [3, 5]
Output: [3, 5]
Explanation: We place the first element of the first half 3 and first element of the second half 5 so the resulting queue is [3, 5]
Constraints:

1 ≤ q.size() ≤ 103
1 ≤ q[i] ≤ 105*/

import java.util.Queue;
import java.util.Stack;

public class Pro_09 {
    public static void main(String[] args) {
    }
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        // Array approach
        // int[] arr = new int[q.size()];
        // int i = 0;
        // while(!q.isEmpty()) arr[i++] = q.remove();
        // i = 0;
        // int j = arr.length/2;
        // while(j < arr.length){
        //     q.add(arr[i++]);
        //     q.add(arr[j++]);
        // }
        // Queue approach
        // int n = q.size();
        // Stack<Integer> help = new Stack<>();
        // for(int i = 1;i <= n/2;i++) help.add(q.remove());
        // for(int j = 1;j <= n/2;j++){
        //     q.add(help.remove());
        //     q.add(q.remove());
        // }
        // One stack approach
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i = 1;i <= n/2;i++) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());
        for(int j = 1;j <= n/2;j++) st.push(q.remove());
        while(!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }
        while(!q.isEmpty()) st.push(q.remove());
        while(!st.isEmpty()) q.add(st.pop());
    }
}
