package OOP;


class Box6{

    int feet;
    int inch;

    Box6(int a,int b){

        feet=a;
        inch= b;

    }

    Box6(){

    }

    void show(){

        System.out.println("Feet : "+feet);
        System.out.println("Inch : "+inch);
    }

    Box6 add(Box6 ob){

        Box6 obj=new Box6();

        obj.feet=feet+ob.feet;
        obj.inch=inch+ob.inch;
        return obj;
    }

    Box6 add(Box6 ob1,Box6 ob2){

        Box6 obj=new Box6();

        obj.feet=ob1.feet+ob2.feet;
        obj.inch=ob1.inch+ob2.inch;
        return obj;
    }


}

public class MethodReturnObject1 {

    public static void main(String[] args) {


        Box6 obj1=new Box6(10,20);
        Box6 obj2=new Box6(30,50);

        Box6 obj3=obj1.add(obj1);

        Box6 obj4=obj2.add(obj1,obj2);

        obj4.show();


    }
}
