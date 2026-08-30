/*Kth Largest in BST
Solved
Difficulty: EasyAccuracy: 49.31%Submissions: 187K+Points: 2
Given the root of a Binary Search Tree (BST) and an integer k, find the k-th largest element in the BST without modifying its structure.

Examples:

Input: root = [4, 2, 9], k = 2

Output: 4
Explanation: The second largest element is 4.
Input: root = [10, 2, 11, 1, 5, N, N, N, N, 3, 6, N, 4], k = 7
 
Output: 2
Explanation: The 7th largest element is 2.
Input: root = [4, 2, 9], k = 3

Output: 2
Explanation: The 3rd largest element is 2.
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
1 ≤ k ≤ number of nodes */
public class Pro_09_Kth_Largest_in_BST {
    public static void main(String[] args) {
    }
    static int ans = -1;
    static int k2;
    // public int kthLargest(Node root, int k) {
    //     // code here
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     helper(root,arr);
    //     if(k > arr.size()) return -1;
    //     return arr.get(k-1);
    // }
    // void helper(Node root,ArrayList<Integer> arr){
    //     if(root == null) return;
    //     helper(root.left,arr);
    //     arr.add(root.data);
    //     helper(root.right,arr);
    // }
    @SuppressWarnings("unused")
    int kthLargest(Node root,int k) {
        // code here
        k2 = k;
        helper(root);
        if(k2 > 0) return -1;
        return ans;
    }
    void helper(Node root){
        if(root == null) return;
        helper(root.right);
        k2--;
        if(k2 == 0) ans = root.val;
        helper(root.left);
    }
}
