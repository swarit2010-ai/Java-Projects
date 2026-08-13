/*Size of Binary Tree
Solved
Difficulty: BasicAccuracy: 82.91%Submissions: 83K+Points: 1
Given the root of a binary tree, return the size of the tree. The size of a binary tree is the total number of nodes in the tree.

Examples:

Input:      

Output:  3
Explanation: There are 3 nodes in the given binary tree, so its size is 3.
Input:

Output: 6
Explanation: There are 6 nodes in the given binary tree, so its size is 6.
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105 */
public class Pro_02_Size_Of_BT {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int getSize(Node root) {
        if(root == null) return 0;
        return 1+getSize(root.left)+getSize(root.right);
    }
}
