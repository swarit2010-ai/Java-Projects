/*Paths from Root with Sum
Difficulty: MediumAccuracy: 55.0%Submissions: 43K+Points: 4
Given a binary tree and an integer s, print all paths starting from the root such that the sum of the node values along each path equals s.

A path does not necessarily have to end at a leaf node.

Examples:

Input : s = 8, root[] = [1, 20, 3, N, N, 4, 15, 6, N, N, N, N, N]
             
Output : [[1, 3, 4]]
Explanation : Sum of path 1, 3, 4 = 8. 
      
Input : s = 38, root[] = [10, 28, 13, N, N, 14, 15, 21, 22, 23, 24, N, N, N, N, N, N, N, N]
        

Output : [[10, 28], [10, 13, 15]] 
Explanation : Sum of path 10, 28 = 38 and Sum of path 10, 13, 15 = 38.
        
Constraints :
1 ≤ n ≤ 2*103, where n is the number of nodes in the binary tree
-103 ≤ s ≤ 103
-103 ≤ Node.value ≤ 103 */

import java.util.ArrayList;

public class Pro_25_Paths_from_Root_with_Sum {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        // code here
        @SuppressWarnings("Convert2Diamond")
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        paths(root,ans,new ArrayList<>(),sum,0);
        return ans;
    }
    void paths(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> run,int sum,int curr){
        if(root == null) return;
        curr += root.val;
        run.add(root.val);
        if(curr == sum) ans.add(new ArrayList<>(run));
        paths(root.left,ans,run,sum,curr);
        paths(root.right,ans,run,sum,curr);
        run.remove(run.size()-1);
    }
}
