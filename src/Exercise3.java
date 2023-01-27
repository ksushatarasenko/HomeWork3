import java.util.Scanner;

public class Exercise3 {
    // Реализовать метод, который конвертирует указанную сумму в евро в сумму в долларах США
    public static void main(String[] args) {

        Converter USD =  new Converter();

        Scanner valute = new Scanner(System.in);
        System.out.println(" Введите валюту в EUR");
        Double euro = valute.nextDouble();


        System.out.println(" Your amount  " + USD.convert(euro)+ " usd");

    }
}


class Converter {
    double usd;

    public double convert(double euro) {
        usd = euro * 1.087;
        return usd;
    }

}
