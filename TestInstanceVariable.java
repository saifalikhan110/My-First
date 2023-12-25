package OOP;


class School{

    String name ;
    String subject;
    String rollNo;
}

public class TestInstanceVariable {

    public static void main(String[] args) {


        School obj=new School();
        School obj1=new School();

        obj.name="Saif Ali ";
        obj.subject="Java";
        obj.rollNo="2k22/IT/108";

        obj1.name="Naveed ";
        obj1.subject="Python";
        obj1.rollNo="2k22/IT/94";

        System.out.println("Name : "+obj.name);
        System.out.println("Subject: "+obj.subject);
        System.out.println("Roll No  : "+obj.rollNo);

        System.out.println("Name : "+obj1.name);
        System.out.println("Subject: "+obj1.subject);
        System.out.println("Roll No  : "+obj1.rollNo);
    }








}
