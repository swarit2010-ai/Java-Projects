import java.util.Scanner;
public class Pro_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double no = sc.nextDouble();
        System.out.println("Enter another number :");
        double no2 = sc.nextDouble();
        int round1 = (int)Math.round(no);
        int round2 = (int)Math.round(no2);
        System.out.println("The rounded off numbers are " + round1 + " and " + round2);
    }
}