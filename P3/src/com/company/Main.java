package com.company;

public class Main {

    public static void main(String[] args) {
/*
        // char to String
            char ch = 'S' ;

        // c использованием класса Character
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        // с использованием операции добавления класса String
        String str = "" + ch;
        System.out.println(str);

        //с использованием массива
        String fromChar = new String(new char[] { ch });
        System.out.println(fromChar);

        // с использованием метода valueOf класса String
        String valueOfchar = String.valueOf(ch);
        System.out.println(valueOfchar);


     //    char to int
        char ch1 = '9';

        // c использованием метода getNumericValue
        // класса Character
        int i1 = Character.getNumericValue(ch1);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(ch1,10);
        System.out.println(i2);

       // int to long
        int iq = 2015;
        long l = (long) (iq);
        System.out.println(l);

      //  int to float
        int iw = 2015;
        float f = (float) (iw);
        System.out.println(f);

    //    long to int
        long le = 214748364;
        int i = (int) le;
        System.out.println(i);

     //   double to int
        double d = 3.14;
        int ir = (int) d;
        System.out.println(ir);
*/


        class Point {
            int x, y;

            /**
             * Конструктор принимает 2 аргумента,
             * которыми инициализирует поля объекта.
             */
            Point (int newx, int newy){
                x=newx;
                y=newy;
            }
        }

        System.out.println("----Первый--код-----");

        Point p1=new Point(2,3);
        Point p2=p1;
        Point p3=new Point(2,3);
        System.out.println(p1==p2);
        System.out.println(p1==p3);

        System.out.println("-----Второй--Код----");


        String s1 = "abc";
        String s2 = "abc";
        String s3 = "a"+"bc";
        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println("-----Третий--код----");

        String s1p = "abc";
        String s2p = "abc";
        String s3p = "a"+"bc";
        System.out.println(s1p == s2p);
        System.out.println(s1p == s3p);

    }
}
