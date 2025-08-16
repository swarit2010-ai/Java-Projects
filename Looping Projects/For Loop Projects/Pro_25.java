public class Pro_25 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int s = 0;
        for(int n = 1;n <= 100;n++){
            if(n >= 3 && n % 2 == 1 && a <= 24){
                s = s+b;
                b = b+n;
                a++;
            }
        }
        System.out.println("The sum is " + s);
    }
}