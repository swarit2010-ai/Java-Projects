import java.util.Scanner;
public class Pro_17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a letter :");
            String input = sc.next();
            char ch = input.charAt(0);
            if("aeiouAEIOU".indexOf(ch) != -1){
                System.out.println("It's a vowel");
            }
            else{
                System.out.println("It's a consonant");
            }
        }
    }
}