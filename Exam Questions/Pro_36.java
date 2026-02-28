// public class Pro_36 {

//     public static void main(String[] args) {
//         int a = -1;
//         int b = 1;
//         int f = a+b;
//         while(true){
//             if(f > 49 && f < 101)
//                 System.out.println(f);
//             if(f > 100)
//                 break;
//             a = b;
//             b = f;
//             f = a+b;
//         }
//     }
// }
// // public class Pro_36 {

// //     public static void main(String[] args) {
// //         for(int i = 1;i <= 5;i++){
// //             for(int j = 1;j <= i;j++){
// //                 if(j == 1 || i == j || i == 5)
// //                     System.out.print(1);
// //                 else 
// //                     System.out.print(0);
// //             }
// //             System.out.println();
// //         }
// //     }
// // }
public class Pro_36 {

    public static void main(String[] args) {
        int x = 4;
        x = x++ * ++x % 5 + x;
        System.out.println(x);
    }
}