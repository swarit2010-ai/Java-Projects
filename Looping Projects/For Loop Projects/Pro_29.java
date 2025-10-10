public class Pro_29 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for(int n = 1;n <= 23;n++){
            c = a+b;
            if(c >= 50 && c <=500){
            System.out.println(c);
            }
            a = b;
            b = c;
        }
    }
}