public class Notes{
    public static void main(String[] args) {
        // creating an array
        // int[] arr = {6,19,7,69,9,171,5};
        // indexing {The process of naming elements in an array}
        // printing elements using index
        // System.out.println(arr[5]);
        // Updating an array - mutabilation[changing]
        // arr[3] = 89;
        // initializing an array(second method) Empty array
        // int[] nums = new int[4];
        // nums[0] = 5;
        // nums[1] = 6;
        // nums[2] = 7;
        // nums[3] = 8;
        // accesing an array
        // int element = arr[3];
        // size of an array
        // int l = arr.length;
        // Printing an array
        // int[] arr1 = {5,4,5,4,5,4,6,4,6,4};
        // for(int i = 0;i < arr1.length;i++){
        //     System.out.println(arr1[i]);
        // }
        // inputing an array
        // Scanner sc = new Scanner(System.in);
        // int[] swarit = new int[5];
        // for(int i = 0;i < swarit.length;i++){
        //     System.out.println("Enter the element :");
        //     swarit[i] = sc.nextInt();
        // }
        // // printing an array
        // for(int i = 0;i < swarit.length;i++){
        //     System.out.println(swarit[i]);
        // }
        // array of other data types
        // double[] arr2 = new double[8];
        // char[] arr3 = new char[8];
        // String[] arr4 = new String[8];
        // String s = "Hello World";
        // arr4[0] = s;
        // passing array to methods
        int x[] = {1,2,3,4,5,6};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        x[2] = 99;
    }
}