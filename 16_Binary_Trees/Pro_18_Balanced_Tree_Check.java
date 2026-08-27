/* Balanced Tree Check
Difficulty: EasyAccuracy: 43.15%Submissions: 371K+Points: 2Average Time: 20m
Given the root of a binary tree, determine if it is height-balanced or not.

Note: A binary tree is considered height-balanced if the absolute difference in heights of the left and right subtrees is at most 1 for every node in the tree.

Examples:

Input: root = [10, 20, 30, 40, 60]

Output: true 
Explanation: The height difference between the left and right subtrees at all nodes is at most 1. Hence, the tree is balanced.
Input: root = [1, 2, 3, 4, N, N, N, 5] 

Output: false
Explanation: The height difference between the left and right subtrees at node 2 is 2, which exceeds 1. Hence, the tree is not balanced.
Constraints:

1 ≤ size of binary tree, node.data ≤ 105*/
public class Pro_18_Balanced_Tree_Check {
    public static void main(String[] args) {
    }
    /*
    public boolean isBalanced(Node root) {
        // code here
        if(root == null) return true;
        int l1 = level(root.left);
        int l2 = level(root.right);
        if (Math.abs(l1-l2) <= 1){
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        return false;
    }
    int level(Node root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    */
    static boolean flag;
    @SuppressWarnings("unused")
    boolean isBalanced(Node root) {
        // code here
        if(root == null) return true;
        flag = true;
        level(root);
        return flag;
    }
    int level(Node root){
        if(root == null) return 0;
        int lright = level(root.right);
        int lleft = level(root.left);
        if(Math.abs(lleft-lright) > 1) {
            flag = false;
            return -1; // to decrease TnS
        }
        return 1+Math.max(lright,lleft);
    }
}
