import java.util.Scanner;
public class Pro_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        boolean check = false;
        int d;
        while(no != 0){
            d = no % 10;
            if(d == 0){
                check = true;
                break;
            }
            no /= 10;
        }
        if(check == true)
            System.out.println("Duck");
        else
            System.out.println("Not");
    }
}