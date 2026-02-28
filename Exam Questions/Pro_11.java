import java.util.Scanner;
public class Pro_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int no = sc.nextInt();
        int c = 0;
        int cp = no;
        while(no != 0){
            c++;
            no /= 10;
        }
        no = cp;
        int sq = no*no;
        int div = (int)Math.pow(10, c);
        int l_no = sq % div;
        if(l_no == cp)
            System.out.println("Automorphic");
        else
            System.out.println("Not");
    }
}