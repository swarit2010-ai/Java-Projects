import java.util.Scanner;
public class Pro_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int cp = no;
        int d,sum = 0;
        while(no >= 10){
            while(no != 0){
                d = no % 10;
                sum += d;
                no /= 10;
            }
            no = sum;
            sum = 0;
        }
        if(no == 1)
            System.out.println("Magic");
        else
            System.out.println("Not");
    }
}