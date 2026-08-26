/* Zig-Zag Tree Traversal
Difficulty: MediumAccuracy: 54.05%Submissions: 440K+Points: 4Average Time: 30m
Given the root of a binary tree. Find the zig-zag level order traversal of the binary tree.
Note: In zig zag traversal we traverse the nodes from left to right for odd-numbered levels, and from right to left for even-numbered levels.

Examples:

Input: root = [1, 2, 3, 4, 5, 6, 7]
    
Output: [1, 3, 2, 4, 5, 6, 7]
Explanation:
Level 1 (left to right): [1]
Level 2 (right to left): [3, 2]
Level 3 (left to right): [4, 5, 6, 7]
Final result: [1, 3, 2, 4, 5, 6, 7]
Input: root = [7, 9, 7, 8, 8, 6, N, 10, 9]

Output: [7, 7, 9, 8, 8, 6, 9, 10] 
Explanation:
Level 1 (left to right): [7]
Level 2 (right to left): [7, 9]
Level 3 (left to right): [8, 8, 6]
Level 4 (right to left): [9, 10]
Final result: [7, 7, 9, 8, 8, 6, 9, 10]
Constraints:

1 ≤ no. of nodes in root, root.node->data ≤ 105*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pro_15_ZigZag_Tree_Traversal {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int c = 0;
        Stack<Node> st = new Stack<>();
        while(!q.isEmpty()){
            c++;
            if(c % 2 == 0){
                while(!q.isEmpty()) st.push(q.remove());
                while(!st.isEmpty()) q.add(st.pop());
            }
            int size = q.size();
            for(int i = 1;i <= size;i++){
                Node peek = q.remove();
                ans.add(peek.val);
                if(c % 2 == 1){
                    if(peek.left != null) q.add(peek.left);
                    if(peek.right != null) q.add(peek.right);
                }
                else{
                    if(peek.right != null) q.add(peek.right);
                    if(peek.left != null) q.add(peek.left);
                }
            }
            if(c % 2 == 0){
                while(!q.isEmpty()) st.push(q.remove());
                while(!st.isEmpty()) q.add(st.pop());
            }
        }
        return ans;
    }
}
