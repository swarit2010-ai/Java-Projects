import java.util.Scanner;
public class Pro_15{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int sum = 0;
            int d,cp = n;
            while(n != 0){
                d = n % 10;
                sum += d;
                n /= 10;
            }
            n = cp;
            
        }
    }
}