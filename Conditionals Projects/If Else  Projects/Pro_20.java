import java.util.Scanner;
public class Pro_20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a character :");
            String input = sc.next();
            char ch = input.charAt(0);
            if(ch >= 'A' && ch <= 'Z'){
                System.out.println("Its a letter");
            }
            else if(ch >='a' && ch <= 'z'){
                System.out.println("It's a letter");
            }
            else if(ch >= '0' && ch <= '9'){
                System.out.println("It's a digit");
            }
            else{
                System.out.println("It's a special character");
            }
        }
    }
}