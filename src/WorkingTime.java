import java.util.Scanner;

public class WorkingTime {
    public static void main(String[] args) {

        double n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please a number from 0 to 28800");
        n = scanner.nextDouble();

        double m =  n / 3600;
         int x=(int) m;
        System.out.println("==========");
        System.out.println(n + " seconds left");

        if (m>1) {
            System.out.println(x + " hours left");

        } else {
            System.out.println("less than an hour left");
        }
    }
}