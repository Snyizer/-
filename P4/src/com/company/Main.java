package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int i = scanner.nextInt();
        if (i < 100) {
            System.out.println("less");   // Первое задание
        }
        else {
            System.out.println("not less");
        }
         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое оценку: ");
        int i = scanner.nextInt();
        if (i == 5 ) {
            System.out.println("отлично");
        }else if (i == 4){
            System.out.println("хорошо");
        }else if (i == 3){
            System.out.println("удовлетворительно");
        }else if (i == 2){                             // Второе задание
            System.out.println("неудовлетворительно");
        }else {
            System.out.println("Что это за Ересь ?");
        }

         */

        /*

        System.out.print("Введите День Недели : ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();

        if (title.equals("воскресенье") )
        {
            System.out.println("0");
        }
        else if (title.equals("понедельник"))
        {
            System.out.println("1");
        }
        else if (title.equals("вторник"))
        {
            System.out.println("2");
        }
        else if (title.equals("среда"))
        {                                           // Третье
            System.out.println("3");
        }
        else if (title.equals("четверг"))
        {
            System.out.println("4");
        }
        else if (title.equals("пятница"))
        {
            System.out.println("5");
        }
        else if (title.equals("суббота"))
        {
            System.out.println("6");
        }
        else {
            System.out.println("День недели веден не верно !!!!");
        }


         */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваши баллы: ");
        int i = scanner.nextInt();
        if ( i > 91) {
            System.out.print("Ваща оценка = A " );
        }else if ( i >= 81){
            System.out.print("Ваща оценка = B" );   // Четвертое
        }else if ( i <= 80){
            System.out.print("Ваща оценка = F" );
        }else {
            System.out.println("Что это за Ересь ?");
        }
         */


        System.out.println("                 Задание 5.1         ");
        Double y ,  a = 1.1 , b = 3.6 , x1 = 4.23 , x2 = 0.93 ;
        Double x = x1 ;

        if (x <= 1)
        {
            y = a *  Math.pow(Math.sin( x +  Math.sqrt(x)) , 2 )  ;
        }
        else {
            y = b * Math.pow(Math.E , x * x ) ;
        }

        System.out.println("Значение при x1 = 4.23 : "+ y);
        x = x2 ;
        if (x <= 1)
        {
            y = a *  (Math.sin( x +  Math.sqrt(x)) * Math.sin( x +  Math.sqrt(x))) ;
        }
        else {
            y = b * Math.pow(Math.E , x * x ) ;
        }
        System.out.println("Значение при x1 = 0.93 : "+ y);
        System.out.println("                 Задание 5.2         ");
        a = 1.2 ; b = 2.5 ; x1 = -3.16 ; x2 = 4.16 ;
        Double x3 = 1.78 ;
        x = x1 ;
         if  ( x <= - 2) {
             y = 2 * Math.pow (Math.cos( a *  (x * x) - b) , 2) ;
         }
         else if ( x > 3 ){
             y = b * Math.sin( a / x) ;
         }
         else {
             Math.sqrt(x * x + Math.pow( Math.E , a * x )) ;
         }
        System.out.println("Значение при x1 = -3.16 : "+ y);
        x = x2 ;
        if  ( x <= - 2) {
            y = 2 * Math.pow (Math.cos( a *  (x * x) - b) , 2) ;
        }
        else if ( x > 3 ){
            y = b * Math.sin( a / x) ;
        }
        else {
            Math.sqrt(x * x + Math.pow( Math.E , a * x )) ;
        }
        System.out.println("Значение при x1 = 4.16 : "+ y);
        x = x2 ;
        if  ( x <= - 2) {
            y = 2 * Math.pow (Math.cos( a *  (x * x) - b) , 2) ;
        }
        else if ( x > 3 ){
            y = b * Math.sin( a / x) ;
        }
        else {
            Math.sqrt(x * x + Math.pow( Math.E , a * x )) ;
        }
        System.out.println("Значение при x1 = 1.78 : "+ y);


    }
}
