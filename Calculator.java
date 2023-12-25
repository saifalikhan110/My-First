package OOP;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Calculator {


    void add(){

        Scanner ob=new Scanner (System.in);

        System.out.print("Enter Val 1");
        int val1=ob.nextInt();
        System.out.print("Enter Val2");
        int val2= ob.nextInt();

        System.out.println("Addition is : "+(val1+val2));


    }

    void sub(){

        Scanner ob=new Scanner (System.in);

        System.out.print("Enter Val 1");
        int val1=ob.nextInt();
        System.out.print("Enter Val2");
        int val2= ob.nextInt();

        System.out.println("Subtraction is : "+(val1-val2));


    }


    void mul(){

        Scanner ob=new Scanner (System.in);

        System.out.print("Enter Val 1");
        int val1=ob.nextInt();
        System.out.print("Enter Val2");
        int val2= ob.nextInt();

        System.out.println("Multiplication is : "+(val1*val2));


    }

    void div(){

        Scanner ob=new Scanner (System.in);

        System.out.print("Enter Val 1");
        int val1=ob.nextInt();
        System.out.print("Enter Val2");
        int val2= ob.nextInt();

        System.out.println("Division is : "+(val1/val2));


    }


    void rem(){

        Scanner ob=new Scanner (System.in);

        System.out.print("Enter Val 1");
        int val1=ob.nextInt();
        System.out.print("Enter Val2");
        int val2= ob.nextInt();

        System.out.println("Reminder is : "+(val1%val2));
    }




}


class CalculatorDemo{

    public static void main(String[] args) {


        Calculator obj1=new Calculator();

        obj1.add();


    }
}
