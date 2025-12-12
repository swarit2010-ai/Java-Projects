import java.util.Scanner;
public class Pro_20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int sq,cb,l_sq = 0,l_cb = 0,d,l_sq_d = 0,l_cb_d = 0;
            while(n != 0){
                d = n % 10;
                sq = d*d;
                cb = d*d*d;
                if(sq > l_sq){
                    l_sq = sq;
                    l_sq_d = d;
                }
                if(cb > l_cb){
                    l_cb = cb;
                    l_cb_d = d;
                }
                n /= 10;
            }
            System.out.println("The digit with the largest square is " + l_sq_d);
            System.out.println("The digit with the largest cube is " + l_cb_d);
        }
    }
}
