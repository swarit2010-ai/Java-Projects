/* Level Order Traversal
Solved
Difficulty: MediumAccuracy: 70.31%Submissions: 265K+Points: 4Average Time: 20m
Given the root of a Binary Tree, your task is to return its Level Order Traversal.

Note: A level order traversal is a breadth-first search (BFS) of the tree. It visits nodes level by level, starting from the root, and processes all nodes from left to right within each level before moving to the next.

Examples:

Input: root = [1, 2, N, N, 3, N, N]

Output: [1, 2, 3]
Explanation: We start with the root node 1, so the first level of the traversal is [1]. Then we move to its children 2 and 3, which form the next level, giving the final output [1, 2, 3].
Input: root = [10, 20, 30, N, N, 40, 50, N, N, N, N]

Output: [10, 20, 30, 40, 50]
Explanation: We begin with the root node 10, which forms the first level as [10]. Its children 20 and 30 make up the second level, and their children 40 and 50 form the third level, resulting in [10, 20, 30, 40, 50].
Constraints:

1 ≤ no. of nodes in root ≤ 3*104
0 ≤ root.node->data ≤ 109*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Pro_13_Level_Order_Traversal {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node peek = q.remove();
            ans.add(peek.val);
            if(peek.left != null) q.add(peek.left);
            if(peek.right != null) q.add(peek.right);
        }
        return ans;
    }
}