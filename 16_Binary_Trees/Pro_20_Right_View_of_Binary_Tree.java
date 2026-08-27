/* Right View of Binary Tree
Difficulty: EasyAccuracy: 65.18%Submissions: 218K+Points: 2Average Time: 20m
Given the root of a binary Tree. Return the right view of the binary tree. The right view of a Binary Tree is the set of nodes visible when the tree is viewed from the right side.

Examples :

Input: root = [1, 2, 3, N, N, 4, 5]
     2_2
Output: [1, 3, 5]
Input: root = [1, 2, 3, 4, N, N, N, N, 5]
     Right-view-in-binary-tree-1
Output: [1, 3, 4, 5]
Input: root = [3]    
  
Output: [3]
Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ node->val ≤ 105*/

import java.util.ArrayList;

public class Pro_20_Right_View_of_Binary_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        task(root,0,ans);
        return ans;
    }
    void task(Node root,int curr,ArrayList<Integer> ans){
        if(root == null) return;
        if(curr >= ans.size()) ans.add(root.val);
        else ans.set(curr,root.val);
        task(root.left,curr+1,ans);
        task(root.right,curr+1,ans);
    }
}
