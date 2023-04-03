public class ReverseString {
    public static void main(String[] args) {
        String st = "nitesh jain";
        String str= "";
//        for(int i=st.length()-1;i>=0;i--)
//
//        {
//            str= str+st.charAt(i);
//        }
        String arr[]= st.split(" ");

//        System.out.println(str);
//        for(int i=arr.length-1;i>=0;i--)
//
//        {
//            str= str+arr[i]+" ";
//        }
//        System.out.println(str);
        for(String str1 : arr)
        {
            for(int i=str1.length()-1;i>=0;i--)
            {
                str =str+str1.charAt(i);

            }
            str=str+" ";

        }
        System.out.println(str);

    }
}

