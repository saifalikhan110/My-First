package OOP;


class Addition{

    void add(int a,int b){

        System.out.println("Addition is : "+(a+b));
    }

    void add(int a,int b,int c){

        System.out.println("Additions : "+(a+b+c));
    }
}


public class Calculator_MethodOverloading {

    public static void main(String[] args) {

        Addition obj1=new Addition();
        obj1.add(2,2);

    }


}


