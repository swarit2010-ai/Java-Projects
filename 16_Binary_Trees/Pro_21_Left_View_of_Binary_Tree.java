/*Left View of Binary Tree
Solved
Difficulty: EasyAccuracy: 33.74%Submissions: 615K+Points: 2Average Time: 20m
Given the root of a binary tree. Return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.

Note: If the tree is empty, return an empty list.

Examples :

Input: root = [1, 2, 3, 4, 5, N, N] 
 
Output:[1, 2, 4]
Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]

Output: [1, 2, 4, 5]
Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

Constraints:
0 ≤ number of nodes ≤ 105
0 ≤ node -> data ≤ 105 */

import java.util.ArrayList;

public class Pro_21_Left_View_of_Binary_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        task(root,0,ans);
        return ans;
    }
    void task(Node root,int curr,ArrayList<Integer> ans){
        if(root == null) return;
        if(curr >= ans.size()) ans.add(root.val);
        else ans.set(curr,root.val);
        task(root.right,curr+1,ans);
        task(root.left,curr+1,ans);
    }
}
