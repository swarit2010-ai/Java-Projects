/* 84. Largest Rectangle in Histogram
Hard
Topics
premium lock icon
Companies
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4
 

Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104*/
import java.util.*;
public class Pro_16{
    public static void main(String[] args) {
    }
    public int largestRectangleArea(int[] heights) {
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
        // Using one array
        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> st2 = new Stack<>();
        // int[] nse = new int[heights.length];
        // int i = 0;
        // for(i = heights.length-1;i >= 0;i--){
        //     while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]) st2.pop();
        //     if(st2.isEmpty()) nse[i] = heights.length;
        //     else nse[i] = st2.peek();
        //     st2.push(i);
        // }
        // int max_area = Integer.MIN_VALUE;
        // for(i = 0;i < heights.length;i++){
        //     while(!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
        //     int nse_ele = nse[i];
        //     if(st.isEmpty())nse[i] = -1;
        //     else nse[i] = st.peek();
        //     st.push(i);
        //     int area = heights[i]*(nse_ele-nse[i]-1);
        //     if(area > max_area) max_area = area;
        // }
        // return max_area;
        // }
}