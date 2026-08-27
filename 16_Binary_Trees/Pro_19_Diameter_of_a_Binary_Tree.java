/* Diameter of a Binary Tree
Difficulty: MediumAccuracy: 47.37%Submissions: 378K+Points: 4Average Time: 20m
Given the root of a binary tree, find the diameter of the binary tree. The diameter of a binary tree is defined as the number of edges on the longest path between any two nodes. Note that this path may or may not pass through the root of the tree.

Examples:

Input: root = [1, 2, N, 3, 4]

Output: 2
Explanation: The longest path has 2 edges (node 3 -> node 2 -> node 4).

Input: root = [5, 8, 6, 3, 7, 9, N]

Output: 4
Explanation: The longest path has 4 edges (node 3 -> node 8 -> node 5 -> node 6 -> node 9).

Constraints:

1 ≤ size of binary tree ≤ 103
0 ≤ node.data ≤ 105*/
public class Pro_19_Diameter_of_a_Binary_Tree {
    public static void main(String[] args) {
    }
    /*
    public int diameter(Node root) {
        // code here
        if(root == null) return 0;
        return Math.max(level(root.left)+level(root.right),Math.max(diameter(root.left),diameter(root.right)));
    }
    int level(Node root){
        if(root == null) return 0;
        int lright = level(root.right);
        int lleft = level(root.left);
        return 1+Math.max(lright,lleft);
    }
    */
    static int dia;
    @SuppressWarnings("unused")
    int diameter(Node root) {
        // code here
        if(root == null) return 0;
        dia = 0;
        level(root);
        return dia;
    }
    int level(Node root){
        if(root == null) return 0;
        int lright = level(root.right);
        int lleft = level(root.left);
        dia = Math.max(dia,lright+lleft);
        return 1+Math.max(lright,lleft);
    }
}
