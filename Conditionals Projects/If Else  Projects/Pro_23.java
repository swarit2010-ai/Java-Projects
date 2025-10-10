import java.util.Scanner;
public class Pro_23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter monthly income :");
            int income = sc.nextInt();
            income = income*12;
            double tax;
            if(income <= 100000){
                tax = 0;
            }
            else if(income <= 150000){
                tax = 10/100.0 * (income-100000);
            }
            else if(income <= 250000){
                tax = 5000 + 20/100.0 * (income-150000);
            }
            else{
                tax = 25000 + 30/100.0 * (income-250000);
            }
            System.out.println("The tax to be paid annually is " + tax + " rupees");
        }
    }
}