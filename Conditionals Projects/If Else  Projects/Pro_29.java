import java.util.Scanner;
public class Pro_29 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number");
            int n = sc.nextInt();
            System.out.println("Enter another number");
            int n1 = sc.nextInt();
            if(n > n1){
                if(++n1 == n)
                    System.out.println("They are consecutive numbers");
                else
                    System.out.println("They are not consecutive numbers");
            }
            else{
                if(++n == n1)
                    System.out.println("They are consecutive numbers");
                else
                    System.out.println("They are not consecutive numbers");
            }
        }
    }
}
