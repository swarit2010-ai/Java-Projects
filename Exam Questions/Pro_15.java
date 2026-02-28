import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int cp = no;
        int d,sum = 0;
        while(no != 0){
            d = no % 10;
            sum += d;
            no /= 10;
        }
        if(cp % sum == 0)
            System.out.println("Harshad");
        else
            System.out.println("Not");
    }
}