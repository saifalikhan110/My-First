package OOP;

public class Box {

    int feet;
    int inch;

    void set(int f,int i){

        feet=f;
        inch=i;

    }

    void show(){

        System.out.println("Feet : "+feet);
        System.out.println("Inch : "+inch);
    }

}


class BoxDemo{


    public static void main(String[] args) {


        Box obj=new Box();

        obj.set(12,33);

        obj.show();
    }
}
