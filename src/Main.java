public class Main {
    //otkat
    public static void main(String[] args) {

       int ticketPrice = 1835 ; // стоимость билета
        int bonusStep = 20 ; // шаг начисления бонусов
        int bonusMiles = ticketPrice / bonusStep ; // начисляется бонусных миль
        System.out.println("Вам начислено " + bonusMiles + " миль ") ;

    }
}