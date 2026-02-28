import java.util.Scanner;
public class Pro_27{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        int a = 1;
        int sq = 1;
        for(int m = 1;m <= n;m++){
            if(m % 3 == 0){
                n++;
            }
            else{
                System.out.println(sq);
            }
            a++;
            sq = a*a;
        }
    }
} 