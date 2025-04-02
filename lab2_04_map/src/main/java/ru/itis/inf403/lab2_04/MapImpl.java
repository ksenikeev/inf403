package ru.itis.inf403.lab2_04;

public class MapImpl<K,V> implements  Map403<K,V> {

    private Node<K,V>[] array;

    private int size;

    private class Node<K,V> {
        Entry<K,V> value;
        Node<K,V> next;

        public Node(K key, V value) {
            this.value = new EntryImpl<>(key, value);
        }
    }

    class EntryImpl<K,V> implements Entry<K,V> {
        private K key;
        private V value;

        public EntryImpl(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }
    }

    public MapImpl(){
        array = new Node[16];
    }

    @Override
    public void put(K key, V value) {
        int index = Math.abs(key.hashCode() % 16);
        Node<K,V> temp = new Node<>(key,value);
        if (array[index] == null) {
            array[index] = temp;
        } else {
            Node current = array[index];
            while(current != null) {
                if(current.value.getKey().equals(key)) {
                    current.value.setValue(value);
                    return;
                }
                current = current.next;
            }
            current.next = temp;
        }
        size++;
    }


    @Override
    public V get(K key) {
        int index = Math.abs(key.hashCode() % 16);
        if (array[index] == null) {
            return null;
        }
        Node<K,V> current = array[index];
        while(current != null) {
            if(current.value.getKey().equals(key)) {
                return current.value.getValue();
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public Set403<K> keySet() {
        return null;
    }

    @Override
    public List403<V> values() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public void clear() {

    }
}
