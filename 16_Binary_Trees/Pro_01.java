/*Preorder Traversal
Solved
Difficulty: BasicAccuracy: 62.73%Submissions: 214K+Points: 1Average Time: 15m
Given the root of a binary tree, return its preorder traversal.

Note: A preorder traversal first visits the node, then visits the left child (including its entire subtree), and finally visits the right child (including its entire subtree).

Examples:

Input: root = [1, 4, N, 4, 2]
   
Output: [1, 4, 4, 2]
Explanation: The preorder traversal of the given binary tree is [1, 4, 4, 2]
Input: root = [6, 3, 2, N, 1, 2, N]
    
Output: [6, 3, 1, 2, 2] 
Explanation: The preorder traversal of the given binary tree is [6, 3, 1, 2, 2] 

Constraints:

1 ≤ no. of nodes in root ≤ 3*104
0 ≤ root.node->data ≤ 105 */

import java.util.ArrayList;

public class Pro_01 {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> ans = new ArrayList<>();
        insert(root,ans);
        return ans;
    }
    void insert(Node root,ArrayList<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        insert(root.left,ans);
        insert(root.right,ans);
    }
}
