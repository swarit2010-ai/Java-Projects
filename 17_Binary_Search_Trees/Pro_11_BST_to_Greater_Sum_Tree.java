/*BST to Greater Sum Tree
Solved
Difficulty: MediumAccuracy: 66.73%Submissions: 27K+Points: 4
Given the root of a  BST with unique node values, transform it into greater sum tree where each node contains sum of all nodes greater than that node.

Examples:

Input: root = [11, 2, 29, 1, 7, 15, 40, N, N, N, N, N, N, 35, N]
      
Output: [119, 137, 75, 139, 130, 104, 0, N, N, N, N, N, N, 40, N]
Explanation: Every node is replaced with the sum of nodes greater than itself. 
      
Input: root = [2, 1, 6, N, N, 3, 7]
     
Output: [16, 18, 7, N, N, 13, 0]
Explanation: Every node is replaced with the sum of nodes greater than itself. 
     
Constraints :
1 ≤ node->val ≤ 3*104
1 ≤ number of nodes ≤ 3*104 */
public class Pro_11_BST_to_Greater_Sum_Tree {
    public static void main(String[] args) {
    }
    static int sum;
    @SuppressWarnings("unused")
    void transformTree(Node root) {
        // code here
        sum = 0;
        helper(root);
    }
    void helper(Node root){
        if(root == null) return;
        helper(root.right);
        int run = root.val;
        root.val = sum;
        sum += run;
        helper(root.left);
    }
    // public void transformTree(Node root) {
    //     // code here
    //     int[] sum = {0};
    //     helper(root,sum);
    // }
    // void helper(Node root,int[] sum){
    //     if(root == null) return;
    //     helper(root.right,sum);
    //     int val = root.data;
    //     root.data = sum[0];
    //     sum[0]+=val;
    //     helper(root.left,sum);
    // }
}
