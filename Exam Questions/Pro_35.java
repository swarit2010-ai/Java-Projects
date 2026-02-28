import java.util.Scanner;
public class Pro_35{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to check automorphic and 2 to print pattern");
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> {
                System.out.println("Enter a number :");
                int no = sc.nextInt();
                int cp = no;
                int c = 0;
                while(no != 0){
                    c++;
                    no /= 10;
                }
                no = cp;
                int div = (int)Math.pow(10,c);
                int l_no = no*no % div;
                if(l_no == cp)
                    System.out.println("Automorphic");
                else
                    System.out.println("No");
            }
            case 2 -> {
                for(int i = 1;i <= 5;i++){
                    for(int j = 1;j <= i;j++){
                        if(i % 2 == 1)
                            System.out.print("*");
                        else
                            System.out.print("#");
                    }
                    System.out.println();
                }
            }
            default -> System.out.println("Enter correctly");
        }
    }
}
