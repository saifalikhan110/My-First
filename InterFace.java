package OOP;

interface Animal2{

    void sound();
    void legs();


}

class Cat1 implements Animal2{

    public void sound(){
        System.out.println("Meow Meow");
    }
    public void legs(){
        System.out.println("4 Legs");
    }
}

class Dog3 implements  Animal2{

    public void sound(){

        System.out.println("Bow Bow...");
    }

    public void legs(){
        System.out.println("4 Legs");
    }

}

class Display4{

    static  void show(Animal2 obj){

        obj.sound();

        obj.legs();
    }
}

public class InterFace {

    public static void main(String[] args) {


        Dog3 d=new Dog3();
        Cat1 c=new Cat1();

        Display4.show(d);
        Display4.show(c);




    }
}
