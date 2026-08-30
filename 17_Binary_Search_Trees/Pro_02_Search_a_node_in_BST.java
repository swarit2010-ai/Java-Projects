/*Search a node in BST
Difficulty: EasyAccuracy: 68.46%Submissions: 123K+Points: 2Average Time: 15m
Given the root of a Binary Search Tree and a node value key, return true if the node with value key is present in the BST; otherwise, return false.

Examples:

Input: root = [6, 2, 8, N, N, 7, 9], key = 8
    
Output: true
Explanation: 8 is present in the BST as right child of root.
Input: root = [16, 12, 18, 10, N, 17, 19], key = 14
    
Output: false
Explanation: 14 is not present in the BST
Constraints:
1 ≤ number of nodes ≤ 3*104
1 ≤ node->val, key ≤ 109 */
public class Pro_02_Search_a_node_in_BST {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    boolean search(Node root, int key) {
        // code here
        if(root == null) return false;
        if(root.val == key) return true;
        if(root.val > key) return search(root.left,key);
        return search(root.right,key);
    }
}
