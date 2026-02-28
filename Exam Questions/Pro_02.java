import java.util.Scanner;
public class Pro_02 {
    public static void main(String[] args) {
        displayPayroll();
    }
    static double calculateBonus(double salary,int years){
        double bonus;
        if(years > 5)
            bonus = 15/100.0 * salary;
        else
            bonus = 5/100.0 * salary;
        return bonus;
    }
    static void displayPayroll(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary :");
        double s = sc.nextDouble();
        System.out.println("Enter the years of service :");
        int y = sc.nextInt();
        double pay = s + calculateBonus(s, y);
        System.out.println("The total pay is " + pay);
    }
}