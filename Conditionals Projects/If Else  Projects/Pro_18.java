import java.util.Scanner;
public class Pro_18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a letter :");
            String input = sc.next();
            char ch = input.charAt(0);
            if(ch >= 'A' && ch <= 'Z'){
                System.out.println("It's uppercase");
            }
            else if(ch >= 'a' && ch <= 'z'){
                System.out.println("It's lowercase");
            }
            else{
                System.out.println("It's not a letter");
            }
        }
    }
}