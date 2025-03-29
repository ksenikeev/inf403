package ru.itis.inf403.independentworks.iw1;

public class Struct3<T> {
    private T a;
    private T b;
    private T c;

    public Struct3(T[] array) {
        if (array == null || array.length != 3)
            throw new IndexOutOfBoundsException();
        a = array[0];
        b = array[1];
        c = array[2];
    }

    public T get(int index) {
        if (index < 0 || index > 2)
            throw new IndexOutOfBoundsException();
        return switch(index) {
            case 0 -> a;
            case 1 -> b;
            case 2 -> c;
            default -> null;
        };
    }

}
