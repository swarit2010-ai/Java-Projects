import java.util.Scanner;
public class Pro_04 {
    static String[] name_below20_2digit = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"},name_tens_place = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"},name_above_99 = {"hundred","thousand","lakh","crore"};
    static int amount,digits,p,last_two_digits,divisible_value;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the amount in indian rupees :");
        amount = input();
        digits = Pro_03.digits(amount);
        print();
    }
    static int input(){
        return sc.nextInt();
    }
    static int no_of_prints(){
        return switch (digits) {
            case 1 -> 1;
            case 2 -> decide(amount);
            case 3 -> 6 + decide(last_two_digits);
            case 4 -> 1;
            case 5 -> 1;
            case 6 -> 1;
            case 7 -> 1;
            case 8 -> 1;
            case 9 -> 1;
            case 10 -> 1;
            default -> 1;
        };
    }
    static void print(){
        for(int n = 1;n <= no_of_prints();n++){

        }
    }
    static int decide(int decided_value){
        if(amount <= 20){
            return 1;
        }
        else{
            return switch (decided_value) {
                case 30 -> 1;
                case 40 -> 1;
                case 50 -> 1;
                case 60 -> 1;
                case 70 -> 1;
                case 80 -> 1;
                case 90 -> 1;
                default -> 3;  
            };
        }
    }
}