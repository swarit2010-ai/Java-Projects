import java.util.Scanner;
public class Pro_42 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int no = sc.nextInt();
            System.out.println("Enter another number :");
            int no_1 = sc.nextInt();
            int pro = 0;
            for(int n = 1;n <= no_1;n++){
                pro+=no;
            }
            System.out.println("The product of the two numbers is " + pro);
        }
    }
}