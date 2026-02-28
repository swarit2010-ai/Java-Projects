import java.util.Scanner;
public class Pro_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter another number :");
        int b = sc.nextInt();
        int pro = a;
        for(int i = 1;i <= n;i++){
            System.out.println(pro);
            pro *= b;
        }
    }
}