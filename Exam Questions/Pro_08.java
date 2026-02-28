import java.util.Scanner;
public class Pro_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int c = 0,d,sum = 0,p;
        int cp = no;
        while(no != 0){
            c++;
            no /= 10;
        }
        no = cp;
        while(no != 0){
            d = no % 10;
            p = (int)Math.pow(d,c);
            sum += p;
            no /= 10;
        }
        if(sum == cp)
            System.out.println("Armstrong");
        else
            System.out.println("Not");
    }
}