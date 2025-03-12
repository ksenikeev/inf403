package ru.itis.inf403.lab01;

public interface List403 {
    /**
     * Метод добавляет элемент в конец списка
     * @param element
     */
    void add(Integer element);

    /**
     * Метод добавляет элемент в указанную позицию
     * @param element
     */
    void add(Integer element, int position) throws IndexOutOfBoundsException;

    /**
     * Удаляет элемент из списка в позиции position и возвращает его
     * @param position
     * @return
     */
    Integer remove(int position) throws IndexOutOfBoundsException;

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
    Integer get(int position) throws IndexOutOfBoundsException;

    /**
     * Сортировка списка (acs = true - по возрастанию)
     */
    void sort(boolean asc);
}
