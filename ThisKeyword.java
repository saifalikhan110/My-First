package OOP;



class Box4{


        int feet;
        int inch;
        Box4(int feet,int inch){

            this.feet=feet;
            this.inch=inch;

        }

        void show(){


            Display.add(this);
            Display.sub(this);
            Display.mul(this);

        }
}

class Box3{

        int feet;
        int inch;

        Box3(int feet,int inch){


            this.feet=feet;
            this.inch=inch;

        }

        void show(){

            System.out.println("Feet :"+feet );
            System.out.println("inch :"+inch);
        }
}

public class ThisKeyword {


    public static void main(String[] args) {


        Box3 obj=new Box3(2,2);

        Box4 obj1=new Box4(2,4);

        obj1.show();

    }
}

class Display{


    static  void add(Box4 obj){

        System.out.println("Additionis : "+(obj.feet+ obj.inch));
    }

    static  void sub(Box4 obj){

        System.out.println("Subtractions is : "+(obj.feet-obj.inch));


    }

    static void mul(Box4 obj){

        System.out.println("Multiplication is : "+(obj.feet*obj.inch));

    }
}