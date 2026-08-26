/*Complete Binary Tree Traversal with Array Input
Difficulty: MediumAccuracy: 46.62%Submissions: 22K+Points: 4
Given an integer array arr[] representing the nodes of a Complete Binary Tree in level order traversal, return the nodes at each level in sorted ascending order.

For every level of the binary tree, sort the values present at that level independently and return the resulting levels as a 2D array, where the i-th row contains the sorted values of the i-th level.

Examples:

Input: arr[] = [7, 6, 5, 4, 3, 2, 1]
Output: [[7], [5, 6], [1, 2, 3, 4]]
Explanation: The complete binary tree formed from the given level order traversal is:   
        
The nodes at each level after sorting are:
Level 0: [7]
Level 1: [5, 6]
Level 2: [1, 2, 3, 4]
Input: arr[] = [7, 16, 1, 4, 13]
Output: [[7], [1, 16], [4, 13]]
Explanation: The complete binary tree formed from the given level order traversal is:      

The nodes at each level after sorting are:
Level 0: [7]
Level 1: [1, 16]
Level 2: [4, 13]
Constraints:

1 ≤ arr.size() ≤ 104
1 ≤ arr[i] ≤ 109
 */

import java.util.ArrayList;
import java.util.Collections;

public class Pro_14_Complete_Binary_Tree_Traversal_with_Array_Input {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i = 0;
        int p = 0;
        while(i < arr.length){
            ArrayList<Integer> run = new ArrayList<>();
            for(int j = 1;i < arr.length && j <= (int)Math.pow(2,p);j++){
                run.add(arr[i++]);
            }
            Collections.sort(run);
            ans.add(new ArrayList<>(run));
            p++;
        }
        return ans;
    }
}
