import java.util.Scanner;
public class Pro_25 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner scanner = new Scanner(System.in)) {
            int no = scanner.nextInt();
            int fd = no/10;
            int sd = no%10;
            if(fd > sd){
                System.out.println(fd + " is the largest digit");
            }
            else{
                System.out.println(sd + " is the largest digit");
            }
        }
    }
}