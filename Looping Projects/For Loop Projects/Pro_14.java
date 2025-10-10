import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int f = 1;
        for(int n = 1;n <= no;n++){
            f = f*n;
        }
        System.out.println("The factorial of " + no + " is " + f);
    }
}