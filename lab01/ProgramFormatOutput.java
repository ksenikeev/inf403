public class ProgramFormatOutput {
    public static void main(String args[]) {

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



    }
}