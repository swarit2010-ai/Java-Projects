import java.util.Scanner;
public class Pro_17 {
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
        System.out.println("The number has " + fno + " factors");
    }
}