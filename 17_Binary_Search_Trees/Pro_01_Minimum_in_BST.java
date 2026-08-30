/*Minimum in BST
Solved
Difficulty: EasyAccuracy: 70.95%Submissions: 242K+Points: 2Average Time: 15m
Given the root of a Binary Search Tree, find the minimum element in this given BST.

Examples

Input: root = [5, 4, 6, 3, N, N, 7, 1]
ex-1
Output: 1
Explanation: The minimum element in the given BST is 1.
Input: root = [10, 5, 20, 2]
ex-2
Output: 2
Explanation: The minimum element in the given BST is 2.
Input: root = []
Output: -1
Explanation: The root of the BST is NULL.
Constraints:
0 ≤ number of nodes ≤ 105
0 ≤ node->data ≤ 105 */
public class Pro_01_Minimum_in_BST {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int minValue(Node root) {
        // code here
        if(root == null) return -1;
        if(root.left == null) return root.val;
        return minValue(root.left);
    }
}
