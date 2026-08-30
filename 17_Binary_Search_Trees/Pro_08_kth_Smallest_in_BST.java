/*k-th Smallest in BST
Solved
Difficulty: MediumAccuracy: 43.53%Submissions: 164K+Points: 4Average Time: 40m
Given the root of a BST and an integer k, find the kth smallest element in the BST. If there is no kth smallest element present then return -1.

Examples:

Input: root = [20, 8, 22, 4, 12, N, N, N, N, 10, 14], k = 3
    
Output: 10
Explanation: 10 is the 3rd smallest element in the BST.
Input: root = [2, 1, 3], k = 5
    
Output: -1
Explanation: There is no 5th smallest element in the BST as the size of BST is 3.
Constraints:
1 ≤ number of nodes, k ≤ 104
1 ≤ node->data ≤ 104 */
public class Pro_08_kth_Smallest_in_BST {
    public static void main(String[] args) {
    }
    static int ans = -1;
    static int k2;
    // public int kthSmallest(Node root, int k) {
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
    int kthSmallest(Node root,int k) {
        // code here
        k2 = k;
        helper(root);
        if(k2 > 0) return -1;
        return ans;
    }
    void helper(Node root){
        if(root == null) return;
        helper(root.left);
        k2--;
        if(k2 == 0) ans = root.val;
        helper(root.right);
    }
}
