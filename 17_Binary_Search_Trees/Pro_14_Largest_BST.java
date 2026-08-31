/*Largest BST
Solved
Difficulty: MediumAccuracy: 29.73%Submissions: 214K+Points: 4Average Time: 40m
Given the root of a binary tree, find the size of the largest subtree that is also a Binary Search Tree (BST). A subtree is considered a BST if, for every node in the subtree:

All nodes in its left subtree have values less than the node's value.
All nodes in its right subtree have values greater than the node's value.
The subtree contains no duplicate values.
Return the number of nodes in the largest BST subtree.

Note: The size of a subtree is the total number of nodes it contains.

Examples :

Input: root = [5, 2, 4, 1, 3]

Output: 3
Explanation:The following sub-tree is a BST of size 3

Input: root = [6, 7, 3, N, 2, 2, 4]

Output: 3
Explanation: The following sub-tree is a BST of size 3:

Constraints:

1 ≤ size of binary tree, node.val ≤ 105 */
class Quad{
    int min;
    int max;
    boolean isBST;
    int size;
    Quad(int max,int min,boolean isBST,int size){
        this.min = min;
        this.max = max;
        this.isBST = isBST;
        this.size = 0;
    }
}
public class Pro_14_Largest_BST {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int largestBst(Node root) {
        // code here
        Quad maxmin = maxmin(root);
        return maxmin.size;
    }
    Quad maxmin(Node root){
        if(root == null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0);
        Quad left = maxmin(root.left);
        Quad right = maxmin(root.right);
        int max = Math.max(root.val,Math.max(left.max,right.max));
        int min = Math.min(root.val,Math.min(left.min,right.min));
        boolean flag = true;
        if((left.max >= root.val || right.min <= root.val) || !left.isBST || !right.isBST) flag = false;
        Quad ans = new Quad(max,min,flag,0);
        if(ans.isBST) ans.size = left.size+right.size+1;
        else {
            ans.size = Math.max(left.size,right.size);
            ans.max = 0;
            ans.min = 0;
            ans.isBST = false;
        }
        return ans;
    }
}
