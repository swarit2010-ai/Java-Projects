import java.util.Scanner;
public class Pro_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of appliances :");
        int app = sc.nextInt();
        int bill;
        if(app <= 56)
            bill = 5*app;
        else if(app <= 274)
            bill = 5*56 + 6*(app - 56);
        else if(app <= 624)
            bill = 5*56 + 6*218 + 7*(app - 274);
        else 
            bill = 5*56 + 6*218 + 7*350 + 8*(app - 624);
        System.out.println("The bill is " + bill);
    }
}