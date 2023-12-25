package OOP;


class Box1 {


    int feet;
    int inch;

    Box1(int f,int i){
        feet=f;
        inch=i;
        System.out.println("Two Arguments Constructor..");

    }

    Box1(){

        feet=0;
        inch=0;

        System.out.println("No Arguments Constructor");
    }

    void show(){

        System.out.println("Feet : "+feet);
        System.out.println("Inch : "+inch);
    }

}

public class Constructor {

    public static void main(String[] args) {

        Box1 obj=new Box1(2,6);
        Box1 obj1=new Box1(4,8);
        Box1 obj2=new Box1(5,9);

        obj.show();
        obj.show();
        obj.show();


    }
}
