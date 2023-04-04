class Sttudent{
    private  int age;
    private String name;
    public Sttudent(){
         this("nitesh",19);
          age =11;
          name= "Nitesh";


    }
    public Sttudent(int age){
        this();
        this.age=age;
        name="Suresh";
    }
    public Sttudent(String name, int age)
    {
        this.age=age;
        this.name=name;
    }

    void show()
    {
        System.out.print(age+" ");
        System.out.println(name);
    }
}
public class Construc {

    public static void main(String[] args) {
        Sttudent s1= new Sttudent();
        s1.show();
        Sttudent s2= new Sttudent(12);
        s2.show();
//        Sttudent s3= new Sttudent("Ramesh",13);
//        s3.show();
    }}
