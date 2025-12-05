import java.util.Scanner;
public class Pro_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int d,sd = 9;
            while(n != 0){
                d = n % 10;
                if(d < sd){
                    sd = d;
                }
                n /= 10;
            }
            System.out.println("The smallest digit is " + sd);
        }
    }
}
