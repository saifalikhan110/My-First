package OOP;

class Programs{

    static  String grade(double per){

        if(per>=90&&per<=100){
            return "A1";}
        else if(per>=80){
            return "A";
        }
        else if(per>=70){
            return "B";
        }
        else if(per>=60){

            return "C";
        }
        else if(per>=50){
            return "D";
        }

        else if(per>=40){
            return "E";
        }

        return "Fail";

    }

    static  boolean isEven(int num){

        if(num%2==0){
            return true;
        }
        else {
            return false;
        }

    }
}

public class StaticMethod {

    public static void main(String[] args) {

        String grade=Programs.grade(55);

        System.out.println("Grade : "+grade);


        boolean b=Programs.isEven(2);

        System.out.println(b);





    }
}
