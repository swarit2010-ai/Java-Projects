import java.util.Scanner;
public class Pro_19 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int s = 0;
        for(int n = 1;n <= no;n++){
            if(no % n == 0){
                s = s+n;
            }
        }
        if((s-no) == no){
            System.out.println("The no is perfect no.");
        }
        else{
            System.out.println("The number is not perfect no.");
        }
    }
}