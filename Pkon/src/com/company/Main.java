package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        System.out.println("----------  Заданеи Первое (4  Работа с консолью)  ----------");
	    System.out.println("*   *   *   *");
        System.out.println("*   *   *   *");
        System.out.println(" *    *    * ");
        System.out.println(" *    *    * ");
        System.out.println("  *   *   *  ");
        System.out.println("  *   *   *  ");
        System.out.println("    * * *    ");
        System.out.println("    *   *    ");
        System.out.println("----------  Заданеи Второе (1   Работа с консолью)  ----------");
        System.out.println("Silence is golden");

        System.out.println("----------  Заданеи Третье  (14 Простейшая арифметика)  ----------");
        int a = 0 , b = 2 , c = 5 ;
        System.out.println("a = " + a + "   b = " + b + "   c = " + c );
        int av = a + b , bv = c -a , cv = a + b + c ;
        System.out.println("a = " + av + "   b = " + bv + "   c = " + cv );
        System.out.println("----------  Заданеи Четвертое  (19 Простейшая арифметика)  ----------");

        int x = 732;
        String s = Integer.toString(x);

        int[] arr = new int[s.length()];

        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x /= 10;
        }
        int v = arr[2] ;
        arr[2] = arr[0] ;
        arr[0] = v ;
        System.out.println(Arrays.toString(arr));
        System.out.println("----------  Заданеи Пятое  (14 Условный оператор и арифметика)  ----------");

        int g1 = 111 ;
        int g2 = 243 ;
        int g3 = 531 ;
        System.out.println("Первое число = " + g1 + "   Второе число = " + g2 + "   Третье число = " + g3 );
        int max ;
        if ( g1 > g2 && g2> g3 ){
             max = g1 ;
        }
        else if ( g2 > g3 && g3> g1 ){
             max = g2 ;
        }
        else {
             max = g3 ;
        }
        System.out.println("Максимальное = " + max);

        System.out.println("----------  Заданеи Шестое  (3 Условный оператор и арифметика)  ----------");


            int Month=4;
            switch (Month) {
                case 2:  System.out.println("February");    break;
                case 3:  System.out.println("March");       break;
                case 4:  System.out.println("April");       break;
                case 5:  System.out.println("May");         break;
                case 6:  System.out.println("June");        break;
                case 7:  System.out.println("July");        break;
                case 8:  System.out.println("August");      break;
                case 9:  System.out.println("September");   break;
                case 10: System.out.println("October");     break;
                case 11: System.out.println("November");    break;
                case 12: System.out.println("December");    break;
                case 1:  System.out.println("January");     break;
                default: System.out.println("No number");   break;
            }

        System.out.println("----------  Заданеи Седьмое  (14 Циклы и арифметика)  ----------");
            int y = 2 ;
            int t , o = 0;
            String r = "";
            for (int j = 0 ; j < 7 ; j++)
            {
               t = y ;
               y++ ;
               t = t * 10 + y ;
               o = o + t ;
               r = r + t + " + ";

            }
            System.out.println( r + "910 = ");
            System.out.println(o + 910);

        System.out.println("----------  Заданеи Восьмое  (45 Циклы и арифметика)  ----------");


        Scanner in = new Scanner(System.in);

        int num = 6;
        int z;

        for ( int i = 1; i < num; i ++ )
        {
            if (num % i == 0){
                System.out.print(i + "  ");
            }
        }

        System.out.println();
        System.out.println("----------  Заданеи Девятое  (2 Работа с символами)  ----------");

        int j = 0 ;
        for(char i = 'a';i<='z';i++)
        {
            System.out.print(i);
            j++;
            if (j == 5){
                j = 0 ;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("----------  Заданеи Десятое  (5 Работа с символами)  ----------");

        double u = 3 + Math.random()* 7 ;
        u = (int) u;

        double h1,h2 ;
        h1 = h2 = 999 ;

        while ((int)h1 == (int)h2 ){
            h1 = Math.random()* u ;
            h2 = Math.random()* u ;
        }


        String n = "";
        for (int f = 0 ; f < u ; f++){
            if ( f == (int)h1 || f == (int)h2)
            {
                n = n + "!" ;
            }
            else {
                n = n + "r" ;
            }

        }
        System.out.println(n);
    }
}



