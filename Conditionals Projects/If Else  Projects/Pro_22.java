import java.util.Scanner;
public class Pro_22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the no of units :");
            int units = sc.nextInt();
            int bill;
            if(units <= 100){
                bill = 5*units;
            }
            else if(units <= 300){
                bill = 5*100 + (units-100)*6;
            }
            else if(units <= 600){
                bill = 5*100 + 6*200 + (units-300)*7;
            }
            else{
                bill = 5*100 + 6*200 + 7*300 + (units-600)*8;
            }
            System.out.println("The bill is " + bill + " rupees");
        }
    }
}