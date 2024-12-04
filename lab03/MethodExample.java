public class MethodExample {

    static int n = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 10; ++i) {
            n = 9;
        }

        n = inc(n);

        System.out.println(n);
    }

    static int inc(int arg) {
        arg++;
        return arg;
    }

/*

    ТипВозвращаемогоЗначения названиеМетода(ТипАргумента1 имяАргумента1, .... ) {
        // операторы метода

        return значение;
    }

    void имяМетода(ТипАргумента1 имяАргумента1, .... ) {

        return;
    }

    Модификаторы: public, private, protected

    static

 */

}