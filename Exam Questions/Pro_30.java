import java.util.Scanner;
public class Pro_30{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int cp = n;
        int md = 0;
        int nd = 0;
        while(n != 0){
            nd++;
            n /= 10;
        }
        if(nd % 2 == 0){
            System.out.println("No middle digit");
        }
        else{
            int mp = nd/2 + 1;
            for(int i = 1;i <= mp;i++){
                md = cp % 10;
                cp /= 10;
            }
            System.out.println(md + " is the middle digit");
        }
    }
}