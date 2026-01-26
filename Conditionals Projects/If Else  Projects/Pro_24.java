import java.util.Scanner;
public class Pro_24 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of calls made by a customer :");
            int calls = sc.nextInt();
            double bill;
            if (calls <= 50) {
                bill = 0;
            } else if (calls <= 100) {
                bill = 0.5 * (calls - 50);
            } else if (calls <= 150) {
                bill = 0.5 * 50 + 1 * (calls - 100);
            } else if (calls <= 250) {
                bill = 0.5 * 50 + 1 * 50 + 1.2 * (calls - 150);
            } else {
                bill = 0.5 * 50 + 1 * 50 + 1.2 * 100 + 1.5 * (calls - 250);
            }
            double gst = 18 / 100.0 * bill;
            double bill_total = bill + gst + 250;
            System.out.println("The total bill to be paid is " + bill_total + " rupees");
        }
    }
}
