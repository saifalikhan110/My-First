package OOP;


class School1{

    String name;
    String subject;
    String roll;


    //1st way of initialization
    School1(String n,String s,String r){

        name=n;
        subject=s;
        roll=r;
    }

    void set(String n ,String s,String r){
        name=n;
        subject=s;
        roll=r;
    }

    void show(){

        System.out.println("Name : "+name);
        System.out.println("Subject : "+subject);
        System.out.println(" Roll NO: "+roll);
    }

}

public class Innitailization_In_3ways {

    public static void main(String[] args) {

        School1 obj=new School1("Saif","Java ","2k22/IT/108");

        obj.show();

        obj.set("Naveed","Python","2k22/IT/94");


        obj.show();

    }
}
