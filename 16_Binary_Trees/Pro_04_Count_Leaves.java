/* Count Leaves in Binary Tree
Difficulty: BasicAccuracy: 76.44%Submissions: 134K+Points: 1
Given a Binary Tree of size n, You have to count leaves in it. For example, there are two leaves in the following tree




Examples:

Input:
Given Tree is  

Output: 3
Explanation: Three leaves are 3, 5 and 1.
Input:
Given Tree is

Output: 4
Explanation: Four leaves are 20, 40, 65 and 80.
Input:
Given Tree is  

Output: 3
Explanation: Three leaves are 20, 27 and 40.
Constraints:
1<= number of nodes <= 105
1<= node->data <= 105*/
public class Pro_04_Count_Leaves {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int countLeaves(Node node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        return countLeaves(node.left)+countLeaves(node.right);
    }
}
