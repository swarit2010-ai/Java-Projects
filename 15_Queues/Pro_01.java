/*Queue Push & Pop
Solved
Difficulty: BasicAccuracy: 74.53%Submissions: 28K+Points: 1
Given an array arr[], implement the functions:
fillQ(): Enqueue all elements of the array into a queue and return the queue.
emptyQ(): Dequeue all elements from the queue and print them in a single line, separated by spaces, followed by a newline.

Example 1:

Input: arr[] = [1, 2, 3, 4, 5] 
Output: [1, 2, 3, 4, 5] 
Input: arr[] = [1, 6, 43, 1, 2, 0, 5]
Output: [1, 6, 43, 1, 2, 0, 5]
Constraints:
1 ≤ arr[i] ≤ 103 */

import java.util.LinkedList;
import java.util.Queue;

public class Pro_01 {
    public static void main(String[] args) {
    }
    public Queue<Integer> fillQ(int[] arr) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i < arr.length;i++){
            q.add(arr[i]);
        }
        return q;
    }

    public void emptyQ(Queue<Integer> q) {
        while(!q.isEmpty()) System.out.print(q.remove() + " ");
        System.out.println();
        // code here
    }
}
