/*BST Insert
Difficulty: EasyAccuracy: 47.15%Submissions: 188K+Points: 2Average Time: 15m
Given the root of a Binary Search Tree (BST) and an integer key, insert a new node with value key into the BST. Return the root of the modified tree after the insertion.

Note: All the nodes have distinct values in the BST and the new value to be inserted is not present in the BST.

Examples :

Input: root = [2, 1, 3], key = 4

Output: [2, 1, 3, N, N, N, 4]
Explanation: After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 4].

Input: root = [2, 1, 3, N, N, N, 6], key = 4

Output: [2, 1, 3, N, N, N, 4, N, 6]
Explanation: After inserting the node 4, the new tree will be [2, 1, 3, N, N, N, 4, N, 6].

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->val ≤ 109
1 ≤ key ≤ 109 */
public class Pro_06_BST_Insert {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    Node insert(Node root, int key) {
        Node temp = root;
        Node node = new Node(key);
        helper(node,temp,key);
        return root;
    }
    void helper(Node node,Node root,int key){
        if(root == null) return;
        if(root.left == null && root.right == null){
            if(key < root.val) root.left = node;
            else root.right = node;
            return;
        }
        else if(root.right == null){
            if(key > root.val) root.right = node;
            else helper(node,root.left,key);
            return;
        }
        else if(root.left == null){
            if(key < root.val) root.left = node;
            else helper(node,root.right,key);
            return;
        }
        if(key < root.val) helper(node,root.left,key);
        else helper(node,root.right,key);
    }
    /*
    public Node insert(Node root, int key) {
        // code here
        if(root == null) return new Node(key);
        if(root.data == key) return root;
        if(key < root.data) root.left = insert(root.left,key);
        else root.right = insert(root.right,key);
        return root;
    }
    */
}
