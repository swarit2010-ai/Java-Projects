/* Perfect Binary Tree
Difficulty: EasyAccuracy: 45.43%Submissions: 21K+Points: 2
Given a Binary Tree, check whether the given Binary Tree is a prefect Binary Tree or not. A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.

Examples:

Input: root[] = [7, 4, 9]


Output: true
Explanation: 
As the root node 7 has two children and two leaf nodes 4 and 9 are at same level.
Input: root[] = [7, 3, 8, 2, 5, N, 10, 1, N, N, N, N, N]


Output: false
Constraints:
1 ≤ n ≤ 10^5
1 ≤ data of node ≤ 10^5*/
public class Pro_17_Perfect_Binary_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    boolean isPerfect(Node root) {
        // code here
        int nodes = nodes(root);
        int level = level(root);
        int perfect = (int)Math.pow(2,level)-1;
        return (perfect == nodes);
    }
    int nodes(Node root){
        if(root == null) return 0;
        return 1+nodes(root.left)+nodes(root.right);
    }
    int level(Node root){
        if(root == null) return 0;
        int lright = level(root.right);
        int lleft = level(root.left);
        return 1+Math.max(lright,lleft);
    }
}
