package ss10_dsa_list.bai_tap.array_list;

import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elements = new Object[capacity];
    }

    public int size() {
        return elements.length;
    }

    public E clone() {
        MyList<E> cloneList = new MyList<>();
        cloneList.size = size;
        cloneList.elements = Arrays.copyOf(elements, size);
        return (E) cloneList;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(3 / 2);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
        }
        return (E) elements[index];
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity <= 0) {
            throw new IllegalArgumentException();
        }
        int newSize = elements.length * minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i < 0 || i >= size()){
            throw new IndexOutOfBoundsException();
        } else {
            return (E) elements[i];
        }
    }

    public void clear() {
        for (int i = 0; i < size(); i++) {
            elements[i] = null;
        }
    }


    @Override
    public String toString() {
        return "MyList {elements= " + Arrays.toString(elements) + '}';
    }

}
