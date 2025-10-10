import java.util.Scanner;
public class Pro_33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = scanner.nextInt();
        System.out.println("Enter another number :");
        int no2 = scanner.nextInt();
        System.out.println("Enter terms :");
        int t = scanner.nextInt();
        System.out.println("The progression is :");
        for(int n = 1;n <= t;n++){
            System.out.println(no);
            no = no*no2;
        }
    }
}