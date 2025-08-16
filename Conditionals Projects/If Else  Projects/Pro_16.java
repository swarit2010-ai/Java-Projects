import java.util.Scanner;
public class Pro_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the name of the website :");
            String web = sc.next();
            if(web.endsWith(".com")){
                System.out.println("This is a commercial website");
            }
            else if (web.endsWith(".org")) {
                System.out.println("This is an organisational website");
            }
            else if (web.endsWith(".in")) {
                System.out.println("This is an indian website");
            } 
            else {
                System.out.println("This is another type of website which is out of my means");
            }
        }
    }
}