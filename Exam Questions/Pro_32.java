import java.util.Scanner;
public class Pro_32{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a for the first series and b for the second one :");
        char ch = sc.next().charAt(0);
        if(ch == 'a'){
            int a = 3;
            int sum = 0;
            while(sum <= 99){
                System.out.println(sum);
                sum += a;
                a += 2;
            }
        }
        else if(ch == 'b'){
            double a = 2;
            double b = 4;
            double r;
            double sum = 0;
            while(a <= 10){
                r = a/b;
                sum += r;
                a += 2;
                b += 2;
            }
            System.out.println("The sum is " + sum);
        }
    }
}