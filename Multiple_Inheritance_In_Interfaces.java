package OOP;

interface A_1{
    void a();
}

interface  B_1{

    void b();
}

interface  C_1{
    void c();

}

class ABC implements  A_1,B_1,C_1{
    public void a(){

        System.out.println("A");
    }
    public void b(){

        System.out.println("B");
    }

    public void c(){
        System.out.println("C");
    }
}

class  Display5{

    static  void show(A_1 a){
        a.a();
    }
    static  void show(B_1 b){
        b.b();
    }
    static void show(C_1 c){
        c.c();
    }
    static void show(ABC abc){

        abc.a();
        abc.b();
        abc.c();
    }

    }

public class Multiple_Inheritance_In_Interfaces {

    public static void main(String[] args) {

        ABC obj=new ABC();

        Display5.show((A_1) obj);
        Display5.show((B_1) obj);
        Display5.show(obj);


    }
}
