/* Symmetric Tree
Difficulty: EasyAccuracy: 44.96%Submissions: 183K+Points: 2Average Time: 20m
Given the root of a binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself.


Note: A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

Examples:

Input: root = [10, 5, 5, 2, N, N, 2] 
   
Output: True
Explanation: As the left and right half of the above tree is mirror image, the tree is symmetric.
Input: root = [8, 4, 4, N, 6, N, 6]
   
Output: False
Explanation:  As the left and right half of the above tree is not the mirror image, the tree is not symmetric. 
Constraints:
0 ≤ number of nodes ≤ 2000
1 ≤ node->data ≤ 100*/
public class Pro_10_Symmetric_Tree {
    public static void main(String[] args) {
    }
    // public boolean isSymmetric(Node root) {
    //     // code here
    //     reverse_right(root.right);
    //     return isEqual(root.left,root.right);
    // }
    // void reverse_right(Node root){
    //     if(root == null) return;
    //     Node temp = root.left;
    //     root.left = root.right;
    //     root.right = temp;
    //     reverse_right(root.left);
    //     reverse_right(root.right);
    // }
    // boolean isEqual(Node r1,Node r2){
    //     if(r1 == null && r2 == null) return  true;
    //     if(r1 == null || r2 == null) return false;
    //     if(r1.data != r2.data) return false;
    //     return isEqual(r1.left,r2.left)&&isEqual(r1.right,r2.right);
    // }
    @SuppressWarnings("unused")
    boolean isSymmetric(Node root) {
        // code here
        return isMirror(root.left,root.right);
    }
    boolean isMirror(Node r1,Node r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        if(r1.val != r2.val) return false;
        return isMirror(r1.left,r2.right)&&isMirror(r1.right,r2.left);
    }
}
