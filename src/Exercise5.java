public class Exercise5 {


 /*   Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
    Реализуйте логический метод canBuy, возвращающий true / false
    Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
     Отобразите строку «Я могу купить еду, это ……» и значение.*/
    public static void main(String[] args) {

        boolean isEdekaOpen= true;
        boolean isReweOpen = true;
        boolean canBuy = true;


        if(isEdekaOpen || isReweOpen){

            canBuy = true;

            System.out.println(" Я могу купить еду, это true");
        }else {

            canBuy = false;

            System.out.println(false);
        }
    }
}
