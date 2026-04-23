import java.util.*;
/*Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find both the duplicate number and the missing number.

Examples:

Input: arr[] = [2, 2]
Output: [2, 1]
Explanation: Repeating number is 2 and the missing number is 1.
Input: arr[] = [1, 3, 3] 
Output: [3, 2]
Explanation: Repeating number is 3 and the missing number is 2.
Input: arr[] = [4, 3, 6, 2, 1, 1]
Output: [1, 5]
Explanation: Repeating number is 1 and the missing number is 5.
Constraints:
2 ≤ n ≤ 106
1 ≤ arr[i] ≤ n */
public class Pro_25{
    public static void main(String[] args) {
    }
    public static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int rep = 0;
        int miss = 0;
        boolean flag[] = new boolean[arr.length+1];
        for(int i = 0;i < arr.length;i++){
            if(flag[arr[i]] == true) rep = arr[i];
            else flag[arr[i]] = true;
        }
        for(int i = 1;i < flag.length;i++) if(flag[i] == false) miss = i;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(rep);ans.add(miss);
        return ans;
    }
}