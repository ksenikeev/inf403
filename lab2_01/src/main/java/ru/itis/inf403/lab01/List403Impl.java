package ru.itis.inf403.lab01;

public class List403Impl implements List403 {
    private Integer [] values;
    private int size;

    public List403Impl(){
        this.values = new Integer[10];
        this.size = 0;
    }
    public void add(Integer element){
        if (size >= values.length) {
            grow();
        }
        values[size++] = element;

    }
    public void add(Integer element, int position) throws IndexOutOfBoundsException{
        if (position > size || position < 0){
            throw new IndexOutOfBoundsException();
        }
        if (size == values.length) {
            grow();
        }
        for (int i = size; i != position; i--) {
            values[i] = values[i-1];
        }
        values[position] = element;
        size++;
    }
    public Integer remove(int position) throws IndexOutOfBoundsException{
        if (position > size-1 || position < 0){
            throw new IndexOutOfBoundsException();
        }
        Integer temp = values[position];
        for (int i = position; i < size - 1 ; i++) {
            values[i] = values[i + 1];
        }
        size--;
        return temp;

    }
    public Integer get(int position) throws IndexOutOfBoundsException{
        if (position > size-1 || position < 0){
            throw new IndexOutOfBoundsException();
        }
        return values[position];
    }
    public void sort(boolean asc){

    }
    public int size(){
        return size;
    }

    private void grow() {
        Integer[] newValues = new Integer[(int) (size*1.5)];
        for (int i = 0; i < size; i++) {
            newValues[i] = values[i];
        }
        values = newValues;
    }

}
