import java.util.Scanner;
public class Pro_34{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int cp = n;
        int d,l_no = 0;
        for(int i = 9;i >= 0;i--){
            while(n != 0){
                d = n % 10;
                if(d == i)
                    l_no = l_no*10 + d;
                n /= 10;
            }
            n = cp;
        }
        System.out.println(l_no);
    }
}