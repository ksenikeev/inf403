package ru.itis.inf403.lab2_02.obj;

public interface List403 {
    /**
     * Метод добавляет элемент в конец списка
     * @param element
     */
    void add(Object element);

    /**
     * Метод добавляет элемент в указанную позицию
     * @param element
     */
    void add(Object element, int position) throws IndexOutOfBoundsException;

    /**
     * Удаляет элемент из списка в позиции position и возвращает его
     * @param position
     * @return
     */
    Object remove(int position) throws IndexOutOfBoundsException;

    /**
     * Возвращает размер списка
     * @return
     */
    int size();

    /**
     * Возвращает элемент по индексу
     * @param position
     * @return
     */
    Object get(int position) throws IndexOutOfBoundsException;
}
