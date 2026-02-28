public class Pro_31 {

    public static void main(String[] args) {
        for(int i = 1;i <= 4;i++){
            for(int a = i;a <= 3;a++){
                System.out.print(" ");
            }
            for(int b = 1;b <= i;b++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}