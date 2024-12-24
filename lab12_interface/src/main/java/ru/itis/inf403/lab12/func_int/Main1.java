package ru.itis.inf403.lab12.func_int;

public class Main1 implements ICompareObject {

    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                            new Apple(110, "Семеринка")};

        Main1 main1 = new Main1();

        ArrayUtils.sort(apples, main1);
        System.out.println(Color.valueOf("red"));
        System.out.println(Color.red);
        System.out.println(Color.red.getCode());

    }


    @Override
    public int compare(Object var1, Object var2) {
        return ((Apple)var1).getPrice() - ((Apple)var1).getPrice();
    }

    enum Color {
        red(0xFF0000),
        green,
        black,
        blue,
        yellow;

        long code;

        Color() {}
        Color(long code) {
            this.code = code;
        }

        public long getCode() {
            return code;
        }
    }
}
