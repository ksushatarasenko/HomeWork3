import java.util.Scanner;

public class Exercise2 {


    public static void main(String[] args) {

//        Реализовать программу, выводящую на экран результаты сложения, вычитания, умножения и деления двух чисел.
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double x = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите второе число");
        double y = scanner1.nextDouble();

        double sumResult = calculator.sum(x,y);
        System.out.println("Sum result number "+x+ " and "+y+ " = "+ sumResult);

        double subResult = calculator.sub(x,y);
        System.out.println("Sub result number "+x+ " and "+y+ " = "+ subResult);

        double multiplResult = calculator.multip(x,y);
        System.out.println("Multiplication result number "+x+ " and "+y+ " = "+ multiplResult);

        double divResult = calculator.div(x,y);
        System.out.println("Div result number "+x+ " and "+y+ " = "+ divResult);

    }
}

 class Calculator{

double x;
double y;

    public double sum(double x, double y){
        double resultsum = x+y;
        return resultsum;
    }


    public double sub(double x, double y) {
        double resultsub = x-y;
        return resultsub ;
    }

    public double multip(double x, double y){
            double resultmultip= x*y;
            return resultmultip;
    }

    public double div(double x, double y){
           double resultdiv=x/y;
            return resultdiv;
    }
}
