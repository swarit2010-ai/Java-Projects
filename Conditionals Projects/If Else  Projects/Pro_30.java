import java.util.Scanner;
public class Pro_30 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n % 4 == 0 && n % 6 == 0)
                System.out.println("No");
            else if(n % 4 == 0)
                System.out.println("It is divisible by 4");
            else if(n % 6 == 0)
                System.out.println("It is divisible by 6");
            else 
                System.out.println("No");
        }
    }
}
