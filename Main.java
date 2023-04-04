class ThisKeyword {

    private int a = 4;

    private int b = 1;

    void getSum(int a, int b) {

        this.a = a;

        this.b = b;

        System.out.println(this.a + this.b);

    }

}



public class Main {

    public static void main(String args[]) {

        ThisKeyword T = new ThisKeyword();

        T.getSum(3, 5);
        int arr[] = new int [5];

        System.out.println(arr);
//        char array_variable [] = new char[10];
//
//        for (int i = 0; i < 10; ++i)
//
//        {
//
//            array_variable[i] = 'i';
//
//            System.out.print(array_variable[i] + "");
//
//
//        }
//        int array_variable[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
//
//        int sum = 0;
//
//        for (int i = 0; i < 3; ++i)
//        {
//            for (int j = 0; j <  3 ; ++j)
//            {
//                sum = sum + array_variable[i][j];
//
//        System.out.print(sum / 5);
//    }}
//    int g =3;
//        System.out.println(++g*8    );
//        int[] a= {0,2,4,1,3};
//
//        for(int i = 0; i < a.length; i++){
//
//            a[i] = a[(a[i] + 3) % a.length];
//            System.out.println(a[i]);}
//   String str="abcde";
//        System.out.println(str.substring(1,3));
//        String str1="one";
//        String str2="two";
//       str1= str1.concat(str2);
//        System.out.println(str1);
        System.out.println();

    }


}