import java.util.Scanner;
public class Pro_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int d,r = 0;
        int cp = no;
        while(no != 0){
            d = no % 10;
            r = r*10+d;
            no /= 10;
        }
        if(r == cp)
            System.out.println("Palindrome");
        else
            System.out.println("Not");
    }
}