/*LCA in Binary Tree
Difficulty: MediumAccuracy: 52.85%Submissions: 217K+Points: 4Average Time: 20m
Given the root of a binary tree with all unique values and two nodes value, n1 and n2.

Find the lowest common ancestor of the given two nodes. Both node values are always present in the Binary Tree.

Note: LCA is the first common ancestor of both the nodes n1 and n2 from bottom of tree.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7], n1 = 4, n2 = 5    

Output: 2
Explanation: LCA of 4 and 5 is 2.

Input: root = [1, 2, 3, 4, 5, 6, 7, N, N, N, N, 8], n1 = 7, n2 = 8

Output: 3
Explanation: LCA of 7 and 8 is 3.
 
Constraints:

1 ≤ size of binary tree, node.val ≤ 105 */
public class Pro_22_LCA_in_Binary_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null) return null;
        if(root.val == n1 || root.val == n2) return root;
        boolean check1 = present(root.left,n1);
        boolean check2 = present(root.right,n2);
        if(check1 && !check2) return lca(root.left,n1,n2);
        else if(!check1 && check2) return lca(root.right,n1,n2);
        return root;
    }
    boolean present(Node root,int n){
        if(root == null) return false;
        if(root.val != n) return present(root.left,n)||present(root.right,n);
        return true;
    }
}
