public class ProgramArrayOutput {
    public static void main(String args[]) {
        // RGB = (0..255, 0..255, 0..255)
        int image1[] = { 0x12890F, 0x1627A3};

        int image2[] = new int[4];

        for (int i = 0; i < image1.length; ++i) {
            System.out.println( image1[i] );
        }

        int a = 0xA1190F;

        int r = (a & 0xFF0000) >> 16;
        int g = (a & 0xFF00) >> 8;
        int b = a & 0xFF;

        System.out.print("\u001b[38;2;" + r + ";" + g + ";" + b + "m");
        System.out.println("Hello");
/*

        String RESET = "\u001B[0m"; // Команда сброса к параметрам по умолчанию

        // Команда
        String RED = "\u001B[38;2;255;0;0m";
        String BLACK = "\u001B[38;2;0;0;0m";
        String GREEN = "\u001B[38;2;0;255;0m";
        String BLUE = "\u001B[38;2;0;0;255m";
        String WHITE = "\u001B[38;2;255;255;255m";

        // Символ, изображающий закрашенный прямоугольник
        String RECTANGLE = "\u2588"; //0xDB;

        System.out.print("\u001B[38;2;255;0;0m");

        System.out.println("Hello reds!");

        System.out.print(RECTANGLE);

        System.out.print(GREEN);

        System.out.print(RECTANGLE);

        System.out.print(BLUE);

        System.out.println(RECTANGLE);
        System.out.print("\u001B[0m");

*/


    }
}