import java.util.Scanner;
public class Pro_2 {
    static Scanner sc = new Scanner(System.in);
    static int digits;
    static double otp;
    public static void main(String[] args) {
        System.out.println("Enter number of digits");
        input();
        print();
    }
    static void input(){
        digits = sc.nextInt();
    }
    static void print(){
        System.out.println("The desired otp is " + (int)otp());
    }
    static double otp(){
        otp = Math.random();
        for(int n = 1;n <= digits;n++){
            otp*=10;
        }
        return otp;
    }
}