import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class arrayc {
    public static void main(String[] args) {

//
//                int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//                int n = 6;
//
//                n = arr[arr[n] / 2];
//
//                System.out.println(arr[n] / 2);
//        int i[],j;
//        int a1[] = new int[10];
//
//        int a2[] = {1, 2, 3, 4, 5};
//
//        System.out.println(a1.length + " " + a2.length)
//                ;
//        int ar[] = new int [5];

//        System.out.print(ar);
//        int arrr[] = {1, 2, 3, 4, 5};
//
//        for ( int i = 0; i < arrr.length - 2; ++i)
//

//            System.out.println(arrr[i] + " ");
//
//        String s1 ="jain";
//         s1.concat("nk");
//        String s3= new String("jain");
//         s3= s3.concat("nk");
//
//        System.out.println(s1);
//        System.out.println(s1);
//        System.out.println(s3);
//       System.out.println(s3);
//        String s1="n";
//        String s5= "n"+"k"+"j";
//        String s2 ="k"+"j";
//        String s3= "n"+"k"+"j";
//        String s4= s1+s2;
//        System.out.println(s4.equals(s5));
//        String str = "nitesh kumnar jain";
//        System.out.println(str);
//       String s;
//       str = str.toUpperCase();
//        System.out.println(str);
//        System.out.println(str.toLowerCase(Locale.ROOT));
////        System.out.println(s);
//        System.out.println(str.length());
//        System.out.println(str.getBytes(StandardCharsets.UTF_8));
//        System.out.println(str.charAt(4));
//        System.out.println(str.chars());
//        System.out.println(str.substring(3,8));
//        System.out.println(str.lastIndexOf("N"));
//        String s = " SACHIN TENDULKAR    ";
//
//        int len= s.trim().length();
//
////        System.out.println(len);
//        String s= "Hello world"; s.trim();
//
//        int i = s.indexOf(" ");
//
//        System.out.println(i);
/
        String str = "Good"; //Line 3

        change(str); //Line 4

        System.out.println(str); //Line 5

    }

    private static void change(String s) {

        s.concat("_Morning"); //Line 9

    }

}

