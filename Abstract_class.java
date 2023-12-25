package OOP;

abstract class Animal1{

    abstract  void sound();
    void eyes(){

        System.out.println("Two Eyes");
    }
    void legs(){
        System.out.println("four legs");
    }
}
class Dog1 extends Animal1{


    void sound(){
        System.out.println("Bow Bow");
    }


}

class Cat extends  Animal1{

    void sound(){

        System.out.println("mew, meow");
    }
}

class Human1 extends Animal1{

    void sound(){

        System.out.println("Speaking in Natural Language");
    }
}

class Display3{

    static void show(Animal1 obj){

        obj.eyes();
        obj.sound();
        obj.legs();


    }
}

public class Abstract_class {

    public static void main(String[] args) {

        Dog1 d=new Dog1();
        Cat c=new Cat();
        Human1 h=new Human1();

        Animal1 a;// Reference Variable

        a=c;
        a.legs();
        a.sound();
        a.eyes();
        ///
        a=d;
        a.sound();
        a.eyes();
        a.legs();
        ///
        a=h;
        a.sound();
        a.eyes();
        a.legs();



    }
}
