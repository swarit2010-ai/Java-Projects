import java.util.Scanner;
public class Pro_26{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int p = 2;
        int sq = 4;
        int sum = 1;
        for(int m = 1;m <= n;m++){
            System.out.println(sum);
            sum += sq;
            p++;
            sq = p*p;
        }
    }
} 