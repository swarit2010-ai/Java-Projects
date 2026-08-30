/* Check for BST
Difficulty: MediumAccuracy: 25.37%Submissions: 615K+Points: 4Average Time: 30m
Given the root of a binary tree, check whether it is a Binary Search Tree (BST) or not. A binary tree is considered a BST if it satisfies the following properties:
All nodes in the left subtree of a node have values less than the node's value.
All nodes in the right subtree of a node have values greater than the node's value.
Both the left and right subtrees are also Binary Search Trees.
Return true if the given binary tree is a BST; otherwise, return false.
Examples:

Input: root = [2, 1, 3, N, N, N, 5]

Output: true 
Explanation: The left subtree of every node contains smaller data and right subtree of every node contains greater data. Hence, the tree is a BST.
Input: root = [2, N, 7, N, 6, N, 9] 


Output: false 
Explanation: Since the node to the right of node with data 7 has lesser value 6, hence it is not a valid BST.
Input: root = [10, 5, 20, N, N, 9, 25]

Output: false
Explanation: The node with data 9 present in the right subtree has lesser key value than root node 10.
Constraints:

1 ≤ size of binary tree ≤ 105
1 ≤ node.data ≤ 109*/

import java.util.ArrayList;

public class Pro_10_Check_for_BST {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    boolean isBST(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root,arr);
        boolean check = true;
        for(int i = 0;i < arr.size()-1;i++){
            if(arr.get(i+1) <= arr.get(i)) check = false;
        }
        return check;
    }
    void helper(Node root,ArrayList<Integer> arr){
        if(root == null) return;
        helper(root.left,arr);
        arr.add(root.val);
        helper(root.right,arr);
    }
    // public boolean isBST(Node root) {
    //     // code here
    //     if(root == null) return true;
    //     boolean check1 = find1(root,root.left);
    //     boolean check2 = find2(root,root.right);
    //     if(!check1 || !check2) return false;
    //     return isBST(root.left)&&isBST(root.right);
    // }
    // boolean find1(Node root,Node temp){
    //     if(temp == null) return true;
    //     if(root.data <= temp.data) return false;
    //     return find1(root,temp.left)&&find1(root,temp.right);
    // }
    // boolean find2(Node root,Node temp){
    //     if(temp == null) return true;
    //     if(root.data >= temp.data) return false;
    //     return find2(root,temp.left)&&find2(root,temp.right);
    // }
}
