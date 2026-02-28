import java.util.Scanner;
public class Pro_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int sq = no*no;
        int cp = no;
        int d,sum = 0;
        while(sq != 0){
            d = sq % 10;
            sum += d;
            sq /= 10;
        }
        if(sum == cp)
            System.out.println("Neon");
        else
            System.out.println("Not");
    }
}