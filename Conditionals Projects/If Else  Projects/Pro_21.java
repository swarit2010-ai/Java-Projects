import java.util.Scanner;
public class Pro_21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first angle :");
            double ang1 = sc.nextDouble();
            System.out.println("Enter second angle :");
            double ang2 = sc.nextDouble();
            System.out.println("Enter third angle :");
            double ang3 = sc.nextDouble();
            if((ang1 + ang2 + ang3) == 180.0){
                if(ang1 > 90.0 || ang2 > 90.0 || ang3 > 90.0){
                    System.out.println("It is an obtuse angled triangle");
                }
                else if(ang1 == 90.0 || ang2 == 90.0 || ang3 == 90.0){
                    System.out.println("It is a right angled triangle");
                }
                else{
                    System.out.println("It is an acute angled triangle");
                }
            }
            else{
                System.out.println("The triangle is not valid");
            }
        }
    }
}