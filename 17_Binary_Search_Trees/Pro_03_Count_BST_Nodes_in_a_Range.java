/*Count BST Nodes in a Range
Difficulty: MediumAccuracy: 64.84%Submissions: 105K+Points: 4Average Time: 45m
Given a Binary Search Tree (BST) and a range l-h (inclusive), your task is to return the number of nodes in the BST whose value lie in the given range.

Examples :

Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 5, h = 45

Output: 3
Explanation: There are three nodes in range [5, 45] =  5, 10 and 40.
Input: root[] = [10, 5, 50, 1, N, 40, 100], l = 10, h = 100

Output: 4
Explanation: There are four nodes in range [10, 100] = 10, 40, 50 and 100.
Input: root[] = [1, 2, 3], l = 23, h = 95

Output: 0
Explanation: There are no nodes in range [23, 95].
Constraints:

1 ≤ root.size(), l, h ≤ 105 */
public class Pro_03_Count_BST_Nodes_in_a_Range {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    int getCount(Node root, int l, int h) {
        // code here
        if(root == null) return 0;
        int val = root.val;
        if(val >= l && val <= h) return 1+getCount(root.left,l,h)+getCount(root.right,l,h);
        if(val < l) return getCount(root.right,l,h);
        return getCount(root.left,l,h);
    }
}
