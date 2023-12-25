package OOP;

class Test{

    final int num=10; //ok
    // print(num*num); Ok
    //num=50; Error

    //final int val;//error

 static  void sqrt(final  int num){
     int c=num*num;
     //num+=5; Error
     System.out.println(num+" : "+c);
 }
}

public class FinalKeyword {

    public static void main(String[] args) {

        Test.sqrt(5);

    }
}
