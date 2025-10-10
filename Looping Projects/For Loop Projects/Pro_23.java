import java.util.Scanner;
public class Pro_23 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int fno = 0;
        for(int n = 1;n <= no;n++){
            if(no % n == 0){
                fno++;
            }
        }
        if(fno == 2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not a prime");
        }
    }
}