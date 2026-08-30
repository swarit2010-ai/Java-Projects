/*Sum of Nodes in BST Range
Difficulty: MediumAccuracy: 81.28%Submissions: 11K+Points: 4
Given the root of a Binary Search Tree and two integers l and r, the task is to find the sum of all nodes that lie between l and r, including both l and r.

Examples

Input: root = [22, 12, 30, 8, 20], l = 10, r = 22

Output: 54
Explanation: The nodes in the given Tree that lies in the range [10, 22] are [12, 20, 22]. Therefore, the sum of nodes is 12 + 20 + 22 = 54.
Input: root = [8, 5, 11, 3, 6, N, 20], l = 11, r = 15  

Output: 11
Explanation: The nodes in the given Tree that lies in the range [11, 15] is [11]. Therefore, the sum of node is 11.
Constraints:
0 ≤ number of nodes ≤ 104
0 ≤ node->data ≤ 104
0 ≤ l ≤ r ≤ 104 */
public class Pro_05_Sum_of_Nodes_in_BST_Range {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int nodeSum(Node root, int l, int h) {
        // code here
        if(root == null) return 0;
        int val = root.val;
        if(val >= l && val <= h) return val+nodeSum(root.left,l,h)+nodeSum(root.right,l,h);
        if(val < l) return nodeSum(root.right,l,h);
        return nodeSum(root.left,l,h);
    }
}
