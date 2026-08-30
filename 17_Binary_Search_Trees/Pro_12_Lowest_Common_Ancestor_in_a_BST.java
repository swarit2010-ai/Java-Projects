/* Lowest Common Ancestor in a BST
Difficulty: MediumAccuracy: 65.2%Submissions: 191K+Points: 4Average Time: 20m
Given the root of a Binary Search Tree (BST) with unique node values and two nodes n1 and n2 (n1 != n2), find their Lowest Common Ancestor (LCA).

The Lowest Common Ancestor (LCA) of two nodes is defined as the deepest node in the tree that has both n1 and n2 as descendants, where a node can be a descendant of itself.

Examples:

Input: root = [5, 4, 6, 3, N, N, 7, N, N, N, 8], n1->val = 7, n2->val = 8
       
Output: 7
Explanation: 7 is the lowest node that has both 7 and 8 as descendants.
Input: root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], n1->val = 8, n2->val = 14
 
Output: 8
Explanation: 8 is the lowest node that has both 8 and 14 as descendants.
Input: root = [1, 2, 3], n1->val = 2, n2->val = 3

Output: 1
Explanation: 1 is the lowest node that has both 2 and 3 as descendants.
Constraints:

1 ≤ size of binary tree ≤ 105
1 ≤ node.val, n1->val, n2->val ≤ 106*/
public class Pro_12_Lowest_Common_Ancestor_in_a_BST {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    Node findLCA(Node root, Node n1, Node n2) {
        if(root.val < n1.val && root.val < n2.val) return findLCA(root.right,n1,n2);
        if(root.val > n1.val && root.val > n2.val) return findLCA(root.left,n1,n2);
        return root;
    }
}
