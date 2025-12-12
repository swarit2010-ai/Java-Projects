import java.util.Scanner;
public class Pro_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            System.out.println("Enter the position of digit from right :");
            int p = sc.nextInt();
            int m = 1,d = 0;
            while(m <= p){
                d = n % 10;
                n /= 10;
                m++;
            }
            System.out.println("The digit at the " + p + " position from right is " + d);
        }
    }
}
