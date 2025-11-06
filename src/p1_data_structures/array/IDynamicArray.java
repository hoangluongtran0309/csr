package p1_data_structures.array;

public interface IDynamicArray<T> {
    
    int size();

    boolean isEmpty();

    T get(int index);

    void set(int index, T value);

    void add(T element);

    void removeAt(int removeIndex);

    void remove(Object object);

    int indexOf(Object object);

    boolean contains(Object object);


}
