import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1= "School Master";
        String str2= "The Classroom";
        str1= str1.replace(" ","");
        str2= str2.replace(" ","");
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
//        System.out.println(arr1);
//        System.out.println(arr2);
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println(str1+" and "+str2 +" is anagram");
        }
        else {
            System.out.println(str1+" and "+str2 +" is  not anagram");
        }
    }
}
