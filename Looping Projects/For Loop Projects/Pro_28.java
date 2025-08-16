public class Pro_28 {
    public static void main(String[] args) {
        System.out.println(0 + "\n" + 1);
        int a = 0;
        int b = 1;
        int c;
        for(int n = 1;n <= 23;n++){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}