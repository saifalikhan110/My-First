package OOP;

class A1{
    private  int   feet;
    private  int  inch;


    A1(){
        feet=0;
        inch=0;

        System.out.println("No Arguments Constructor..A");
    }
    A1(int len){
        feet=inch=len;
        System.out.println("One Arguments Constructor..A");
    }
    A1(int a,int b){
        feet=a;
        inch=b;
        System.out.println("Two Argument Constructor..A");
    }
    void show(){
        System.out.println("Feet :"+feet);
        System.out.println("Inch :"+inch);
    }
}

class B1 extends  A1{
    private  int width;
    B1(){

        width=0;
        System.out.println("No Arguments Constructor B");
    }
    B1(int len){
        super(len);

        width=len;
        System.out.println("One Arguments Constructor..B");
    }

    B1(int a,int b,int c){

        super(a,b);

        width=c;
        System.out.println("Three Arguments Constructor B");
    }

    void show(){

        super.show();

        System.out.println("Width : "+width);
    }


}

class C1 extends  B1{

    private  int height;
    C1(){
        height=0;
        System.out.println("No Argument Constructor.. C");
    }

    C1(int len){
        super(len);
        height=len;

        System.out.println("One Arguments Constructor C");
    }
    C1(int a,int b,int c,int d){

        super(a,b,c);
        height=d;
        System.out.println("Four Arguments Constructor C ");
    }

    void show(){
        super.show();

        System.out.println("Hight : "+height);
    }
}

public class PrivateModifier_In_Constructor {

    public static void main(String[] args) {
       // C1 obj=new C1(5);// For One Arguments Constructor

        C1 obj1=new C1(2,3,5,6);
       obj1.show();
    }
}
