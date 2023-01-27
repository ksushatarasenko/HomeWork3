public class Exercise4 {

//    Создайте две переменные isWeekend и isRain. Создайте переменную canWalk, значение которой должно быть истинным,
//    если это выходной день (isWeekend=true) и не идет дождь (isRain=false).

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = true;


        if(isWeekend && !isRain){

            canWalk = true;

            System.out.println(true);
             }else {

            canWalk = false;

            System.out.println(false);
        }
    }
}
