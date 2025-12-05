import java.util.Scanner;
public class Pro_17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int cp = n;
            int d;
            for(int m = 0;m <= 9;m++){
                n = cp;
                while(n != 0){
                    d = n % 10;
                    if(d == m){
                        System.out.print(d + " ");
                        break;
                    }
                    n /= 10;
                }
            }    
        }
    }
}
