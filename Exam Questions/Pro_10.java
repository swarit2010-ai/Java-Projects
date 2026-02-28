import java.util.Scanner;
public class Pro_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int d,f = 1,sum = 0;
        int cp = no;
        while(no != 0){
            d = no % 10;
            for(int i = 1;i <= d;i++)
                f *= i;
            sum += f;
            no /= 10;
            f = 1;
        }
        if(sum == cp)
            System.out.println("Special");
        else
            System.out.println("Not");
    }
}