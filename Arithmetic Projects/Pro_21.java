import java.util.Scanner;
public class Pro_21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dim1 = 0.7;
        double dim2 = 0.5;
        double length = dim1*4*2+dim2*4*2;
        System.out.println("The length of the wire needed is " + length + " km");
    }
}