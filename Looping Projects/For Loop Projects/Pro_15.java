import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        for(int n = 1;n <= no;n++){
            if(no % n == 0){
                System.out.println(n);
            }
        }
    }
}