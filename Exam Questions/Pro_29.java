import java.util.Scanner;
public class Pro_29{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        double r;
        double a = 1;
        double b = 1;
        double f = 1;
        for(int m = 1;m <= n;m++){
            for(int i = 1;i <= a;i++){
                f *= i;
            }
            r = Math.pow(x,b) / f;
            System.out.println(r);
            a += 2;
            b++;
            f = 1;
        }
    }
} 