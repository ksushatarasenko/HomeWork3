public class Pizza {

  /*  Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см
   вы купите пиццу диаметром 28 см. Чтобы решить эту проблему,
    предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.*/

    public static void main(String[] args) {

    
    double radius1 = 12;
    double radius2 =14;


    double area1 = Math.PI * radius1 * radius1;
    double cal1=area1*40;


    double area2 = Math.PI * radius2 * radius2;
    double cal2=area2*40;


        double raznica =(cal2-cal1);
        System.out.println( "You will eat "+ Math.round(raznica)+" calories more");


  }
}