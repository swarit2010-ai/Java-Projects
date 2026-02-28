import java.util.Scanner;
public class Pro_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms :");
        int n = sc.nextInt();
        int sum = 2;
        int a = 4;
        for(int i = 1;i <= n;i++){
            System.out.println(sum);
            sum += a;
            a += 2;
        }
        
    }
}