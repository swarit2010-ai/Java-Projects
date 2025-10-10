import java.util.Scanner;
public class Pro_01{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of stones");
        String stones = sc.next();
        int smallnum = 0;
        for (int n = 0;n < stones.length()-1;n++){
            if(stones.charAt(n) == stones.charAt(n+1)){
                smallnum++;
            }
        }
        System.out.println(smallnum);
    }
}