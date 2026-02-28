import java.util.Scanner;
public class Pro_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int no,sum = 0;
        for(int i = 1;i <= n;i++){
            System.out.println("Enter another number");
            no = sc.nextInt();
            sum += no;
        }
        System.out.println("The sum is " + sum);
    }
}