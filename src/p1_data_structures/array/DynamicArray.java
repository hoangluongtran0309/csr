package p1_data_structures.array;

import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T>, IDynamicArray<T> {

    T[] array;

    int size;

    int capacity;

    public DynamicArray() {
        this(10);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity must be not negative: " + capacity);
        }
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size();
            }

            @Override
            public T next() {
                return array[index++];
            }

        };
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, T value) {
        array[index] = value;
    }

    // O(n)
    @Override
    public void add(T element) {

        if (size >= capacity - 1) {

            if (capacity == 0) {

                capacity = 1;

            } else {

                capacity *= 2;
            
            }

            T[] newArray = (T[]) new Object[capacity];

            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            array = newArray;
        }

        array[size++] = element;

    }

    @Override
    public void removeAt(int removeIndex) {
        if(removeIndex>=size || removeIndex<0) throw new IndexOutOfBoundsException();

        T[] newArray = (T[]) new Object[size - 1];
        for(int i = 0, y = 0 ; i < size; i++, y++){
            if(i == removeIndex){
                y--;
            } else {
                newArray[y] = array[i]; 
            }
        }

        array = newArray;

        capacity = --size;
    }

    @Override
    public void remove(Object object) {
        int removeIndex = indexOf(object);
        removeAt(removeIndex);
    }

    @Override
    public int indexOf(Object object) {
        for(int i = 0; i < array.length; i++){
            if(object == null){
                if(array[i] == null) return i;
            } else {
                if(object.equals(array[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for(int i = 0; i < size - 1; i++){
                sb.append(array[i]).append(",");
            }
            sb.append(array[size - 1]).append("]");
            return sb.toString();
        }
    }

}
