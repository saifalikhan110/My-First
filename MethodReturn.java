package OOP;


class CalculatorRetMe{


    int add(int a,int b){

        int c=a+b;

        return c;

    }

    int sub(int a,int b){

        int c=a-b;

        return c;
    }

    int mul(int a,int b){


        int c=a*b;

        return c;
    }


    int div(int a,int b){

        int c=a/b;

        return c;
    }

}
public class MethodReturn {


    public static void main(String[] args) {

        CalculatorRetMe obj=new CalculatorRetMe();

        int result=obj.add(2,2);

        System.out.println(result);
    }


}
