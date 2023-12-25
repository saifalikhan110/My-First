package OOP;

class Box2 {


    int feet;
    int inch;

    Box2(int f,int i){

        feet=f;
        inch=i;
    }


    void add(){

        System.out.println("Addition of Feet and Inch : "+(feet+inch));
    }

    void add(Box2 ob){

        System.out.println("Feet : "+(feet+ob.feet));
        System.out.println("Inch : "+(inch+ob.inch));
    }
    void add(Box2 obj1,Box2 obj2){

        System.out.println("Feet : "+(obj1.feet+obj2.feet));
        System.out.println("Inch : "+(obj1.inch=obj2.inch));
    }





}



class Ractangle{


    int x,y,w,h;

    Ractangle(int a,int b,int c,int d){

        x=a;
        y=b;
        w=c;
        h=d;
    }

    void add(){

        System.out.println("Addition is :"+(x+y+w+h));
    }

    void add(Ractangle obj){

        System.out.println("X : "+x+obj.x);
        System.out.println("Y : "+y+obj.y);
        System.out.println("W : "+w+obj.w);
        System.out.println("H : "+h+obj.h);
    }

    void add(Ractangle obj1,Ractangle obj2,Ractangle obj3,Ractangle obj4){

        System.out.println("X : "+(obj1.x+obj2.x+obj3.x+obj4.x));
        System.out.println("Y : "+(obj1.y+obj2.y+obj3.y+obj4.y));
        System.out.println("W : "+(obj1.w+obj2.w+obj3.w+obj4.w));
        System.out.println("H : "+(obj1.h+obj2.h+obj3.h+obj4.h));
    }
}
public class ObjectPassAsArgument {


    public static void main(String[] args) {
/*
        Box2 obj1=new Box2(5,5);

        Box2 obj2=new Box2(7,7);

        obj1.add(obj1,obj2);*/

        Ractangle obj1=new Ractangle(2,3,2,3);
        Ractangle obj2=new Ractangle(3,4,2,4);
        Ractangle obj3=new Ractangle(8,5,3,7);
        Ractangle obj4=new Ractangle(6,7,3,5);

        obj1.add();
        obj1.add(obj1);
        obj1.add(obj1,obj2,obj3,obj4);



    }
}
