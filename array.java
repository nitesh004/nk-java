class clc
{
      static int add(int nums[])
{
    int result=0;
    for(int i:nums){
        result=result+i;

    }
    return result;
}
}
public class array {
    public static void main(String[] args) {
//        1d array
        int []val= new int[4];
        val[0]=1;
        val[1]=2;
        val[3]=4;
        val[2]=5;


//        System.out.println(a[0]);
//        2d arrary and jagged array
        int nums[][]={
                {1,2,3,5},{1,2,3},{5,6,7}
        };
//        for(int i=0;i<=2;i++)
//        {
//            for(int j=0;j<b[i].length;j++)
//            {
//                System.out.print(b[i][j]+" ");
//            }
//            System.out.println();
//        }
//       enhanced for loop
//        for(int a[]:nums)
//        {
//            for(int b:a)
//            {
//                System.out.print(b+" ");
//            }
//            System.out.println();
//        }
//        anonymous array
        clc obj = new clc();
       int result=obj.add(new int[]{1,2,3,4});
        System.out.println(result);
    }
}
