/* Min Distance Between Two in Binary Tree
Solved
Difficulty: HardAccuracy: 39.13%Submissions: 137K+Points: 8Average Time: 30m
Given a binary tree with n nodes and two node values a and b, find the minimum distance between them. The distance is defined as the minimum number of edges between the two nodes. It is guaranteed that both nodes exist in the binary tree and all node values are unique.

Examples :

Input:
      
a = 2, b = 3
Output: 2
Explanation: The path between node 2 and node 3 is: 2 -> 1 -> 3.The number of edges in this path is 2, so the minimum distance is 2. 
Input:

a = 4, b = 7
Output: 4
Explanation: The path between node 4 and node 7 is: 4 -> 2 -> 1 -> 3 -> 7.The number of edges in this path is 4, so the minimum distance is 4.
Constraints:

2 ≤ size of binary tree ≤ 105*/
public class Pro_23_Min_Distance_Between_Two_in_Binary_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int findDist(Node root, int a, int b) {
        // code here
        if(a == b) return 0;
        Node lca = lca(root,a,b);
        int dis1 = root_to_node(lca,a,0);
        int dis2 = root_to_node(lca,b,0);
        return dis1+dis2;
    }
    int root_to_node(Node root,int n,int curr){
        if(root == null) return 0;
        if(root.val == n) return curr;
        curr++;
        return Math.max(root_to_node(root.left,n,curr),root_to_node(root.right,n,curr));
    }
    Node lca(Node root, int n1, int n2) {
        // code here
        if(root == null) return null;
        if(root.val == n1 || root.val == n2) return root;
        if(lca(root.left,n1,n2) == null) return lca(root.right,n1,n2);
        else if(lca(root.right,n1,n2) == null) return lca(root.left,n1,n2);
        return root;
    }
}
