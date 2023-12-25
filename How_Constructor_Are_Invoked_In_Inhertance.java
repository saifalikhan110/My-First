package OOP;


///   Super Keyword is Used

class A{
    int feet;
    int inch;

    A(){

        feet=0;
        inch=0;

        System.out.println("No Arguments Constructor..of A");
    }


    A(int len){

        feet=inch=len;
        System.out.println("One Arguments Constructor.. of A ");
    }

    A(int a,int b){

        feet=a;
        inch=b;

        System.out.println("Two Argument Constructor of A ");
    }

    void show(){

        System.out.println("Feet :"+feet);
        System.out.println("Inch :"+inch);
    }
}


class B extends  A{

            int width;
            B(){

                feet=0;
                inch=0;
                width=0;

                System.out.println("No Arguments Constructor... of B ");
            }

            B(int len){

                super(len);

                feet=inch=width=len;

                System.out.println("One Arguments Constructor of B");
            }

            B(int a,int b,int c){
                super(a,b);

                feet=a;

                inch=b;
                width=c;


                System.out.println("Three Arguments Constructor Of B ");
            }

            void show(){

                System.out.println("Feet : "+feet);
                System.out.println("inch : "+inch);
                System.out.println("Width : "+width);
            }




}

class C extends  B{

                int height;

                C(){
                    feet=0;
                    inch=0;
                    width=0;
                    height=0;

                    System.out.println("No Arguments Constructor of C ");

                }

                C(int len){

                    super(len);
                    feet=inch=width=height=len;

                    System.out.println("One Argument Constructor of C ");
                }

                C(int a,int b,int c,int d){

                    super(a,b,c);

                    feet=a;
                    inch=b;
                    width=c;
                    height=d;

                    System.out.println("Four Arguments Constructor of C ");

                }



                void show(){
                    System.out.println("Feet :"+feet);
                    System.out.println("inch :"+inch);
                    System.out.println("Widht :"+width);
                    System.out.println("Height :"+height);
                }

}


public class How_Constructor_Are_Invoked_In_Inhertance {

    public static void main(String[] args) {


        C obj1=new C(3,5,5,6);







    }
}
