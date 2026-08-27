/*Full Binary Tree
Difficulty: EasyAccuracy: 63.6%Submissions: 26K+Points: 2Average Time: 20m
Given a Binary Tree, check whether it is a full binary tree or not. A full binary tree is a binary tree with either zero or two child nodes for each node.

Examples:

Input: root = [1, 2, 3, 4, 5]
                
Output: true
Explanation: Every node except leaf node has two children so it is a full tree.
Input: root = [1, 2, 3, 4]
              
Output: false
Explanation: Node 2 has only one child so this is not a full tree.
Constraints:
1 ≤ number of nodes ≤ 1000 */
/**
 * Pro_16_Full_Binary_Tree
 */
public class Pro_16_Full_Binary_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    boolean isFullTree(Node root) {
        // code here
        if(root == null) return true;
        if((root.left == null && root.right == null) || (root.left != null && root.right != null)) return isFullTree(root.left) && isFullTree(root.right);
        return false;
    }
}