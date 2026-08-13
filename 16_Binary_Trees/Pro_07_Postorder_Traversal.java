/* Postorder Traversal
Solved
Difficulty: EasyAccuracy: 74.96%Submissions: 157K+Points: 2Average Time: 15m
Given the root of a Binary Tree, return its Postorder Traversal.

Note: A postorder traversal first visits the left child (including its entire subtree), then visits the right child (including its entire subtree), and finally visits the node itself.

Examples:

Input: root = [19, 10, 8, 11, 13]

Output: [11, 13, 10, 8, 19]
Explanation: The postorder traversal of the given binary tree is [11, 13, 10, 8, 19].
Input: root = [11, 15, N, 7]
 
Output: [7, 15, 11]
Explanation: The postorder traversal of the given binary tree is [7, 15, 11].
Constraints:

1 ≤ no. of nodes in root ≤ 3*104
0 ≤ root.node->data ≤ 105*/
import java.util.ArrayList;

public class Pro_07_Postorder_Traversal {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        postorder(root,ans);
        return ans;
    }
    void postorder(Node root,ArrayList<Integer> ans){
        if(root == null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        ans.add(root.val);
    }
}
