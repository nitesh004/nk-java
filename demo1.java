
class Data
{
   private int  age;
   private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class demo1 {

    public static void main(String[] args) {
       Data d = new Data();
       d.setAge(19);
       d.setName("nitesh");
       int age =d.getAge();
       String name =d.getName();

    }
}
