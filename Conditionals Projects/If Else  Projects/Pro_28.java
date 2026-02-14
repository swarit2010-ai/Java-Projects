import java.util.Scanner;
public class Pro_28 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the temperature :");
            int t = sc.nextInt();
            if(t < 0)
                System.out.println("Freezing");
            else if(t < 16)
                System.out.println("Cold");
            else if(t < 31)
                System.out.println("Moderate");
            else 
                System.out.println("Hot");
        }
    }
}
