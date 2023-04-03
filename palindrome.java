import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str ;
        System.out.println("Enter the a String");

        str=sc.next();
        System.out.println("we are checking the whether the given String is palindrome or not........!");
        String str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }

        if(str.equals(str1))
        {
            System.out.println(str+" is palindrome");
        }
        else {
            System.out.println(str+" is not palindrome");
        }
    }
}
