/* Max Rectangle
Solved
Difficulty: HardAccuracy: 36.43%Submissions: 134K+Points: 8Average Time: 35m
Given a 2D binary matrix mat[][], where each cell contains either 0 or 1. Find the maximum area of a rectangle that can be formed using only 1's within the matrix.

Examples:

Input: mat[][] = [[0, 1, 1, 0], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 0, 0]]
Output: 8
Explanation: The largest rectangle of 1's highlighted in green, matching the area of 2 * 4 = 8.

Input: mat[][] = [[0, 1, 1], [1, 1, 1], [0, 1, 1]]
Output: 6
Explanation: The largest rectangle of 1's highlighted in green, matching the area of 3 * 2 = 6.

Constraints:
1 ≤ mat.size(), mat[i].size() ≤ 1000
0 ≤ mat[][] ≤ 1*/

import java.util.Stack;

public class Pro_17{
    public static void main(String[] args) {
    }
    public int maxArea(int mat[][]) {
        // code here
        for(int i = 1;i < mat.length;i++){
            for(int j = 0;j < mat[i].length;j++){
                if(mat[i][j] == 1) mat[i][j] = 1+mat[i-1][j];
            }
        }
        int ans = -1;
        for(int k = mat.length-1;k >= 0;k--){
            int[] arr = mat[k];
            int maximum = hist(arr);
            if(maximum > ans) ans = maximum;
        }
        return ans;
    }
    public int hist(int[] heights) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int[] nse = new int[heights.length];
        int i;
        for(i = heights.length-1;i >= 0;i--){
            while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]) st2.pop();
            if(st2.isEmpty()) nse[i] = heights.length;
            else nse[i] = st2.peek();
            st2.push(i);
        }
        int max_area = Integer.MIN_VALUE;
        for(i = 0;i < heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            int nse_ele = nse[i];
            if(st.isEmpty())nse[i] = -1;
            else nse[i] = st.peek();
            st.push(i);
            int area = heights[i]*(nse_ele-nse[i]-1);
            if(area > max_area) max_area = area;
        }
        return max_area;
    }
}