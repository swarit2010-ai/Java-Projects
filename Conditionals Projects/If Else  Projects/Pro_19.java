import java.util.Scanner;
public class Pro_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the first angle :");
            double ang1 = sc.nextDouble();
            System.out.println("Enter the second angle :");
            double ang2 = sc.nextDouble();
            System.out.println("Enter the third angle :");
            double ang3 = sc.nextDouble();
            double ang_sum = ang1+ang2+ang3;
            if(ang1 !=0 && ang2 != 0 && ang3 != 0){
                if(ang_sum == 180){
                    System.out.println("The triangle is valid");
                }
                else{
                    System.out.println("The triangle is not valid");
                }
            }
            else{
                System.out.println("The triangle is not valid");
            }
        }
    }
}