package ru.itis.inf403.cw1;

public class Main {
    public static void main(String[] args) {
        var3();
    }
    public static void var2() {
        int a = 3;
        int b = a++ * a--;
        System.out.println(a & 4 * b | 5);

        a = 10;
        System.out.println(((a-- > 10) & (a++ < 20)) || !(a == 11));
    }

    public static void var1() {
        int a = 3;
        int b = a-- * a--;
        System.out.println(a ^ 3 + b | 7);

        a = 17;
        System.out.println(!(((a++ > 16) | (a-- < 20)) && (a == 17)));
    }

    public static void var3() {
        int a = 3;
        int b = a++ ^ a++;
        System.out.println(a & 3 / b | 5);

        a = 8;
        //System.out.println((a == a & 0xf) & (a++ < 9) || !(++a == 10));
    }

    public static void var4() {
        int a = 4;
        int b = a-- / a++;

        System.out.println(2 * a << b | 5);

        a = 7;
        //System.out.println((!(a == a | 0x7) | (a++ < 8) || (--a == 8)));
    }

    public static void var5() {
        int a = 4;
        int b = --a * a--;

        System.out.println( a-- >> 1 + 2 ^ b * 3);

        a = 3;
        //System.out.println(((5 | a == ~a & 0xf) | !(a < 9)) || !(--a % 2 == 1));
    }

    public static void var6() {
        int a = 5;
        int b = --a * a--;

        System.out.println( a-- >> 1 + 3 * b % 5);

        a = 3;
        //System.out.println((!(6 ^ a == ~(a++ << 1) & 6) | !(a < 4)) || !(a % 2 == 0));
    }

    public static void var7() {
        int a = 2;
        int b = a++ * a--;

        System.out.println( a ^ 7 + b % 3);

        a = 3;
        System.out.println((a++ > 15) & (a-- < 20) || !(a == 17));
    }

    public static void var8() {
        int a = 4;
        int b = a-- * 2;

        System.out.println( 2 * a << b & 3);

        a = 7;
        //System.out.println((~a) & 7 == a ^ 7) | (a++ < 8) || !(--a == 8));
    }

    public static void var9() {
        int a = 2;
        int b = a++ & a++;

        System.out.println( a ^ 3 + b ^ 5);

        a = 8;
        System.out.println(((a++== (byte) 8) & (a++ < 11) || !(--a == 10)));
    }

    public static void var10() {
        int a = 4;
        int b = a-- * a--;

        System.out.println( a & 7 + b | 4);

        a = 12;
        System.out.println(!(a-- > 11) & (a++ < 20) || (--a == 12));
    }
}
