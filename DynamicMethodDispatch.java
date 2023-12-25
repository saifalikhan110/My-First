package OOP;

class Animal{// This is General Class

    void sound(){
        System.out.println("No Sound");
    }
    void legs(){

        System.out.println("4 Legs");
    }
    void eyes(){

        System.out.println("2 Eyes");
    }

}
class Dog extends Animal{

    void sound(){
        System.out.println("Bow Bow..");
    }

}

class Human extends  Animal{

    void sound(){

        System.out.println("Speaking in Natural Language");
    }

    void legs(){

        System.out.println("Two Legs");
    }
}

class Display2{

    static  void show(Animal obj){

        obj.sound();
        obj.eyes();
        obj.legs();
    }


}
public class DynamicMethodDispatch {

    public static void main(String[] args) {


        Dog d=new Dog();
        Human m=new Human();

        Display2.show(d);
        Display2.show(m);



    }
}
