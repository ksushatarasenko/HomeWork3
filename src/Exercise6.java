import java.util.Scanner;

public class Exercise6 {

//    Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно,
//    если температура первой колбы выше 100 градусов, а температура второй колбы меньше 100 градусов.
//    Вы должны написать метод, который проверяет это устройство.
//    Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true или false.
    public static void main(String[] args) {

        double temperature1;
        double temperature2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature 1");
        temperature1 = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter temperature 1");
        temperature2 = scanner.nextDouble();




    if (temperature1 > 100 && temperature2 < 100){
        System.out.println("The device is working correctly");
        System.out.println("True");
   }else {
        System.out.println("The device does not work correctly");
        System.out.println("False");
    }

    }
}
