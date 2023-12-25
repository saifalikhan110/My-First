package OOP;

class Box5{

        int feet;
        int inch;

        Box5(int a,int b){
            feet=a;
            inch=b;
        }


        void show(){

            System.out.println("Feet : "+feet);
            System.out.println("Inch : "+inch);
        }

}

class Display1{

    static Box5 add(Box5 obj1, Box5 obj2){

        Box5 ob=new Box5(0,0);

        ob.feet=obj1.feet+obj2.feet;
        ob.inch=obj1.inch+obj2.inch;

        return ob;
    }


}

public class MethodReturnObject {

    public static void main(String[] args) {

        Box5 obj=new Box5(10,5);
        Box5 obj1=new Box5(50,100);

        Box5 obj3=Display1.add(obj1,obj);

        Box5 obj4=Display1.add(obj1,obj);



        obj3.show();
        obj4.show();





    }
}
