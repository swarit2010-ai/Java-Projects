import java.util.Scanner;
public class Pro_28{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        int r = x;
        int a = 2;
        int b = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(r);
            r = (int)Math.pow(x,a) + b;
            a++;
            b++;
        }
    }
} 