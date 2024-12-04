import java.util.Scanner;

public class SwitchTest1 {
    public static void main(String[] args) {

        String direction = getDirection();

        //handleDirection(direction);
        System.out.println(directionMessage(direction));
    }

    public static String getDirection() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String directionMessage(String direction) {

        return switch (direction) {
            case "u" :
            case "U" :
                yield "direction U";
            case "d" :
            case "D" :
                yield "direction D";
            case "r" :
            case "R" :
                yield "direction R";
            case "l" :
            case "L" :
                yield "direction L";
            default:
                yield "null direction";
        };
    }

    public static void handleDirection(String direction) {
        switch (direction) {
            case "u" :
            case "U" :
                System.out.println("U"); break;
            case "d" :
            case "D" :
                System.out.println("D"); break;
            case "r" :
            case "R" :
                System.out.println("R"); break;
            case "l" :
            case "L" :
                System.out.println("L"); break;
            default:
                System.out.println("Повторите ввод!");
        }
    }
}
