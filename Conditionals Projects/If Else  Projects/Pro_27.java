import java.util.Scanner;
public class Pro_27 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            n = Math.abs(n);
            int n_d = 0;
            int cp = n;
            int ld = 0,d,md = 0;
            int c = 0;
            if(n == 0)
                n_d = 1;
            while(n != 0){
                n_d++;
                n /= 10;
            }
            int mid = n_d/2+1;
            if(n_d % 2 == 0)
                System.out.println("The number doesn't have a middle digit");
            else{
                while(cp != 0){
                    c++;
                    d = cp % 10;
                    if(c == mid)
                        md = d;
                    if(d > ld)
                        ld = d;
                    cp /= 10;
                }
                if(ld == md)
                System.out.println("Middle digit is the largest digit");
                else
                System.out.println("Middle digit is not the largest digit");
            }
        }
    }
}
