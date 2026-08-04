/*First Negative in Windows of Size K
Difficulty: MediumAccuracy: 48.61%Submissions: 245K+Points: 4Average Time: 15m
Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

Note: If a window does not contain a negative integer, then return 0 for that window.

Examples:

Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
Explanation:
Window [-8, 2] First negative integer is -8.
Window [2, 3] No negative integers, output is 0.
Window [3, -6] First negative integer is -6.
Window [-6, 10] First negative integer is -6.
Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
Output: [-1, -1, -7, -15, -15, 0] 
Explanation:
Window [12, -1, -7] First negative integer is -1.
Window [-1, -7, 8] First negative integer is -1.
Window [-7, 8, -15] First negative integer is -7.
Window [8, -15, 30] First negative integer is -15.
Window [-15, 30, 16] First negative integer is -15.
Window [30, 16, 28] No negative integers, output is 0.
Input: arr[] = [12, 1, 3, 5] , k = 3
Output: [0, 0] 
Explanation:
Window [12, 1, 3] No negative integers, output is 0.
Window [1, 3, 5] No negative integers, output is 0.

Constraints:
1 <= arr.size() <= 106
-105 <= arr[i] <= 105
1 <= k <= arr.size() */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro_10 {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        // O(n.k) Time complexity:
        // List<Integer> ans = new ArrayList<>();
        // Queue<Integer> q = new LinkedList<>();
        // int i;
        // for(i = 0;i < k;i++) q.add(arr[i]);
        // while(i <= arr.length){
        //     int first = 0;
        //     for(int j = 1;j <= k;j++){
        //         if(q.peek() < 0 && first == 0) first = q.peek();
        //         q.add(q.remove());
        //     }
        //     if(i < arr.length){
        //         q.add(arr[i++]);
        //         q.remove();
        //     }
        //     else i++;
        //     ans.add(first);
        // }
        // return ans;
        // O(N) Time complexity:
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int i;
        for(i = 0;i < arr.length;i++){
            if(arr[i] < 0) q.add(i);
        }
        for(i = 0;i < arr.length-k+1;i++){
            while(!q.isEmpty() && q.peek() < i) q.remove();
            if(q.isEmpty() || q.peek() > i+k-1) ans.add(0);
            else ans.add(arr[q.peek()]);
        }
        return ans;
    }
}
