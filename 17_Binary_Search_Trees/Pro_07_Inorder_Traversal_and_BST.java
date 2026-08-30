/*Inorder Traversal and BST
Solved
Difficulty: EasyAccuracy: 44.45%Submissions: 102K+Points: 2
Given an array arr[] of size n containing unique elements, check whether it represents the inorder traversal of a Binary Search Tree (BST) or not.

Examples:

Input: arr[] = [19, 23, 25, 30, 45]
Output: true
Explaination: Given array is inorder traversal for the following tree:
    
Input: arr[] = [19, 23, 30, 25, 45]
Output: false
Explaination: Given array can not represent Inorder of any BST.
Constraints:
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 105
 */
public class Pro_07_Inorder_Traversal_and_BST {
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    boolean doesRepresentBST(int[] arr) {
        // code here
        int i = 0;
        boolean check = true;
        while(i < arr.length-1){
            if(arr[i+1] < arr[i]) check = false;
            i++;
        }
        return check;
    }
}
