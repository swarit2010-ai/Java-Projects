import java.util.Scanner;
public class Pro_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int d,sum = 0,pro = 1;
        while(no != 0){
            d = no % 10;
            sum += d;
            pro *= d;
            no /= 10;
        }
        if(sum == pro)
            System.out.println("Spy");
        else
            System.out.println("Not");
    }
}