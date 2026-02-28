import java.util.Scanner;
public class Pro_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an angle :");
        int a1 = sc.nextInt();
        System.out.println("Enter another angle :");
        int a2 = sc.nextInt();
        System.out.println("Enter last angle :");
        int a3 = sc.nextInt();
        if((a1 + a2 + a3) == 180){
            if(a1 > 90 || a2 > 90 || a3 > 90)
                System.out.println("It is obtuse");
            else if(a1 == 90 || a2 == 90 || a3 == 90)
                System.out.println("It is a right");
            else
                System.out.println("It is an acute");
        }
        else
            System.out.println("It is not valid");
    }
}