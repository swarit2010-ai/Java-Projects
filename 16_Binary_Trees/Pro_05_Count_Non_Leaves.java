/*Count Non-Leaf Nodes in Tree
Difficulty: BasicAccuracy: 56.79%Submissions: 51K+Points: 1
Given a Binary Tree of size n, your task is to return the count of all the non-leaf nodes of the given binary tree.

Example:

Input: 
Image
Output: 2
Explanation: Nodes 1 and 2 are the only non leaf nodes.
Input: 
          8
        /   \
       3     9
      / \
     1   6
        / \
       4   7
Output: 3
Explanation: Nodes 8, 3 and 6 are the only non leaf nodes.
Input: 
          10
        /    \
      5       20
     / \     /  \
    3   7   15   25
Output: 3
Explanation: Nodes 10, 5 and 20 are the only non leaf nodes.
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105 */
public class Pro_05_Count_Non_Leaves {
    public static void main(String[] args) {
    }
    int countNonLeafNodes(Node node) {
      // code here
      if(node == null || (node.left == null && node.right == null)) return 0;
      return countNonLeafNodes(node.left)+countNonLeafNodes(node.right)+1;
    }
}
