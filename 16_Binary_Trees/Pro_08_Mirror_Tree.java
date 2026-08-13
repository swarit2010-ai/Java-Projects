/* Mirror Tree
Solved
Difficulty: EasyAccuracy: 72.67%Submissions: 250K+Points: 2Average Time: 20m
Given the root of a binary tree, convert the binary tree to its Mirror tree.

Note: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

Examples:

Input: root = [1, 2, 3, N, N, 4]
Output: [1, 3, 2, N, 4]
Explanation: 

In the inverted tree, every non-leaf node has its left and right child interchanged.
Input: root = [1, 2, 3, 4, 5]
Output: [1, 3, 2, N, N, 5, 4]
Explanation:

In the inverted tree, every non-leaf node has its left and right child interchanged.
Constraints:

1 ≤ no. of nodes in root ≤ 104
1 ≤ root.node->data ≤ 105*/
public class Pro_08_Mirror_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    void mirror(Node root) {
        // code here
        if(root == null) return;
        mirror(root.left);
        mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
