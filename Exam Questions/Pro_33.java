import java.util.Scanner;
public class Pro_33{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter percentage :");
        double per = sc.nextDouble();
        char grade;
        if(per >= 90)
            grade = 'A';
        else if(per >= 75)
            grade = 'B';
        else if(per >= 60)
            grade = 'C';
        else if(per >= 40)
            grade = 'D';
        else 
            grade = 'E';
        
        System.out.println("Name        Percentage marks    Grade");
        System.out.println(name + "\t" + per + "\t\t" + grade);
    }
}