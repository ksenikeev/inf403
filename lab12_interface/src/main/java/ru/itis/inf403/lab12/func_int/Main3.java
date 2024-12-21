package ru.itis.inf403.lab12.func_int;

public class Main3 {

    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                new Apple(110, "Семеринка")};

        AppleComparator comparator = new AppleComparator();

        ArrayUtils.sort(apples, comparator);
    }

    private static class AppleComparator implements ICompareObject {

        @Override
        public int compare(Object var1, Object var2) {
            return ((Apple) var1).getPrice() - ((Apple) var1).getPrice();
        }
    }
}
