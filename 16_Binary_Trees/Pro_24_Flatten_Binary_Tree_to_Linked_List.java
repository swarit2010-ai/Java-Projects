/*Flatten Binary Tree to Linked List
Solved
Difficulty: MediumAccuracy: 75.82%Submissions: 51K+Points: 4
Given the root of a binary tree, flatten the tree into a Linked list:

The linked list should use the same Node class where the right child pointer points to the next node in the list and the left child pointer is always null.
The linked list nodes should be in the same order as a preorder traversal of the binary tree.
Examples:

Input: root[] = [1, 2, 5, 3, 4, 6]

Output: [1, 2, 3, 4, 5, 6]  
Explanation: After flattening, the tree looks like:
     1
      \
       2
        \
         3
          \
           4
            \ 
             5 
              \
               6
Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 2 3 4 5 6.
Input: root[] = [1, 3, 4, 2, 5]

Output: [1, 3, 4, 2, 5] 
Explanation: After flattening, the tree looks like:
     1
      \
       3
        \
         4
          \
           2
            \ 
             5 
Here, left of each node points to NULL and right contains the next node in preorder.The inorder traversal of this flattened tree is 1 3 4 2 5.
 
Constraints :
1<= number of nodes in binary tree <= 105
1<= data of nodes <= 105 */
public class Pro_24_Flatten_Binary_Tree_to_Linked_List {
    public static void main(String[] args) {
    }
    // void flatten(Node root) {
    //     ArrayList<Node> ans = new ArrayList<>();
    //     dfs(root,ans);
    //     for(int i = 0;i < ans.size()-1;i++){
    //         ans.get(i).right = ans.get(i+1);
    //         ans.get(i).left = null;
    //     }
    // }
    // void dfs(Node root,ArrayList<Node> ans){
    //     if(root == null) return;
    //     ans.add(root);
    //     dfs(root.left,ans);
    //     dfs(root.right,ans);
    // }
    @SuppressWarnings("unused")
    void flatten(Node root) {
        if(root == null) return;
        Node a = root.left;
        Node b = root.right;
        flatten(a);
        flatten(b);
        Node temp = a;
        if(temp != null){
            while(temp.right != null) temp = temp.right;
            temp.right = b;
        }
        if(a != null){
            root.right = a;
            root.left = null;
        }
    }
}
