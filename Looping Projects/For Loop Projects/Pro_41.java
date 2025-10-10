import java.util.Scanner;
public class Pro_41 {
    public static void main(String[] args) {
        boolean b = false;
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        for(int n = 1;n <= no;n++){
            if(n*n == no){
                b = true;
            }
        }
        if(b == true){
            System.out.println("The number is a perfect square");
        }
        else{
            System.out.println("The number is not a perfect square");
        }
    }
}