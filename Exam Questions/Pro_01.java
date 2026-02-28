import java.util.Scanner;
public class Pro_01 {
    public static void main(String[] args) {
        processList();
    }
    static boolean isPalindrome(int n){
        int r = 0,cp = n,d;
        while(n != 0){
            d = n % 10;
            r = r*10 + d;
            n /= 10;
        }
        if(r == cp)
            return true;
        else
            return false;
    }
    static void processList(){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i <= 10;i++){
            System.out.println("Enter a number");
            int no = sc.nextInt();
            if(isPalindrome(no))
                count++;
        }
        System.out.println(count + " numbers were palindrome");
    }
}