/*108. Convert Sorted Array to Binary Search Tree
Solved
Easy
Topics
premium lock icon
Companies
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order. */
public class Pro_13_Convert_SortedArray_to_Binary_Search_Tree {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    Node sortedArrayToBST(int[] arr) {
        Node root = helper(arr,0,arr.length-1);
        return root;
    }
    Node helper(int[] arr,int l,int h){
        if(l > h) return null;
        int mid = (l+h)/2;
        int val = arr[mid];
        Node root = new Node(val);
        root.left = helper(arr,l,mid-1);
        root.right = helper(arr,mid+1,h);
        return root;
    }
}
