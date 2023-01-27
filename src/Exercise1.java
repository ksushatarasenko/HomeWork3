import java.util.Scanner;

public class Exercise1 {

//    Введите 2 слова, используйте сканер, состоящий из четного количества букв (проверьте количество букв в слове).
//    Получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.

    public static void main(String[] args) {
        String x = "";
        String y = "";

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите первое слово состоящее из четного количества букв");
        x = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите второе слово состоящее из четного количества букв");
        y = scanner2.nextLine();

        int text1 = x.length();
        int text2 = y.length();

        if (text1 %2 == 0 && text2%2 == 0) {

            System.out.println("Yes");
            String str = (x.substring(0,x.length()/2))+
                    (y.substring(y.length()/2, y.length()));
            System.out.println(str);

        } else {

            System.out.println(" No");

        }



    }
}