import java.util.Scanner;
public class Pro_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        int a = -1;
        int b = 1;
        int f = 0;
        for(int i = 1;i <= n;i++){
            f = a+b;
            System.out.println(f);
            a = b;
            b = f;
        }
    }
}