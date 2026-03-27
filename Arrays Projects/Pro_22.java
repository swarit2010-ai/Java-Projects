/*Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
Note: You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s, 1s and 2s are segregated into ascending order.
Follow up: Could you come up with a one-pass algorithm using only constant extra space?

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 2 */
public class Pro_22{
    public static void main(String[] args) {
    }
    @SuppressWarnings("unused")
    public void sort012(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int k = n-1;
        int p1,p2,p3;
        while(i < k) {
            p1 = arr[i];
            p2 = arr[j];
            p3 = arr[k];
            if(p1 == 0){
                if(p2 == 0) i++;
                else if(p2 == 1) {i++;j--;}
                else if(p3 == 2) {i++;j--;}
            }
            else if(p1 == 1){
                if(p2 == 0){swap(arr, i, j);i++;j--;}
                else if(p2 == 1) {
                    if(p3 == 1) 
                        k++; 
                    else 
                        j--;
                }
                else if(p3 == 2) {i++;j--;k--;}
            }
            else{
                if(p2 == 0) {swap(arr, i, j);i++;j--;}
                else if(p2 == 1) {swap(arr, i, j);i++;j++;}
                else if(p3 == 2) {k--;j++;}
            }
        }
    }
    public void swap(int[] arr,int a,int b){
        arr[a] += arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] -= arr[b];
    }
}